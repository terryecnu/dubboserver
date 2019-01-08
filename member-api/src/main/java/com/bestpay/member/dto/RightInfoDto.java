package com.bestpay.member.dto;

import lombok.Data;

/**
 * Created by HYP on 2018/11/28.
 */
@Data
public class RightInfoDto extends RightDto {

    private static final String TAG = "RightInfoDto";

    /**
     * 权益ID
     */
    private Integer insuranceCrmRightId;
    /**
     * 权益名称
     */
    private String rightName;
    /**
     * 权益简介
     */
    private String rightDes;

    /**
     * 跳转链接
     */
    private String linkUrl;

    /**
     * 跳转按钮文字
     */
    private String linkWord;

    /**
     * 权益项说明
     */
    private String rightDetail;

    /**
     * 是否是用户当前拥有的权益
     */
    private boolean isUserHave = false;
}