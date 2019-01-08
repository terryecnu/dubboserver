package com.bestpay.member.dto;

import java.io.Serializable;

/**
 * Created by HYP on 2018/11/28.
 */

/**
 * 权益对象
 */
public class RightDto implements Serializable ,Cloneable {
    private static final String TAG = "RightDto";
    private static final long serialVersionUID = 8242110777620810074L;
    /**
     * 权益管理主键id
     */
    private Integer insuranceCrmRightId;

    /**
     * 权益项类型
     */
    private Integer rightOptions;
    /**
     * 按钮图标地址(默认亮色)
     */
    private String rightIconImg;
    /**
     * 按钮图标（暗色）
     */
    private String rightIconDarkImg;
    /**
     * 权益名称
     */
    private String rightOptionsName;
    /**
     * 是否是当前等级拥有的权益（前端据此判断显示权益亮暗色权益图片）
     */
    private boolean rankHave = false;
    /**
     * 用户是否拥有此项权益，（会员中心）
     */
    private boolean userHave = false;

    public RightDto() {
    }

    public RightDto(Integer insuranceCrmRightId, Integer rightOptions, String rightIconImg, String rightIconDarkImg, String rightOptionsName,boolean rankHave) {
        this.insuranceCrmRightId = insuranceCrmRightId;
        this.rightOptions = rightOptions;
        this.rightIconImg = rightIconImg;
        this.rightIconDarkImg = rightIconDarkImg;
        this.rightOptionsName = rightOptionsName;
        this.rankHave = rankHave;
    }

    public boolean isUserHave() {
        return userHave;
    }

    public void setUserHave(boolean userHave) {
        this.userHave = userHave;
    }

    public boolean isRankHave() {
        return rankHave;
    }

    public void setRankHave(boolean rankHave) {
        this.rankHave = rankHave;
    }

    public Integer getInsuranceCrmRightId() {
        return insuranceCrmRightId;
    }

    public void setInsuranceCrmRightId(Integer insuranceCrmRightId) {
        this.insuranceCrmRightId = insuranceCrmRightId;
    }

    public Integer getRightOptions() {
        return rightOptions;
    }

    public void setRightOptions(Integer rightOptions) {
        this.rightOptions = rightOptions;
    }

    public String getRightIconImg() {
        return rightIconImg;
    }

    public void setRightIconImg(String rightIconImg) {
        this.rightIconImg = rightIconImg;
    }

    public String getRightIconDarkImg() {
        return rightIconDarkImg;
    }

    public void setRightIconDarkImg(String rightIconDarkImg) {
        this.rightIconDarkImg = rightIconDarkImg;
    }

    public String getRightOptionsName() {
        return rightOptionsName;
    }

    public void setRightOptionsName(String rightOptionsName) {
        this.rightOptionsName = rightOptionsName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass().getSimpleName() != o.getClass().getSimpleName()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        RightDto rightDto = (RightDto) o;

        return insuranceCrmRightId.equals(rightDto.insuranceCrmRightId);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        RightDto rightDto = new RightDto(this.getInsuranceCrmRightId(),this.getRightOptions(),this.getRightIconImg(),
                this.getRightIconDarkImg(),this.getRightOptionsName(),this.isRankHave());
        return rightDto;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + insuranceCrmRightId.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "RightDto{" +
                "insuranceCrmRightId=" + insuranceCrmRightId +
                ", rightOptions=" + rightOptions +
                ", rightIconImg='" + rightIconImg + '\'' +
                ", rightIconDarkImg='" + rightIconDarkImg + '\'' +
                ", rightOptionsName='" + rightOptionsName + '\'' +
                ", rankHave=" + rankHave +
                '}';
    }
}