package com.bestpay.member.dubbo.impl.innerservice;

import com.bestpay.member.exceptions.BusiException;
import com.bestpay.member.util.ResultInfo;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 16:39 2018/12/27
 */
public interface IRightService {
    /**
     * 通过用户编号获取用户等级以及权益
     *
     * @param userNo
     * @return
     * @throws CloneNotSupportedException
     */
    public ResultInfo queryUserRightsAndRankByUserNo(String userNo) throws CloneNotSupportedException, BusiException;

    /**
     * 获取用户权益以及所有的权益详情信息
     *
     * @param rightId
     * @param userNo
     * @return
     */
    public ResultInfo queryRightInfoByRightId(Integer rightId, String userNo);

    /**
     * 获取所有的权益名称，图片等基本轮播信息
     *
     * @return
     */
    public ResultInfo queryAllRight();
}
