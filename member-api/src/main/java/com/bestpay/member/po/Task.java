package com.bestpay.member.po;

import java.io.Serializable;
import java.util.Date;

public class Task implements Serializable {
    private static final long serialVersionUID = -2525426798761327103L;
    /**
     * 成长任务管理主键id
     */
    private Integer insuranceCrmTaskId;

    /**
     * 行为类型
     */
    private Integer actType;

    /**
     * 任务类型
     */
    private Integer taskType;

    /**
     * 任务标题
     */
    private String taskTitle;

    /**
     * 任务奖励描述
     */
    private String rewardDesc;

    /**
     * 图片地址
     */
    private String imgUrl;

    /**
     * 跳转链接
     */
    private String link;

    /**
     * 是否一次性
     */
    private Integer disposable;

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
     * 审核状态
     */
    private Short audStatus;

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 成长任务状态
     */
    private Integer insuranceCrmTaskStatus;

    /**
     * 
     */
    private Integer sortOrder;

    /**
     * 审核原因
     */
    private String auditorRefused;

    /**
     * 成长任务管理主键id
     * @return insurance_crm_task_id 成长任务管理主键id
     */
    public Integer getInsuranceCrmTaskId() {
        return insuranceCrmTaskId;
    }

    /**
     * 成长任务管理主键id
     * @param insuranceCrmTaskId 成长任务管理主键id
     */
    public void setInsuranceCrmTaskId(Integer insuranceCrmTaskId) {
        this.insuranceCrmTaskId = insuranceCrmTaskId;
    }

    /**
     * 行为类型
     * @return act_type 行为类型
     */
    public Integer getActType() {
        return actType;
    }

    /**
     * 行为类型
     * @param actType 行为类型
     */
    public void setActType(Integer actType) {
        this.actType = actType;
    }

    /**
     * 任务类型
     * @return task_type 任务类型
     */
    public Integer getTaskType() {
        return taskType;
    }

    /**
     * 任务类型
     * @param taskType 任务类型
     */
    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    /**
     * 任务标题
     * @return task_title 任务标题
     */
    public String getTaskTitle() {
        return taskTitle;
    }

    /**
     * 任务标题
     * @param taskTitle 任务标题
     */
    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle == null ? null : taskTitle.trim();
    }

    /**
     * 任务奖励描述
     * @return reward_desc 任务奖励描述
     */
    public String getRewardDesc() {
        return rewardDesc;
    }

    /**
     * 任务奖励描述
     * @param rewardDesc 任务奖励描述
     */
    public void setRewardDesc(String rewardDesc) {
        this.rewardDesc = rewardDesc == null ? null : rewardDesc.trim();
    }

    /**
     * 图片地址
     * @return img_url 图片地址
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 图片地址
     * @param imgUrl 图片地址
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * 跳转链接
     * @return link 跳转链接
     */
    public String getLink() {
        return link;
    }

    /**
     * 跳转链接
     * @param link 跳转链接
     */
    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    /**
     * 是否一次性
     * @return disposable 是否一次性
     */
    public Integer getDisposable() {
        return disposable;
    }

    /**
     * 是否一次性
     * @param disposable 是否一次性
     */
    public void setDisposable(Integer disposable) {
        this.disposable = disposable;
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
     * 成长任务状态
     * @return insurance_crm_task_status 成长任务状态
     */
    public Integer getInsuranceCrmTaskStatus() {
        return insuranceCrmTaskStatus;
    }

    /**
     * 成长任务状态
     * @param insuranceCrmTaskStatus 成长任务状态
     */
    public void setInsuranceCrmTaskStatus(Integer insuranceCrmTaskStatus) {
        this.insuranceCrmTaskStatus = insuranceCrmTaskStatus;
    }

    /**
     * 
     * @return sort_order 
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * 
     * @param sortOrder 
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
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
}