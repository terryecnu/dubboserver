package com.bestpay.member.constant;

/**
 * @author JingjingMa 2018-12-11
 * 枚举数据字典
 */
public class EnumDict {


    /**
     * 用户类型
     */
    public enum UserType{
        YiPay(1,"翼支付")
        ;
        private int val;
        private String msg;

        UserType(int val,String msg) {
            this.val = val;
            this.msg = msg;
        }

        public int getVal() {
            return val;
        }

        public String getMsg() {
            return msg;
        }
    }

    /**
     * 交易类型
     */
    public enum TransType{
        insure(1,"投保")
        ;
        private int val;
        private String msg;

        TransType(int val,String msg) {
            this.val = val;
            this.msg = msg;
        }

        public int getVal() {
            return val;
        }

        public String getMsg() {
            return msg;
        }
    }

    /**
     * 交易状态
     */
    public enum TransStatus{
        success(1,"投保成功")
        ;
        private int val;
        private String msg;

        TransStatus(int val,String msg) {
            this.val = val;
            this.msg = msg;
        }

        public int getVal() {
            return val;
        }

        public String getMsg() {
            return msg;
        }
    }


}
