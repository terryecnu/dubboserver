package com.bestpay.member.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by HYP on 2018/11/29.
 */
@Data
public class TaskDto implements Serializable{
    private static final String TAG = "TaskDto";
    private static final long serialVersionUID = -2388721800994779569L;
    //任务主键
    private Integer taskId;
    //行为类型
    private Integer actType;
    //任务类型
    private Integer taskType;
    //任务跳转
    private String taskLink;
    //图片
    private String imgUrl;
    //任务描述
    private String rewardDesc;
    //任务标题
    private String taskTitle;
    //是否完成
    private boolean isDown = false;
    //任务配置每天完成多少次
    private Integer dayCount;
    //任务配置每月完成多少
    private Integer monthCount;
    //任务配置总计完成多少
    private Integer totalCount;
}  