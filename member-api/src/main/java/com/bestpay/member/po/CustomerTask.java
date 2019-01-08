package com.bestpay.member.po;

import java.io.Serializable;
import java.util.Date;

public class CustomerTask implements Serializable {
    private static final long serialVersionUID = 7202027653902609956L;
    /**
     * 用户任务主键
     */
    private Integer customerTaskId;

    /**
     * 任务主键
     */
    private Integer taskId;

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
     * 用户任务状态（1 完成，2未完成）
     */
    private Integer status;

    /**
     * 完成类型（任务与完成记录的关系）
     */
    private Integer busiCode;

    /**
     * 完成id（任务与完成记录的关系）
     */
    private String busiId;

    /**
     * 任务完成时间
     */
    private Date completeDate;

    /**
     * 用户任务主键
     * @return customer_task_id 用户任务主键
     */
    public Integer getCustomerTaskId() {
        return customerTaskId;
    }

    /**
     * 用户任务主键
     * @param customerTaskId 用户任务主键
     */
    public void setCustomerTaskId(Integer customerTaskId) {
        this.customerTaskId = customerTaskId;
    }

    /**
     * 任务主键
     * @return task_id 任务主键
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * 任务主键
     * @param taskId 任务主键
     */
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
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
     * 用户任务状态（1 完成，2未完成）
     * @return status 用户任务状态（1 完成，2未完成）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 用户任务状态（1 完成，2未完成）
     * @param status 用户任务状态（1 完成，2未完成）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 完成类型（任务与完成记录的关系）
     * @return busi_code 完成类型（任务与完成记录的关系）
     */
    public Integer getBusiCode() {
        return busiCode;
    }

    /**
     * 完成类型（任务与完成记录的关系）
     * @param busiCode 完成类型（任务与完成记录的关系）
     */
    public void setBusiCode(Integer busiCode) {
        this.busiCode = busiCode;
    }

    /**
     * 完成id（任务与完成记录的关系）
     * @return busi_id 完成id（任务与完成记录的关系）
     */
    public String getBusiId() {
        return busiId;
    }

    /**
     * 完成id（任务与完成记录的关系）
     * @param busiId 完成id（任务与完成记录的关系）
     */
    public void setBusiId(String busiId) {
        this.busiId = busiId == null ? null : busiId.trim();
    }

    /**
     * 任务完成时间
     * @return complete_date 任务完成时间
     */
    public Date getCompleteDate() {
        return completeDate;
    }

    /**
     * 任务完成时间
     * @param completeDate 任务完成时间
     */
    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }
}