package com.bestpay.member.vo;

/**
 * Created by WDL on 2018/11/28.
 */
public class GrowthTransVo extends  BaseVo {
    private String  acctTransNo;
    private Integer  transType;//0--支出  1--收入
    private Double  transGrowthValue;//交易成长值
    private Integer  bpCode;//1--有效期  2--做任务
    private String  busiId;//任务id
    private Double thisAcctAmount;//当前账户成长值
    private String  transContext;//交易说明

    public String getAcctTransNo() {
        return acctTransNo;
    }

    public void setAcctTransNo(String acctTransNo) {
        this.acctTransNo = acctTransNo;
    }

    public Integer getTransType() {
        return transType;
    }

    public void setTransType(Integer transType) {
        this.transType = transType;
    }

    public Double getTransGrowthValue() {
        return transGrowthValue;
    }

    public void setTransGrowthValue(Double transGrowthValue) {
        this.transGrowthValue = transGrowthValue;
    }

    public Integer getBpCode() {
        return bpCode;
    }

    public void setBpCode(Integer bpCode) {
        this.bpCode = bpCode;
    }

    public String getBusiId() {
        return busiId;
    }

    public void setBusiId(String busiId) {
        this.busiId = busiId;
    }

    public Double getThisAcctAmount() {
        return thisAcctAmount;
    }

    public void setThisAcctAmount(Double thisAcctAmount) {
        this.thisAcctAmount = thisAcctAmount;
    }

    public String getTransContext() {
        return transContext;
    }
    public void setTransContext(String transContext) {
        this.transContext = transContext;
    }

	@Override
	public String toString() {
		return "GrowthTransVo [acctTransNo=" + acctTransNo + ", transType=" + transType + ", transGrowthValue="
				+ transGrowthValue + ", bpCode=" + bpCode + ", busiId=" + busiId + ", thisAcctAmount=" + thisAcctAmount
				+ ", transContext=" + transContext + "]";
	}
    
}