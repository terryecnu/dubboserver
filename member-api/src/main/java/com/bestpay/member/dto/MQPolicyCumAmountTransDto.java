package com.bestpay.member.dto;

import lombok.Data;

/**
 * 消息队列（保费交易数据）模型转换对象
 */
@Data
public class MQPolicyCumAmountTransDto {

//    字段	含义	类型	长度	必填	备注
//    customerNo	翼支付客户号	n		M
//    phoneNo	手机号	n		M
//    productNo	产品号	n		M
//    orderAmt	订单金额	n		M
//    orderSeq	甜橙保险订单号	n		M
//    merchantId	商户号	n		M
//    cardNo	身份证号	n		M
//    channelCode	渠道号	n/an		M
//    referrerPhone	    推荐人手机号	n		O
//    orderStatus	订单状态			M
//    policyNo	保单号	n		M
//    endTime	保单止期	n		M	格式：yyyy-MM-dd
//
//    agentMerchantCode	代理商编号	n		M

    private String customerNo;
    private String phoneNo;
    private String productNo;
    private String orderAmt;
    private String orderSeq;
    private String merchantId;
    private String cardNo;
    private String channelCode;
    private String referrerPhone;
    private String orderStatus;
    private String policyNo;
    private String endTime;
    private String agentMerchantCode;


}
