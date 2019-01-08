package com.bestpay.member.vo;

import com.bestpay.member.po.MemberRank;

/**
 * Created by HYP on 2018/11/27.
 */
public class MemberRankVo extends MemberRank{
    private static final String TAG = "MemberRankVo";

    private boolean isUser = false;

    public boolean isUser() {
        return isUser;
    }

    public void setIsUser(boolean user) {
        isUser = user;
    }
}