package com.bestpay.member.dto;

import lombok.Data;

import java.io.Serializable;
/**
 * Created by HYP on 2018/11/28.
 */
@Data
public class MemberRankDto implements Serializable{
    private static final String TAG = "MemberRankDto";
    private static final long serialVersionUID = 3480996267663709560L;
    //等级Id
    private Integer memberRankId;
    //等级名称
    private String rankName;
    //等级成长值最小值
    private Double growthValueMin;
    //等级成长值最大值
    private Double growthValueMax;
    //道具名称
    private String rankPropName;
    //道具图片
    private String rankPropImg;
    //是否是当前登录人等级
    private boolean isUser = false;
}