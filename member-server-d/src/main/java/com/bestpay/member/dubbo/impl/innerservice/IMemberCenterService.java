package com.bestpay.member.dubbo.impl.innerservice;

import com.bestpay.member.exceptions.BusiException;
import com.bestpay.member.util.ResultInfo;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 16:28 2018/12/27
 */
public interface IMemberCenterService {
    /**
     * 通过用户编号获取会员中心的信息
     *
     * @param userNo
     * @return
     */
    public ResultInfo queryMemberCenterByUserNo(String userNo) throws CloneNotSupportedException, BusiException;
}
