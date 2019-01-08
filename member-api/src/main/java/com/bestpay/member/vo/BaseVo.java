package com.bestpay.member.vo;

import java.io.Serializable;

/**
 * Created by WDL on 2018/11/22.
 */
public class BaseVo implements Serializable{
    private static final String TAG = "BaseVo";
    private static final long serialVersionUID = -5956662976581979655L;
    private String userNo;
    public String getUserNo() {
        return userNo;
    }
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    @Override
    public String toString() {
        return "BaseVo{" +
                "userNo='" + userNo + '\'' +
                '}';
    }
}