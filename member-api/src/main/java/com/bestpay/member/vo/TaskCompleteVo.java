package com.bestpay.member.vo;

import java.io.Serializable;

/**
 * @Author: Hu Yongpeng
 * @Description: String userNo, Integer taskType, Integer activityType
 * @Date: Created in 15:22 2018/12/28
 */
public class TaskCompleteVo implements Serializable {
    private static final String TAG = "TaskCompleteVo";
    private static final long serialVersionUID = -764463883534696131L;

    private String userNo;

    private Integer taskType;

    private Integer activityType;

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    @Override
    public String toString() {
        return "TaskCompleteVo{" +
                "userNo='" + userNo + '\'' +
                ", taskType=" + taskType +
                ", activityType=" + activityType +
                '}';
    }
}