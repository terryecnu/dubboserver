package com.bestpay.member.po;

import java.io.Serializable;
import java.util.Date;

public class MemberRank implements Serializable{
    private static final long serialVersionUID = 5474901469480831016L;
    /**
     * 会员等级主键id
     */
    private Integer memberRankId;

    /**
     * 排序
     */
    private Short sort;

    /**
     * 会员等级
     */
    private Short rankId;

    /**
     * 会员等级名称
     */
    private String rankName;

    /**
     * 成长值最小值
     */
    private Double growthValueMin;

    /**
     * 成长值最大值
     */
    private Double growthValueMax;

    /**
     * 成长值有效期
     */
    private String validPeriod;

    /**
     * 成长值是否回收
     */
    private Integer valueRecoverFlag;

    /**
     * 回收值
     */
    private Integer recoverValue;

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
     * 审核人
     */
    private String auditorId;

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 审核状态
     */
    private Integer audStatus;

    /**
     * 会员等级管理状态，提交审核 修改 删除
     */
    private Integer memberRankStatus;

    /**
     * 权益标识（冗余字段）
     */
    private String rankIdentification;

    /**
     * 0--无效   1--有效
     */
    private Integer isValid;

    /**
     * 会员等级主键id
     * @return member_rank_id 会员等级主键id
     */
    public Integer getMemberRankId() {
        return memberRankId;
    }

    /**
     * 会员等级主键id
     * @param memberRankId 会员等级主键id
     */
    public void setMemberRankId(Integer memberRankId) {
        this.memberRankId = memberRankId;
    }

    /**
     * 排序
     * @return sort 排序
     */
    public Short getSort() {
        return sort;
    }

    /**
     * 排序
     * @param sort 排序
     */
    public void setSort(Short sort) {
        this.sort = sort;
    }

    /**
     * 会员等级
     * @return rank_id 会员等级
     */
    public Short getRankId() {
        return rankId;
    }

    /**
     * 会员等级
     * @param rankId 会员等级
     */
    public void setRankId(Short rankId) {
        this.rankId = rankId;
    }

    /**
     * 会员等级名称
     * @return rank_name 会员等级名称
     */
    public String getRankName() {
        return rankName;
    }

    /**
     * 会员等级名称
     * @param rankName 会员等级名称
     */
    public void setRankName(String rankName) {
        this.rankName = rankName == null ? null : rankName.trim();
    }

    /**
     * 成长值最小值
     * @return growth_value_min 成长值最小值
     */
    public Double getGrowthValueMin() {
        return growthValueMin;
    }

    /**
     * 成长值最小值
     * @param growthValueMin 成长值最小值
     */
    public void setGrowthValueMin(Double growthValueMin) {
        this.growthValueMin = growthValueMin;
    }

    /**
     * 成长值最大值
     * @return growth_value_max 成长值最大值
     */
    public Double getGrowthValueMax() {
        return growthValueMax;
    }

    /**
     * 成长值最大值
     * @param growthValueMax 成长值最大值
     */
    public void setGrowthValueMax(Double growthValueMax) {
        this.growthValueMax = growthValueMax;
    }

    /**
     * 成长值有效期
     * @return valid_period 成长值有效期
     */
    public String getValidPeriod() {
        return validPeriod;
    }

    /**
     * 成长值有效期
     * @param validPeriod 成长值有效期
     */
    public void setValidPeriod(String validPeriod) {
        this.validPeriod = validPeriod == null ? null : validPeriod.trim();
    }

    /**
     * 成长值是否回收
     * @return value_recover_flag 成长值是否回收
     */
    public Integer getValueRecoverFlag() {
        return valueRecoverFlag;
    }

    /**
     * 成长值是否回收
     * @param valueRecoverFlag 成长值是否回收
     */
    public void setValueRecoverFlag(Integer valueRecoverFlag) {
        this.valueRecoverFlag = valueRecoverFlag;
    }

    /**
     * 回收值
     * @return recover_value 回收值
     */
    public Integer getRecoverValue() {
        return recoverValue;
    }

    /**
     * 回收值
     * @param recoverValue 回收值
     */
    public void setRecoverValue(Integer recoverValue) {
        this.recoverValue = recoverValue;
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

    /**
     * 审核人
     * @return auditor_id 审核人
     */
    public String getAuditorId() {
        return auditorId;
    }

    /**
     * 审核人
     * @param auditorId 审核人
     */
    public void setAuditorId(String auditorId) {
        this.auditorId = auditorId == null ? null : auditorId.trim();
    }

    /**
     * 审核时间
     * @return audit_time 审核时间
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * 审核时间
     * @param auditTime 审核时间
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * 审核状态
     * @return aud_status 审核状态
     */
    public Integer getAudStatus() {
        return audStatus;
    }

    /**
     * 审核状态
     * @param audStatus 审核状态
     */
    public void setAudStatus(Integer audStatus) {
        this.audStatus = audStatus;
    }

    /**
     * 会员等级管理状态，提交审核 修改 删除
     * @return member_rank_status 会员等级管理状态，提交审核 修改 删除
     */
    public Integer getMemberRankStatus() {
        return memberRankStatus;
    }

    /**
     * 会员等级管理状态，提交审核 修改 删除
     * @param memberRankStatus 会员等级管理状态，提交审核 修改 删除
     */
    public void setMemberRankStatus(Integer memberRankStatus) {
        this.memberRankStatus = memberRankStatus;
    }

    /**
     * 权益标识（冗余字段）
     * @return rank_Identification 权益标识（冗余字段）
     */
    public String getRankIdentification() {
        return rankIdentification;
    }

    /**
     * 权益标识（冗余字段）
     * @param rankIdentification 权益标识（冗余字段）
     */
    public void setRankIdentification(String rankIdentification) {
        this.rankIdentification = rankIdentification == null ? null : rankIdentification.trim();;
    }

    /**
     * 0--无效   1--有效
     * @return is_valid 0--无效   1--有效
     */
    public Integer getIsValid() {
        return isValid;
    }

    /**
     * 0--无效   1--有效
     * @param isValid 0--无效   1--有效
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}