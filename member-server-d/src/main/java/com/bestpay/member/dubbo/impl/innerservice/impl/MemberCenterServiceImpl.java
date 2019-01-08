package com.bestpay.member.dubbo.impl.innerservice.impl;

import com.bestpay.member.constant.MemberConstant;
import com.bestpay.member.dto.CustomerDto;
import com.bestpay.member.dto.ProductDto;
import com.bestpay.member.dto.RightDto;
import com.bestpay.member.dto.TaskDto;
import com.bestpay.member.exceptions.BusiException;
import com.bestpay.member.util.AssertUtil;
import com.bestpay.member.util.ResultInfo;
import com.bestpay.member.vo.RankNextNameAndNextValueVo;
import com.bestpay.member.dubbo.impl.innerservice.IMemberCenterService;
import com.bestpay.member.mapper.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 16:29 2018/12/27
 */
@Slf4j
@Service
public class MemberCenterServiceImpl implements IMemberCenterService {
    private static final String TAG = "MemberCenterServiceImpl";
    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private MemberRankMapper memberRankMapper;

    @Autowired
    private MemberRankContentMapper memberRankContentMapper;

    @Autowired
    private RightMapper rightMapper;

    @Autowired
    private TaskMapper taskMapper;

    @Autowired
    private CustomerTaskMapper customerTaskMapper;

    private String url = "http://192.168.200.34:81/file/";

    @Override
    public ResultInfo queryMemberCenterByUserNo(String userNo) throws CloneNotSupportedException, BusiException {
        //log.info("用户编号：----------------》" + userNo);
        ResultInfo resultInfo = new ResultInfo();
        Map res = new LinkedHashMap();
        AssertUtil.isTrue(customerMapper.isUserExists(userNo) < 1, MemberConstant.BUSI_FAILD_CODE,
                MemberConstant.USER_NOT_EXITS);
        CustomerDto customerDto = customerMapper.selectCustomerDtoByUserNo(userNo);
        //log.info("根据用户编号获取用户个人信息：------------》" + customerDto.toString());
        //根据用户当前成长值获取到下一等级的最小值
        RankNextNameAndNextValueVo rankNextNameAndNextValueVo = memberRankMapper.selectNextGrowthValueByUserGrowthValue(customerDto.getGrowthValue());

        //当前等级是否是最大等级
        if (null == rankNextNameAndNextValueVo) {
            customerDto.setNextRankName("顶级");
            //获取到最大等级的最大值
            Double maxValue = memberRankMapper.selectMaxRankMaxValue(customerDto.getIdRank());
            customerDto.setLessValue(maxValue - customerDto.getGrowthValue() <= 0 ? 0 : maxValue - customerDto.getGrowthValue());
            customerDto.setIsMaxRank(true);
        } else {
            customerDto.setLessValue(rankNextNameAndNextValueVo.getNextValue() - customerDto.getGrowthValue());
            customerDto.setNextRankName(rankNextNameAndNextValueVo.getNextName());
        }

        res.put("customerInfo", customerDto);
        //通过用户编号查询用户权益项
        List<RightDto> rights = customerMapper.queryRightsByUserNo(userNo);
        //查询所有的权益
        List<RightDto> basicRights = rightMapper.selectAll();
        //结果
        List<RightDto> rightDes = new ArrayList<RightDto>();
        if (rights.size() < MemberConstant.RIGHT_BASIC_COUNT) {
            for (RightDto rightBasicDto : basicRights) {
                RightDto _rightCopy = (RightDto) rightBasicDto.clone();
                for (RightDto right : rights) {
                    if (_rightCopy.getInsuranceCrmRightId().intValue() == right.getInsuranceCrmRightId().intValue()) {
                        _rightCopy.setUserHave(true);
                        break;
                    }
                }
                rightDes.add(_rightCopy);
            }

            /*//获取到用户权益基表IDS
            List<Integer> userRightsBasicIds = new ArrayList<Integer>();
            for (RightDto temp : rights) {
                userRightsBasicIds.add(temp.getRightOptions());
            }
            //获取全部的基本权益IDS 这里查询的是所有的暗的权益项图片  -  用户有的权益项 = 用户没有的权益（暗图片）
            List<RightDto> basicRights = customerMapper.queryAllBasicRights();
            List<Integer> basicRightIds = new ArrayList<Integer>();
            for (RightDto temp : basicRights) {
                basicRightIds.add(temp.getRightOptions());
            }
            //获取用户中不存在的权益排到后面
            List<Integer> diff = new ArrayList(basicRightIds);
            diff.removeAll(userRightsBasicIds);
            for (RightDto temp : basicRights) {
                for (Integer id : diff) {
                    if (temp.getRightOptions().intValue() == id.intValue()) {
                        //将不存在的用户权益加到后面
                        rights.add(temp);
                    }
                }
            }*/
        }
        //log.info("用户当前的权益项：-----------》" + rights.toString());
        res.put("rightList", rightDes);
        //任务
        List<TaskDto> taskDtos = taskMapper.selectMemberCenterTaskDtosByUserNo();
        //获取到任务的ID，根据ID去查询任务的完成度 一条签到  一条分享
        Integer signId = 0;
        Integer shareId = 0;
        if (!CollectionUtils.isEmpty(taskDtos) && taskDtos.size() == 2) {
            signId = taskDtos.get(0).getTaskId();
            shareId = taskDtos.get(1).getTaskId();
            //签到
            //先查询全部的任务数量
            if (taskDtos.get(0).getTotalCount() != 0 && taskDtos.get(0).getTotalCount() <= customerTaskMapper.selectShareOrSignUpTaskCountByType(signId, userNo, 0)) {
                taskDtos.get(0).setDown(true);
            } else {
                //查询当月任务完成数量
                if (taskDtos.get(0).getMonthCount() != 0 && taskDtos.get(0).getMonthCount() <= customerTaskMapper.selectShareOrSignUpTaskCountByType(signId, userNo, 1)) {
                    taskDtos.get(0).setDown(true);
                } else {
                    //查询当日任务数量
                    if (taskDtos.get(0).getDayCount() != 0 && taskDtos.get(0).getDayCount() <= customerTaskMapper.selectShareOrSignUpTaskCountByType(signId, userNo, 2)) {
                        taskDtos.get(0).setDown(true);
                    }
                }
            }
            //分享
            if (taskDtos.get(1).getTotalCount() != 0 && taskDtos.get(1).getTotalCount() <= customerTaskMapper.selectShareOrSignUpTaskCountByType(shareId, userNo, 0)) {
                taskDtos.get(1).setDown(true);
            } else {
                if (taskDtos.get(1).getMonthCount() != 0 && taskDtos.get(1).getMonthCount() <= customerTaskMapper.selectShareOrSignUpTaskCountByType(shareId, userNo, 1)) {
                    taskDtos.get(1).setDown(true);
                } else {
                    if (taskDtos.get(1).getDayCount() != 0 && taskDtos.get(1).getDayCount() <= customerTaskMapper.selectShareOrSignUpTaskCountByType(shareId, userNo, 2)) {
                        taskDtos.get(1).setDown(true);
                    }
                }
            }
        }

        //log.info("用户任务：----------------》" + taskDtos.toString());
        for (TaskDto _taskDto : taskDtos) {
            _taskDto.setImgUrl(url + _taskDto.getImgUrl());
        }
        res.put("tasks", taskDtos);
        List<ProductDto> productDtos = customerMapper.selectMemberCenterProductsByUserNo(userNo);
        for (ProductDto _productDto : productDtos) {
            _productDto.setProductImg(url + _productDto.getProductImg());
        }
        //log.info("用户推荐产品：-------------》" + productDtos.toString());
        res.put("products", productDtos);
        resultInfo.setData(res);
        return resultInfo;
    }
}