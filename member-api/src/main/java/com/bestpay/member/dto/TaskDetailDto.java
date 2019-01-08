package com.bestpay.member.dto;

import java.io.Serializable;

/**
 * Created by WDL on 2018/11/28.
 */
public class TaskDetailDto implements Serializable {
    private static final String TAG = "TaskDetailDto";
    private Integer taskId;
    private Integer actType;
    private Integer taskType;
    private String taskLink;
    private String imgUrl;
    private String rewardDesc;
    private String taskTitle;
    private Integer dayNum;
    private Integer monthNum;
    private Integer maxNum;
    private boolean isFinished = false;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getActType() {
        return actType;
    }

    public void setActType(Integer actType) {
        this.actType = actType;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public String getTaskLink() {
        return taskLink;
    }

    public void setTaskLink(String taskLink) {
        this.taskLink = taskLink;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getRewardDesc() {
        return rewardDesc;
    }

    public void setRewardDesc(String rewardDesc) {
        this.rewardDesc = rewardDesc;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public Integer getDayNum() {
        return dayNum;
    }

    public void setDayNum(Integer dayNum) {
        this.dayNum = dayNum;
    }

    public Integer getMonthNum() {
        return monthNum;
    }

    public void setMonthNum(Integer monthNum) {
        this.monthNum = monthNum;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    @Override
    public String toString() {
        return "TaskDetailDto{" +
                "taskId=" + taskId +
                ", actType=" + actType +
                ", taskType=" + taskType +
                ", taskLink='" + taskLink + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", rewardDesc='" + rewardDesc + '\'' +
                ", taskTitle='" + taskTitle + '\'' +
                ", dayNum=" + dayNum +
                ", monthNum=" + monthNum +
                ", maxNum=" + maxNum +
                ", isFinished=" + isFinished +
                '}';
    }
}