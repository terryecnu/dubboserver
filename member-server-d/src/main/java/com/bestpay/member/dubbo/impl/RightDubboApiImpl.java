package com.bestpay.member.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bestpay.member.api.IRightApi;
import com.bestpay.member.exceptions.BusiException;
import com.bestpay.member.util.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import com.bestpay.member.dubbo.impl.innerservice.IRightService;

/**
 * Created by HYP on 2018/11/27.
 */
@Service(version = "1.0.0")
public class RightDubboApiImpl implements IRightApi {

    @Autowired
    private IRightService rightService;

    @Override
    public ResultInfo queryUserRightsAndRankByUserNo(String userNo) throws CloneNotSupportedException, BusiException {
        return this.rightService.queryUserRightsAndRankByUserNo(userNo);
    }

    @Override
    public ResultInfo queryRightInfoByRightId(Integer rightId, String userNo) {
        return this.rightService.queryRightInfoByRightId(rightId, userNo);
    }

    @Override
    public ResultInfo queryAllRight() {
        return this.rightService.queryAllRight();
    }

    /*@Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private MemberRankMapper memberRankMapper;

    @Autowired
    private MemberRankContentMapper memberRankContentMapper;

    @Autowired
    private RightMapper rightMapper;

    @Override
    public ResultInfo queryUserRightsAndRankByUserNo(String userNo) throws CloneNotSupportedException {
        log.info("查询我的等级权益：------------》"+userNo);
        ResultInfo resultInfo = new ResultInfo();
        AssertUtil.isTrue(customerMapper.isUserExists(userNo)<1, MemberConstant.BUSI_FAILD_CODE,
                MemberConstant.USER_NOT_EXITS);
        Map map  = new HashMap();
        Customer customer = customerMapper.selectByUserNo(userNo);
        //查询所有的等级列表
        List<MemberRankDto> memberRankVos = memberRankMapper.selectAll();
        log.info("查询所有等级列表："+memberRankVos.toString());
        map.put("ranks",memberRankVos);

        //查询所有的中间表
        List<MemberRankContent> memberRankContents = memberRankContentMapper.selectAll();
        //查询所有的权益
        List<RightDto> rights = rightMapper.selectAll();

       Map<String,List<RightDto>> rightRes =new  LinkedHashMap<String, List<RightDto>>();
        for(MemberRankDto _memberRankDto : memberRankVos){
            //等级对应的权益项List
            List<RightDto> _memberRankDtoMap = new ArrayList<RightDto>();
            for(RightDto _right:rights){//所有权益
                //克隆所有权益 重写clone方法
                RightDto _rightCopy =  (RightDto)_right.clone();
                //当前等级有没有
                for(MemberRankContent _memberRankContents:memberRankContents) {//中间表
                   Integer rankId =  _memberRankContents.getMemberRankId();
                   Integer rightId = _memberRankContents.getBusiId();
                   Integer busiCode = _memberRankContents.getBusiCode();
                   //当前等级有次权益项就点亮
                    if(rankId.equals(_memberRankDto.getMemberRankId())&&rightId.equals(_rightCopy.getInsuranceCrmRightId())
                            &&busiCode == 1 ){
                        _rightCopy.setRankHave(true);
                        break;
                    }
                }
                _memberRankDtoMap.add(_rightCopy);
            }
            rightRes.put(_memberRankDto.getRankName(),_memberRankDtoMap);
        }
        log.info("查询我的权益-----------》"+rightRes.toString());
        map.put("rights",rightRes);
        resultInfo.setData(map);
        log.info("我的权益返回值：-----------》"+resultInfo.toString());
        return resultInfo;
    }

    @Override
    public ResultInfo queryRightInfoByRightId(Integer rightId,String userNo) {
        log.info("权益项ID："+rightId+"，用户编号："+userNo);
        ResultInfo resultInfo = new ResultInfo();
        RightInfoDto rightInfoDto = rightMapper.selectByRightId(rightId);
        log.info("当前权益项：" + rightInfoDto.toString());
        //查询用户所有权益
        List<RightDto> rightDtos = customerMapper.queryRightsByUserNo(userNo);
        if(!CollectionUtils.isEmpty(rightDtos) && rightInfoDto != null){
            for(RightDto temp: rightDtos){
                if(temp.getInsuranceCrmRightId() == rightInfoDto.getInsuranceCrmRightId()){
                    rightInfoDto.setUserHave(true);
                }
            }
        }
        resultInfo.setData(rightInfoDto);
        log.info("获取用户权益返回值：--------》"+resultInfo.toString());
        return resultInfo;
    }

    @Override
    public ResultInfo queryAllRight() {
        ResultInfo resultInfo = new ResultInfo();
        //获取所有的权益项
        List<RightDto> rights = rightMapper.selectAll();
        resultInfo.setData(rights);
        return resultInfo;
    }*/

}