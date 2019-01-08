package com.bestpay.member.api;

import com.bestpay.member.exceptions.BusiException;
import com.bestpay.member.util.ResultInfo;

/**
 * Created by HYP on 2018/11/28.
 */
public interface IMemberCenterApi {
    public ResultInfo queryMemberCenterByUserNo(String userNo) throws CloneNotSupportedException, BusiException;
}
