package com.bestpay.member.util;

import com.bestpay.member.exceptions.BusiException;

/**
 * Created by HYP on 2018/11/21.
 */
public class AssertUtil {
    public static void isTrue(boolean flag, Integer code, String msg) throws BusiException {
        if(flag){
            throw new BusiException(code,msg);
        }
    }
}