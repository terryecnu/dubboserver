package com.bestpay.member.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by HYP on 2018/11/29.
 */
@Data
public class ProductDto implements Serializable{
    private static final String TAG = "ProductDto";
    private static final long serialVersionUID = 7831639019909658642L;
    /**
     * 产品推荐Id
     */
    private Integer productRecommentId;
    /**
     * 产品推荐分类
     */
    private String productRecommendationClass;
    /**
     * 产品Id
     */
    private String productId;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 产品原价
     */
    private String productPrice;
    /**
     * 产品折后价
     */
    private String productDiscountPrice;
    /**
     * 产品标签
     */
    private String productSign;
    /**
     * 产品跳转链接
     */
    private String productUrl;
    /**
     * 产品图片
     */
    private String productImg;
}