package com.bestpay.member.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by WDL on 2018/11/27.
 */
public class GrowValueDto  implements Serializable {
    private Integer rankId;
    private Double growthValue;
    private String currentQualName;
    private Integer maxGrowValue;
    private Integer minGrowValue;
    private String nextQualName;
    private Integer nextQualGrowthValue;
    private String nextQualIcon;
    private Double  differentValu;//差值
    private String quanlFlag;
    private String quanlImg;
    private String nextQualFlag;
    private String nextQualImg;
    private List<GrowthDetail> listDetail;
	public Integer getRankId() {
		return rankId;
	}
	public void setRankId(Integer rankId) {
		this.rankId = rankId;
	}
	public Double getGrowthValue() {
		return growthValue;
	}
	public void setGrowthValue(Double growthValue) {
		this.growthValue = growthValue;
	}
	public String getCurrentQualName() {
		return currentQualName;
	}
	public void setCurrentQualName(String currentQualName) {
		this.currentQualName = currentQualName;
	}
	public Integer getMaxGrowValue() {
		return maxGrowValue;
	}
	public void setMaxGrowValue(Integer maxGrowValue) {
		this.maxGrowValue = maxGrowValue;
	}
	public Integer getMinGrowValue() {
		return minGrowValue;
	}
	public void setMinGrowValue(Integer minGrowValue) {
		this.minGrowValue = minGrowValue;
	}
	public String getNextQualName() {
		return nextQualName;
	}
	public void setNextQualName(String nextQualName) {
		this.nextQualName = nextQualName;
	}
	public Integer getNextQualGrowthValue() {
		return nextQualGrowthValue;
	}
	public void setNextQualGrowthValue(Integer nextQualGrowthValue) {
		this.nextQualGrowthValue = nextQualGrowthValue;
	}
	public String getNextQualIcon() {
		return nextQualIcon;
	}
	public void setNextQualIcon(String nextQualIcon) {
		this.nextQualIcon = nextQualIcon;
	}
	public Double getDifferentValu() {
		return differentValu;
	}
	public void setDifferentValu(Double differentValu) {
		this.differentValu = differentValu;
	}
	public String getQuanlFlag() {
		return quanlFlag;
	}
	public void setQuanlFlag(String quanlFlag) {
		this.quanlFlag = quanlFlag;
	}
	public String getQuanlImg() {
		return quanlImg;
	}
	public void setQuanlImg(String quanlImg) {
		this.quanlImg = quanlImg;
	}
	public String getNextQualFlag() {
		return nextQualFlag;
	}
	public void setNextQualFlag(String nextQualFlag) {
		this.nextQualFlag = nextQualFlag;
	}
	public String getNextQualImg() {
		return nextQualImg;
	}
	public void setNextQualImg(String nextQualImg) {
		this.nextQualImg = nextQualImg;
	}
	public List<GrowthDetail> getListDetail() {
		return listDetail;
	}
	public void setListDetail(List<GrowthDetail> listDetail) {
		this.listDetail = listDetail;
	}
	@Override
	public String toString() {
		return "GrowValueDto [rankId=" + rankId + ", growthValue=" + growthValue + ", currentQualName="
				+ currentQualName + ", maxGrowValue=" + maxGrowValue + ", minGrowValue=" + minGrowValue
				+ ", nextQualName=" + nextQualName + ", nextQualGrowthValue=" + nextQualGrowthValue + ", nextQualIcon="
				+ nextQualIcon + ", differentValu=" + differentValu + ", quanlFlag=" + quanlFlag + ", quanlImg="
				+ quanlImg + ", nextQualFlag=" + nextQualFlag + ", nextQualImg=" + nextQualImg + ", listDetail="
				+ listDetail + "]";
	}


}