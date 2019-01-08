package com.bestpay.member.api;

import com.bestpay.member.exceptions.BusiException;
import com.bestpay.member.util.ResultInfo;

/**
 * Created by HYP on 2018/11/27.
 */
public interface IRightApi {
    public ResultInfo queryUserRightsAndRankByUserNo(String userNo) throws CloneNotSupportedException, BusiException;

    public ResultInfo queryRightInfoByRightId(Integer rightId, String userNo);

    public ResultInfo queryAllRight();
}
