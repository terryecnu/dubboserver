package com.bestpay.member.dubbo.impl.innerservice.impl;

import com.bestpay.member.constant.MemberConstant;
import com.bestpay.member.dto.MemberRankDto;
import com.bestpay.member.dto.RightDto;
import com.bestpay.member.dto.RightInfoDto;
import com.bestpay.member.dubbo.impl.innerservice.IRightService;
import com.bestpay.member.exceptions.BusiException;
import com.bestpay.member.mapper.CustomerMapper;
import com.bestpay.member.mapper.MemberRankContentMapper;
import com.bestpay.member.mapper.MemberRankMapper;
import com.bestpay.member.mapper.RightMapper;
import com.bestpay.member.po.Customer;
import com.bestpay.member.po.MemberRankContent;
import com.bestpay.member.util.AssertUtil;
import com.bestpay.member.util.ResultInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 16:39 2018/12/27
 */
@Slf4j
@Service
public class RightServiceImpl implements IRightService {
    private static final String TAG = "RightServiceImpl";

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private MemberRankMapper memberRankMapper;

    @Autowired
    private MemberRankContentMapper memberRankContentMapper;

    @Autowired
    private RightMapper rightMapper;

    private String url = "http://192.168.200.34:81/file/";

    @Override
    public ResultInfo queryUserRightsAndRankByUserNo(String userNo) throws CloneNotSupportedException, BusiException {
        //log.info("查询我的等级权益：------------》" + userNo);
        ResultInfo resultInfo = new ResultInfo();
        AssertUtil.isTrue(customerMapper.isUserExists(userNo) < 1, MemberConstant.BUSI_FAILD_CODE,
                MemberConstant.USER_NOT_EXITS);
        Map map = new HashMap();
        Customer customer = customerMapper.selectByUserNo(userNo);
        //查询所有的等级列表
        List<MemberRankDto> memberRankVos = memberRankMapper.selectAll();
        for (MemberRankDto temp : memberRankVos) {
            if (temp.getMemberRankId().intValue() == customer.getIdRank().intValue()) {
                temp.setUser(true);
            }
        }
        //log.info("查询所有等级列表：" + memberRankVos.toString());
        map.put("ranks", memberRankVos);

        //查询所有的中间表
        List<MemberRankContent> memberRankContents = memberRankContentMapper.selectAll();
        //查询所有的权益
        List<RightDto> rights = rightMapper.selectAll();

        Map<String, List<RightDto>> rightRes = new LinkedHashMap<String, List<RightDto>>();
        for (MemberRankDto _memberRankDto : memberRankVos) {
            //等级对应的权益项List
            List<RightDto> _memberRankDtoMap = new ArrayList<RightDto>();
            //所有权益
            for (RightDto _right : rights) {
                //克隆所有权益 重写clone方法
                RightDto _rightCopy = (RightDto) _right.clone();
                //当前等级有没有
                //中间表
                for (MemberRankContent _memberRankContents : memberRankContents) {
                    Integer rankId = _memberRankContents.getMemberRankId();
                    Integer rightId = _memberRankContents.getBusiId();
                    Integer busiCode = _memberRankContents.getBusiCode();
                    //当前等级有次权益项就点亮
                    if (rankId.equals(_memberRankDto.getMemberRankId()) && rightId.equals(_rightCopy.getInsuranceCrmRightId())
                            && busiCode == 1) {
                        _rightCopy.setRankHave(true);
                        break;
                    }
                }
                _memberRankDtoMap.add(_rightCopy);
            }
            rightRes.put(_memberRankDto.getRankName(), _memberRankDtoMap);
        }
        //log.info("查询我的权益-----------》" + rightRes.toString());
        map.put("rights", rightRes);
        resultInfo.setData(map);
        //log.info("我的权益返回值：-----------》" + resultInfo.toString());
        return resultInfo;
    }

    @Override
    public ResultInfo queryRightInfoByRightId(Integer rightId, String userNo) {
        //log.info("权益项ID：" + rightId + "，用户编号：" + userNo);
        ResultInfo resultInfo = new ResultInfo();
        RightInfoDto rightInfoDto = rightMapper.selectByRightId(rightId);
        //log.info("当前权益项：" + rightInfoDto.toString());
        //查询用户所有权益
        List<RightDto> rightDtos = customerMapper.queryRightsByUserNo(userNo);
        if (!CollectionUtils.isEmpty(rightDtos) && rightInfoDto != null) {
            for (RightDto temp : rightDtos) {
                if (temp.getInsuranceCrmRightId().intValue() == rightInfoDto.getInsuranceCrmRightId().intValue()) {
                    rightInfoDto.setUserHave(true);
                }
            }
        }
        resultInfo.setData(rightInfoDto);
        //log.info("获取用户权益返回值：--------》" + resultInfo.toString());
        return resultInfo;
    }

    @Override
    public ResultInfo queryAllRight() {
        ResultInfo resultInfo = new ResultInfo();
        //获取所有的权益项
        List<RightDto> rights = rightMapper.selectAll();
        resultInfo.setData(rights);
        return resultInfo;
    }
}  