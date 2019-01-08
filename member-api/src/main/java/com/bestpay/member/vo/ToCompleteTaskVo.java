package com.bestpay.member.vo;
/**
 * Created by WDL on 2018/11/28.
 */
public class ToCompleteTaskVo extends  BaseVo  {
    private Integer taskId;
    private Integer  custTaskType;//自定义任务类型  1--签到  2--评论   3--购买保险  3--分享产品   4--参加活动
    public Integer getTaskId() {
        return taskId;
    }
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getCustTaskType() {
        return custTaskType;
    }

    public void setCustTaskType(Integer custTaskType) {
        this.custTaskType = custTaskType;
    }
	@Override
	public String toString() {
		return "ToCompleteTaskVo [taskId=" + taskId + ", custTaskType=" + custTaskType + "]"+super.toString();
	}

  
}