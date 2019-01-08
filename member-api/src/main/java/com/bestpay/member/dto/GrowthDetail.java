package com.bestpay.member.dto;

import java.io.Serializable;
/**
 * Created by WDL on 2018/11/27.
 */
public class GrowthDetail implements Serializable{
    private static final String TAG = "GrowthDetail";
    private Integer monthNum ;
    private Integer  yearNum;
    private Integer sumAmount;
    private String transTime;
    private String  transAmount;
    private Integer type;//0--综合  1--数据
    private String  taskTitle;

    public Integer getMonthNum() {
        return monthNum;
    }

    public void setMonthNum(Integer monthNum) {
        this.monthNum = monthNum;
    }

    public Integer getYearNum() {
        return yearNum;
    }

    public void setYearNum(Integer yearNum) {
        this.yearNum = yearNum;
    }

    public Integer getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(Integer sumAmount) {
        this.sumAmount = sumAmount;
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime;
    }

    public String getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(String transAmount) {
        this.transAmount = transAmount;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    @Override
    public String toString() {
        return "GrowthDetail{" +
                "monthNum=" + monthNum +
                ", yearNum=" + yearNum +
                ", sumAmount=" + sumAmount +
                ", transTime='" + transTime + '\'' +
                ", transAmount='" + transAmount + '\'' +
                ", type=" + type +
                ", taskTitle='" + taskTitle + '\'' +
                '}';
    }
}