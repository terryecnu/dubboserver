package com.bestpay.member.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PolicyCumAmountTrans implements Serializable {
    private static final long serialVersionUID = 7418192076527968526L;
    /**
     * 账户交易id
     */
    private Integer acctTransId;

    /**
     * 账户id
     */
    private String acctId;

    /**
     * 账户交易编号
     */
    private String acctTransNo;

    /**
     * 用户类型
     */
    private Short userType;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 交易类型
     */
    private Short transType;

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
    private BigDecimal transAmount;

    /**
     * 业务来源
     */
    private String bpCode;

    /**
     * 业务来源id
     */
    private String busiId;

    /**
     * 当前账户金额
     */
    private BigDecimal thisAcctAmount;

    /**
     * 交易说明
     */
    private String transContext;

    /**
     * 生效日期
     */
    private Date effDate;

    /**
     * 失效日期
     */
    private Date endDate;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 修改人
     */
    private String updatedBy;

    /**
     * 修改时间
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
     * 账户id
     * @return acct_id 账户id
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * 账户id
     * @param acctId 账户id
     */
    public void setAcctId(String acctId) {
        this.acctId = acctId == null ? null : acctId.trim();
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
     * 用户类型
     * @return user_type 用户类型
     */
    public Short getUserType() {
        return userType;
    }

    /**
     * 用户类型
     * @param userType 用户类型
     */
    public void setUserType(Short userType) {
        this.userType = userType;
    }

    /**
     * 用户id
     * @return user_id 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 交易类型
     * @return trans_type 交易类型
     */
    public Short getTransType() {
        return transType;
    }

    /**
     * 交易类型
     * @param transType 交易类型
     */
    public void setTransType(Short transType) {
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
    public BigDecimal getTransAmount() {
        return transAmount;
    }

    /**
     * 交易金额
     * @param transAmount 交易金额
     */
    public void setTransAmount(BigDecimal transAmount) {
        this.transAmount = transAmount;
    }

    /**
     * 业务来源
     * @return bp_code 业务来源
     */
    public String getBpCode() {
        return bpCode;
    }

    /**
     * 业务来源
     * @param bpCode 业务来源
     */
    public void setBpCode(String bpCode) {
        this.bpCode = bpCode == null ? null : bpCode.trim();
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
    public BigDecimal getThisAcctAmount() {
        return thisAcctAmount;
    }

    /**
     * 当前账户金额
     * @param thisAcctAmount 当前账户金额
     */
    public void setThisAcctAmount(BigDecimal thisAcctAmount) {
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
     * 生效日期
     * @return eff_date 生效日期
     */
    public Date getEffDate() {
        return effDate;
    }

    /**
     * 生效日期
     * @param effDate 生效日期
     */
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    /**
     * 失效日期
     * @return end_date 失效日期
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 失效日期
     * @param endDate 失效日期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 创建人
     * @return created_by 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 创建人
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * 创建时间
     * @return created_at 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 创建时间
     * @param createdAt 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 修改人
     * @return updated_by 修改人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 修改人
     * @param updatedBy 修改人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * 修改时间
     * @return updated_at 修改时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 修改时间
     * @param updatedAt 修改时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}