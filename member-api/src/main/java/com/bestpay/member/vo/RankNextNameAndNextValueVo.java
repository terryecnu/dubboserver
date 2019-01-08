package com.bestpay.member.vo;

import lombok.Data;

/**
 * Created by HYP on 2018/12/3.
 */
@Data
public class RankNextNameAndNextValueVo {
    private static final String TAG = "RankNextNameAndNextValueVo";
    /**
     * 下一等级值（最小）
     */
    private Double nextValue;
    /**
     * 下一等级名
     */
    private String nextName;
}  