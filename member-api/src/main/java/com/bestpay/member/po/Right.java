package com.bestpay.member.po;

import java.io.Serializable;
import java.util.Date;

public class Right implements Serializable {
    private static final long serialVersionUID = 3123903114031145823L;
    /**
     * 权益管理主键id
     */
    private Integer insuranceCrmRightId;

    /**
     * 权益项
     */
    private Integer rightOptions;

    /**
     * 权益简介
     */
    private String rightDes;
    /**
     * 按钮图标地址
     */
    private String rightIconImg;
    /**
     * 序号
     */
    private Integer sortOrder;

    /**
     * 会员等级
     */
    private Integer rankId;

    /**
     * 跳转链接
     */
    private String linkUrl;

    /**
     * 跳转按钮文字
     */
    private String linkWord;

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
    private Short audStatus;

    /**
     * 审核状态描述
     */
    private String audStatusDes;

    /**
     * 权益管理状态
     */
    private Short rightStatus;

    /**
     * 审核原因
     */
    private String auditorRefused;

    /**
     * 0--无效  1--有效
     */
    private Integer isValid;

    /**
     * 权益项说明
     */
    private byte[] rightDetail;

    /**
     * 是否启用
     */
    private int enableStatus;
    
    
    public String getRightIconImg() {
		return rightIconImg;
	}

	public void setRightIconImg(String rightIconImg) {
		this.rightIconImg = rightIconImg;
	}

	public int getEnableStatus() {
		return enableStatus;
	}

	public void setEnableStatus(int enableStatus) {
		this.enableStatus = enableStatus;
	}

	/**
     * 权益管理主键id
     * @return insurance_crm_right_id 权益管理主键id
     */
    public Integer getInsuranceCrmRightId() {
        return insuranceCrmRightId;
    }

    /**
     * 权益管理主键id
     * @param insuranceCrmRightId 权益管理主键id
     */
    public void setInsuranceCrmRightId(Integer insuranceCrmRightId) {
        this.insuranceCrmRightId = insuranceCrmRightId;
    }

    /**
     * 权益项
     * @return right_options 权益项
     */
    public Integer getRightOptions() {
        return rightOptions;
    }

    /**
     * 权益项
     * @param rightOptions 权益项
     */
    public void setRightOptions(Integer rightOptions) {
        this.rightOptions = rightOptions;
    }

    /**
     * 权益简介
     * @return right_des 权益简介
     */
    public String getRightDes() {
        return rightDes;
    }

    /**
     * 权益简介
     * @param rightDes 权益简介
     */
    public void setRightDes(String rightDes) {
        this.rightDes = rightDes == null ? null : rightDes.trim();
    }

    /**
     * 序号
     * @return sort_order 序号
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * 序号
     * @param sortOrder 序号
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * 会员等级
     * @return rank_id 会员等级
     */
    public Integer getRankId() {
        return rankId;
    }

    /**
     * 会员等级
     * @param rankId 会员等级
     */
    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    /**
     * 跳转链接
     * @return link_url 跳转链接
     */
    public String getLinkUrl() {
        return linkUrl;
    }

    /**
     * 跳转链接
     * @param linkUrl 跳转链接
     */
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    /**
     * 跳转按钮文字
     * @return link_word 跳转按钮文字
     */
    public String getLinkWord() {
        return linkWord;
    }

    /**
     * 跳转按钮文字
     * @param linkWord 跳转按钮文字
     */
    public void setLinkWord(String linkWord) {
        this.linkWord = linkWord == null ? null : linkWord.trim();
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
    public Short getAudStatus() {
        return audStatus;
    }

    /**
     * 审核状态
     * @param audStatus 审核状态
     */
    public void setAudStatus(Short audStatus) {
        this.audStatus = audStatus;
    }

    /**
     * 审核状态描述
     * @return aud_status_des 审核状态描述
     */
    public String getAudStatusDes() {
        return audStatusDes;
    }

    /**
     * 审核状态描述
     * @param audStatusDes 审核状态描述
     */
    public void setAudStatusDes(String audStatusDes) {
        this.audStatusDes = audStatusDes == null ? null : audStatusDes.trim();
    }

    /**
     * 权益管理状态
     * @return right_status 权益管理状态
     */
    public Short getRightStatus() {
        return rightStatus;
    }

    /**
     * 权益管理状态
     * @param rightStatus 权益管理状态
     */
    public void setRightStatus(Short rightStatus) {
        this.rightStatus = rightStatus;
    }

    /**
     * 审核原因
     * @return auditor_refused 审核原因
     */
    public String getAuditorRefused() {
        return auditorRefused;
    }

    /**
     * 审核原因
     * @param auditorRefused 审核原因
     */
    public void setAuditorRefused(String auditorRefused) {
        this.auditorRefused = auditorRefused == null ? null : auditorRefused.trim();
    }

    /**
     * 0--无效  1--有效
     * @return is_valid 0--无效  1--有效
     */
    public Integer getIsValid() {
        return isValid;
    }

    /**
     * 0--无效  1--有效
     * @param isValid 0--无效  1--有效
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    /**
     * 权益项说明
     * @return right_detail 权益项说明
     */
    public byte[] getRightDetail() {
        return rightDetail;
    }

    /**
     * 权益项说明
     * @param rightDetail 权益项说明
     */
    public void setRightDetail(byte[] rightDetail) {
        this.rightDetail = rightDetail;
    }
}