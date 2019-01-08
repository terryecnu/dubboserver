package com.bestpay.member.po;

import java.io.Serializable;
import java.util.Date;

public class GrowthValueTrans implements Serializable {
    private static final long serialVersionUID = -5084754526554257792L;
    /**
     * 账户交易id
     */
    private Integer acctTransId;

    /**
     * 账户交易编号
     */
    private String acctTransNo;

    /**
     * 用户id
     */
    private String userNo;

    /**
     * 交易类型
     */
    private Integer transType;

    /**
     * 交易状态
     */
    private String transStatus;

    /**
     * 交易时间
     */
    private Date transTime;

    /**
     * 交易金额
     */
    private Double transAmount;

    /**
     * 业务来源
     */
    private Integer bpCode;

    /**
     * 业务来源id
     */
    private String busiId;

    /**
     * 当前账户金额
     */
    private Double thisAcctAmount;

    /**
     * 交易说明
     */
    private String transContext;

    /**
     * 
     */
    private String createdBy;

    /**
     * 
     */
    private Date createdAt;

    /**
     * 
     */
    private String updatedBy;

    /**
     * 
     */
    private Date updatedAt;

    /**
     * 账户交易id
     * @return acct_trans_id 账户交易id
     */
    public Integer getAcctTransId() {
        return acctTransId;
    }

    /**
     * 账户交易id
     * @param acctTransId 账户交易id
     */
    public void setAcctTransId(Integer acctTransId) {
        this.acctTransId = acctTransId;
    }

    /**
     * 账户交易编号
     * @return acct_trans_no 账户交易编号
     */
    public String getAcctTransNo() {
        return acctTransNo;
    }

    /**
     * 账户交易编号
     * @param acctTransNo 账户交易编号
     */
    public void setAcctTransNo(String acctTransNo) {
        this.acctTransNo = acctTransNo == null ? null : acctTransNo.trim();
    }

    /**
     * 用户id
     * @return user_no 用户id
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * 用户id
     * @param userNo 用户id
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    /**
     * 交易类型
     * @return trans_type 交易类型
     */
    public Integer getTransType() {
        return transType;
    }

    /**
     * 交易类型
     * @param transType 交易类型
     */
    public void setTransType(Integer transType) {
        this.transType = transType;
    }

    /**
     * 交易状态
     * @return trans_status 交易状态
     */
    public String getTransStatus() {
        return transStatus;
    }

    /**
     * 交易状态
     * @param transStatus 交易状态
     */
    public void setTransStatus(String transStatus) {
        this.transStatus = transStatus == null ? null : transStatus.trim();
    }

    /**
     * 交易时间
     * @return trans_time 交易时间
     */
    public Date getTransTime() {
        return transTime;
    }

    /**
     * 交易时间
     * @param transTime 交易时间
     */
    public void setTransTime(Date transTime) {
        this.transTime = transTime;
    }

    /**
     * 交易金额
     * @return trans_amount 交易金额
     */
    public Double getTransAmount() {
        return transAmount;
    }

    /**
     * 交易金额
     * @param transAmount 交易金额
     */
    public void setTransAmount(Double transAmount) {
        this.transAmount = transAmount;
    }

    /**
     * 业务来源
     * @return bp_code 业务来源
     */
    public Integer getBpCode() {
        return bpCode;
    }

    /**
     * 业务来源
     * @param bpCode 业务来源
     */
    public void setBpCode(Integer bpCode) {
        this.bpCode = bpCode;
    }

    /**
     * 业务来源id
     * @return busi_id 业务来源id
     */
    public String getBusiId() {
        return busiId;
    }

    /**
     * 业务来源id
     * @param busiId 业务来源id
     */
    public void setBusiId(String busiId) {
        this.busiId = busiId == null ? null : busiId.trim();
    }

    /**
     * 当前账户金额
     * @return this_acct_amount 当前账户金额
     */
    public Double getThisAcctAmount() {
        return thisAcctAmount;
    }

    /**
     * 当前账户金额
     * @param thisAcctAmount 当前账户金额
     */
    public void setThisAcctAmount(Double thisAcctAmount) {
        this.thisAcctAmount = thisAcctAmount;
    }

    /**
     * 交易说明
     * @return trans_context 交易说明
     */
    public String getTransContext() {
        return transContext;
    }

    /**
     * 交易说明
     * @param transContext 交易说明
     */
    public void setTransContext(String transContext) {
        this.transContext = transContext == null ? null : transContext.trim();
    }

    /**
     * 
     * @return created_by 
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 
     * @param createdBy 
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * 
     * @return created_at 
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt 
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return updated_by 
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 
     * @param updatedBy 
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * 
     * @return updated_at 
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt 
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}