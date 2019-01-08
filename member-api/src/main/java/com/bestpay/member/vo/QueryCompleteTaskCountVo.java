package com.bestpay.member.vo;

/**
 * Created by WDL on 2018/11/28.
 */
public class QueryCompleteTaskCountVo extends BaseVo {
    private Integer taskId;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    @Override
    public String toString() {
        return "QueryCompleteTaskCountVo{" +
                "taskId=" + taskId +
                '}';
    }
}
