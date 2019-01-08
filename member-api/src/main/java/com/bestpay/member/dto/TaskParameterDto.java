package com.bestpay.member.dto;


import java.util.Date;
import java.io.Serializable;

/**
 * 
 * @author ry-liuzb
 * 
 */
public class TaskParameterDto implements Serializable {

	private static final long serialVersionUID = 1L;
    
	/**
	 * 任务id
	 */
	private Integer taskId;
	/**
	 * 每天可完成次数（0 为不受限制）
	 */
	private Integer dayNumber;
	/**
	 * 月可完成次数（0 为不受限制）
	 */
	private Integer monthNumber;
	/**
	 * 成长值
	 */
	private Integer value;
	/**
	 * 任务行为类型
	 */
	private Integer taskActType;
	/**
	 * 购买保单类型
	 */
	private Integer purchasePolicyType;
	/**
	 * 限制保单类型
	 */
	private Integer insuranceType;
	/**
	 * 保费
	 */
	private Integer premium;
	/**
	 * 保单数
	 */
	private Integer insuranceNumber;
	/**
	 * 分享类型
	 */
	private Integer shareType;
	/**
	 * 活动类型
	 */
	private Integer activityType;
	/**
	 * 最多能完成多少次（0为不受限制）
	 */
	private Integer maxNumber;
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
	 * 是否有效
	 */
	private Integer isInvalid;
    
	private Long id;

	

    
    
   
    
	/**
	 * 
	 * @return 任务id
	 */
	public Integer getTaskId() {
	    return this.taskId;
	}
		
	/**
	 * 
	 * @param taskId 任务id
	 */
	public void setTaskId(Integer taskId) {
	    this.taskId = taskId;
	}
	/**
	 * 
	 * @return 每天可完成次数（0 为不受限制）
	 */
	public Integer getDayNumber() {
	    return this.dayNumber;
	}
		
	/**
	 * 
	 * @param dayNumber 每天可完成次数（0 为不受限制）
	 */
	public void setDayNumber(Integer dayNumber) {
	    this.dayNumber = dayNumber;
	}
	/**
	 * 
	 * @return 月可完成次数（0 为不受限制）
	 */
	public Integer getMonthNumber() {
	    return this.monthNumber;
	}
		
	/**
	 * 
	 * @param monthNumber 月可完成次数（0 为不受限制）
	 */
	public void setMonthNumber(Integer monthNumber) {
	    this.monthNumber = monthNumber;
	}
	/**
	 * 
	 * @return 成长值
	 */
	public Integer getValue() {
	    return this.value;
	}
		
	/**
	 * 
	 * @param value 成长值
	 */
	public void setValue(Integer value) {
	    this.value = value;
	}
	/**
	 * 
	 * @return 任务行为类型
	 */
	public Integer getTaskActType() {
	    return this.taskActType;
	}
		
	/**
	 * 
	 * @param taskActType 任务行为类型
	 */
	public void setTaskActType(Integer taskActType) {
	    this.taskActType = taskActType;
	}
	/**
	 * 
	 * @return 购买保单类型
	 */
	public Integer getPurchasePolicyType() {
	    return this.purchasePolicyType;
	}
		
	/**
	 * 
	 * @param purchasePolicyType 购买保单类型
	 */
	public void setPurchasePolicyType(Integer purchasePolicyType) {
	    this.purchasePolicyType = purchasePolicyType;
	}
	/**
	 * 
	 * @return 限制保单类型
	 */
	public Integer getInsuranceType() {
	    return this.insuranceType;
	}
		
	/**
	 * 
	 * @param insuranceType 限制保单类型
	 */
	public void setInsuranceType(Integer insuranceType) {
	    this.insuranceType = insuranceType;
	}
	/**
	 * 
	 * @return 保费
	 */
	public Integer getPremium() {
	    return this.premium;
	}
		
	/**
	 * 
	 * @param premium 保费
	 */
	public void setPremium(Integer premium) {
	    this.premium = premium;
	}
	/**
	 * 
	 * @return 保单数
	 */
	public Integer getInsuranceNumber() {
	    return this.insuranceNumber;
	}
		
	/**
	 * 
	 * @param insuranceNumber 保单数
	 */
	public void setInsuranceNumber(Integer insuranceNumber) {
	    this.insuranceNumber = insuranceNumber;
	}
	/**
	 * 
	 * @return 分享类型
	 */
	public Integer getShareType() {
	    return this.shareType;
	}
		
	/**
	 * 
	 * @param shareType 分享类型
	 */
	public void setShareType(Integer shareType) {
	    this.shareType = shareType;
	}
	/**
	 * 
	 * @return 活动类型
	 */
	public Integer getActivityType() {
	    return this.activityType;
	}
		
	/**
	 * 
	 * @param activityType 活动类型
	 */
	public void setActivityType(Integer activityType) {
	    this.activityType = activityType;
	}
	/**
	 * 
	 * @return 最多能完成多少次（0为不受限制）
	 */
	public Integer getMaxNumber() {
	    return this.maxNumber;
	}
		
	/**
	 * 
	 * @param maxNumber 最多能完成多少次（0为不受限制）
	 */
	public void setMaxNumber(Integer maxNumber) {
	    this.maxNumber = maxNumber;
	}
	/**
	 * 
	 * @return 创建人
	 */
	public String getCreatedBy() {
	    return this.createdBy;
	}
		
	/**
	 * 
	 * @param createdBy 创建人
	 */
	public void setCreatedBy(String createdBy) {
	    this.createdBy = createdBy;
	}
	/**
	 * 
	 * @return 创建时间
	 */
	public Date getCreatedAt() {
	    return this.createdAt;
	}
		
	/**
	 * 
	 * @param createdAt 创建时间
	 */
	public void setCreatedAt(Date createdAt) {
	    this.createdAt = createdAt;
	}
	/**
	 * 
	 * @return 修改人
	 */
	public String getUpdatedBy() {
	    return this.updatedBy;
	}
		
	/**
	 * 
	 * @param updatedBy 修改人
	 */
	public void setUpdatedBy(String updatedBy) {
	    this.updatedBy = updatedBy;
	}
	/**
	 * 
	 * @return 修改时间
	 */
	public Date getUpdatedAt() {
	    return this.updatedAt;
	}
		
	/**
	 * 
	 * @param updatedAt 修改时间
	 */
	public void setUpdatedAt(Date updatedAt) {
	    this.updatedAt = updatedAt;
	}
	/**
	 * 
	 * @return 是否有效
	 */
	public Integer getIsInvalid() {
	    return this.isInvalid;
	}
		
	/**
	 * 
	 * @param isInvalid 是否有效
	 */
	public void setIsInvalid(Integer isInvalid) {
	    this.isInvalid = isInvalid;
	}
	/**
	 * 
	 * @param id 主键
	 */
	public void setId(Long id) {
	    this.id = id;
	}
	/**
	 * 
	 * @return 主键
	 */
	public Long getId() {
	    return this.id;
	}
   

    
	
	@Override
	public String toString() {
		return "TInsuranceCrmTaskParameter:["
				    +"\n\ttaskId="+ taskId 
				    +"\n\tdayNumber="+ dayNumber 
				    +"\n\tmonthNumber="+ monthNumber 
				    +"\n\tvalue="+ value 
				    +"\n\ttaskActType="+ taskActType 
				    +"\n\tpurchasePolicyType="+ purchasePolicyType 
				    +"\n\tinsuranceType="+ insuranceType 
				    +"\n\tpremium="+ premium 
				    +"\n\tinsuranceNumber="+ insuranceNumber 
				    +"\n\tshareType="+ shareType 
				    +"\n\tactivityType="+ activityType 
				    +"\n\tmaxNumber="+ maxNumber 
				    +"\n\tcreatedBy="+ createdBy 
				    +"\n\tcreatedAt="+ createdAt 
				    +"\n\tupdatedBy="+ updatedBy 
				    +"\n\tupdatedAt="+ updatedAt 
				    +"\n\tisInvalid="+ isInvalid 
		    		  +"\n\tid="+ id 
					+"\n]";
	}
}