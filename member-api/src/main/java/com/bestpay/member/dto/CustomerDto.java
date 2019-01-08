package com.bestpay.member.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by HYP on 2018/11/28.
 */
@Data
public class CustomerDto implements Serializable{
    private static final String TAG = "CustomerDto";
    private static final long serialVersionUID = 4184507923140351004L;
    /**
     * 用户编号
     */
    private String userNo;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 头像
     */
    private String headImg;
    /**
     * 成长值
     */
    private Double growthValue;
    /**
     * 等级名称
     */
    private String rankName;
    /**
     * 据下一等级成长值差值
     */
    private Double lessValue;
    /**
     * 等级ID
     */
    private Integer idRank;
    /**
     * 下一等级名字
     */
    private String nextRankName;
    /**
     * 是否达到等级阈值（等级到顶）
     */
    private Boolean isMaxRank = false;

}