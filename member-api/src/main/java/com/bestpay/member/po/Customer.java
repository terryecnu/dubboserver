package com.bestpay.member.po;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable{
    private static final long serialVersionUID = 9130081553612869224L;
    /**
     * 管理id
     */
    private Integer crmId;

    /**
     * 用户id
     */
    private String userNo;

    /**
     * 身份证
     */
    private String idNumber;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 性别  1男  2女
     */
    private Integer gender;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 头像
     */
    private String headImg;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 注册时间 
     */
    private Date registerTime;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 成长值
     */
    private Double growthValue;

    /**
     * 健康档案
     */
    private Integer heathFile;

    /**
     * 
     */
    private Integer idRank;

    /**
     * 等级项
     */
    private Integer idRight;

    /**
     * 渠道号 1.微信 2.支付宝 3.翼支付 4.pc
     */
    private Integer lastDeviceType;

    /**
     * 用户管理状态，提交审核 修改 删除
     */
    private Integer status;

    /**
     * 系统创建时间
     */
    private Date createdAt;

    /**
     * 最新更新时间
     */
    private Date updatedAt;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 最近更新人
     */
    private String updatedBy;

    /**
     * 该用户的成长值倍率
     */
    private Double growthRate;

    /**
     * 是否是生日倍率
     */
    private Integer isBirthdayRate;

    /**
     * 保费
     */
    private Double acctAmount;

    /**
     * 保单数量
     */
    private Integer insuranceNumber;

    private Date idRankAt;
    

    public Date getIdRankAt() {
		return idRankAt;
	}

	public void setIdRankAt(Date idRankAt) {
		this.idRankAt = idRankAt;
	}

	/**
     * 管理id
     * @return crm_id 管理id
     */
    public Integer getCrmId() {
        return crmId;
    }

    /**
     * 管理id
     * @param crmId 管理id
     */
    public void setCrmId(Integer crmId) {
        this.crmId = crmId;
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
     * 身份证
     * @return id_number 身份证
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 身份证
     * @param idNumber 身份证
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    /**
     * 真实姓名
     * @return real_name 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 真实姓名
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 性别  1男  2女
     * @return gender 性别  1男  2女
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 性别  1男  2女
     * @param gender 性别  1男  2女
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 昵称
     * @return nick_name 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 昵称
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 头像
     * @return head_img 头像
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 头像
     * @param headImg 头像
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }

    /**
     * 生日
     * @return birthday 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 生日
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 注册时间 
     * @return register_time 注册时间 
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * 注册时间 
     * @param registerTime 注册时间 
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * 手机号
     * @return phone_number 手机号
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 手机号
     * @param phoneNumber 手机号
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * 成长值
     * @return growth_value 成长值
     */
    public Double getGrowthValue() {
        return growthValue;
    }

    /**
     * 成长值
     * @param growthValue 成长值
     */
    public void setGrowthValue(Double growthValue) {
        this.growthValue = growthValue;
    }

    /**
     * 健康档案
     * @return heath_file 健康档案
     */
    public Integer getHeathFile() {
        return heathFile;
    }

    /**
     * 健康档案
     * @param heathFile 健康档案
     */
    public void setHeathFile(Integer heathFile) {
        this.heathFile = heathFile;
    }

    /**
     * 
     * @return id_rank 
     */
    public Integer getIdRank() {
        return idRank;
    }

    /**
     * 
     * @param idRank 
     */
    public void setIdRank(Integer idRank) {
        this.idRank = idRank;
    }

    /**
     * 等级项
     * @return id_right 等级项
     */
    public Integer getIdRight() {
        return idRight;
    }

    /**
     * 等级项
     * @param idRight 等级项
     */
    public void setIdRight(Integer idRight) {
        this.idRight = idRight;
    }

    /**
     * 渠道号 1.微信 2.支付宝 3.翼支付 4.pc
     * @return last_device_type 渠道号 1.微信 2.支付宝 3.翼支付 4.pc
     */
    public Integer getLastDeviceType() {
        return lastDeviceType;
    }

    /**
     * 渠道号 1.微信 2.支付宝 3.翼支付 4.pc
     * @param lastDeviceType 渠道号 1.微信 2.支付宝 3.翼支付 4.pc
     */
    public void setLastDeviceType(Integer lastDeviceType) {
        this.lastDeviceType = lastDeviceType;
    }

    /**
     * 用户管理状态，提交审核 修改 删除
     * @return status 用户管理状态，提交审核 修改 删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 用户管理状态，提交审核 修改 删除
     * @param status 用户管理状态，提交审核 修改 删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 系统创建时间
     * @return created_at 系统创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 系统创建时间
     * @param createdAt 系统创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 最新更新时间
     * @return updated_at 最新更新时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 最新更新时间
     * @param updatedAt 最新更新时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
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
     * 最近更新人
     * @return updated_by 最近更新人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 最近更新人
     * @param updatedBy 最近更新人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * 该用户的成长值倍率
     * @return growth_rate 该用户的成长值倍率
     */
    public Double getGrowthRate() {
        return growthRate;
    }

    /**
     * 该用户的成长值倍率
     * @param growthRate 该用户的成长值倍率
     */
    public void setGrowthRate(Double growthRate) {
        this.growthRate = growthRate;
    }

    /**
     * 是否是生日倍率
     * @return is_birthday_rate 是否是生日倍率
     */
    public Integer getIsBirthdayRate() {
        return isBirthdayRate;
    }

    /**
     * 是否是生日倍率
     * @param isBirthdayRate 是否是生日倍率
     */
    public void setIsBirthdayRate(Integer isBirthdayRate) {
        this.isBirthdayRate = isBirthdayRate;
    }

    /**
     * 保费
     * @return acct_amount 保费
     */
    public Double getAcctAmount() {
        return acctAmount;
    }

    /**
     * 保费
     * @param acctAmount 保费
     */
    public void setAcctAmount(Double acctAmount) {
        this.acctAmount = acctAmount;
    }

    /**
     * 保单数量
     * @return insurance_number 保单数量
     */
    public Integer getInsuranceNumber() {
        return insuranceNumber;
    }

    /**
     * 保单数量
     * @param insuranceNumber 保单数量
     */
    public void setInsuranceNumber(Integer insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
}