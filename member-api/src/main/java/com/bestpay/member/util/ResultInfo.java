package com.bestpay.member.util;

import com.bestpay.member.constant.MemberConstant;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by HYP on 2018/11/21.
 */
public class ResultInfo implements Serializable{
    private static final String TAG = "ResultInfo";
    private static final long serialVersionUID = -5337162979932731222L;

    private Integer code = MemberConstant.BUSI_SUCCESS_CODE;
    private String msg =   MemberConstant.BUSI_SUCESS_MSG;
    private Object data;

    public ResultInfo(){

    }


    public ResultInfo(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResultInfo pushData(Object data){
        this.setData(data);
        return this;
    }
    public ResultInfo pushDataAttr(String key,Object data){
        if(this.data == null){
            data = new HashMap<String,Object>();
        }
        if(data instanceof Map){
            ((Map) data).put(key,data);
        }
        return this;
    }
    public static ResultInfo OK() {
        return new ResultInfo(MemberConstant.BUSI_SUCCESS_CODE, MemberConstant.BUSI_SUCESS_MSG);
    }
    public static ResultInfo ERROR() {
        return new ResultInfo(MemberConstant.BUSI_FAILD_CODE, MemberConstant.BUSI_FALID_MSG);
    }

    @Override
    public String toString() {
        return "ResultInfo{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}