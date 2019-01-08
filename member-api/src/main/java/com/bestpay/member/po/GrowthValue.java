package com.bestpay.member.po;

import java.io.Serializable;
import java.util.Date;

public class GrowthValue implements Serializable {
    private static final long serialVersionUID = 3377581051876007754L;
    /**
     * 账户id
     */
    private Integer acctId;

    /**
     * 账户状态
     */
    private Integer acctStatus;

    /**
     * 
     */
    private Integer userType;

    /**
     * 用户id
     */
    private String userNo;

    /**
     * 成长值
     */
    private Double acctAmount;

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
     * 账户id
     * @return acct_id 账户id
     */
    public Integer getAcctId() {
        return acctId;
    }

    /**
     * 账户id
     * @param acctId 账户id
     */
    public void setAcctId(Integer acctId) {
        this.acctId = acctId;
    }

    /**
     * 账户状态
     * @return acct_status 账户状态
     */
    public Integer getAcctStatus() {
        return acctStatus;
    }

    /**
     * 账户状态
     * @param acctStatus 账户状态
     */
    public void setAcctStatus(Integer acctStatus) {
        this.acctStatus = acctStatus;
    }

    /**
     * 
     * @return user_type 
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 
     * @param userType 
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
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
     * 成长值
     * @return acct_amount 成长值
     */
    public Double getAcctAmount() {
        return acctAmount;
    }

    /**
     * 成长值
     * @param acctAmount 成长值
     */
    public void setAcctAmount(Double acctAmount) {
        this.acctAmount = acctAmount;
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