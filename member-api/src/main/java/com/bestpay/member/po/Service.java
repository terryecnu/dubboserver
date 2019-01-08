package com.bestpay.member.po;

import java.io.Serializable;
import java.util.Date;

public class Service implements Serializable {
    private static final long serialVersionUID = 957406326472179790L;
    /**
     * 会员产品推荐id
     */
    private Integer memberProductRecommentId;

    /**
     * 产品推荐类目
     */
    private String memberProductRecommendationClass;

    /**
     * --产品|服务id
     */
    private String productId;

    /**
     * 产品/服务名称
     */
    private String productName;

    /**
     * 产品价格
     */
    private Long productPrice;

    /**
     * 产品推荐优惠价
     */
    private Long productDiscountPrice;

    /**
     * 开始推荐时间
     */
    private Date productRecommendationBegin;

    /**
     * 推荐截止时间
     */
    private Date productRecommendationEnd;

    /**
     * 会员等级
     */
    private String rank;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateAt;

    /**
     * 审核人
     */
    private Integer auditorId;

    /**
     * 审核状态
     */
    private Integer audStatus;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 会员产品推荐id
     * @return member_product_recomment_id 会员产品推荐id
     */
    public Integer getMemberProductRecommentId() {
        return memberProductRecommentId;
    }

    /**
     * 会员产品推荐id
     * @param memberProductRecommentId 会员产品推荐id
     */
    public void setMemberProductRecommentId(Integer memberProductRecommentId) {
        this.memberProductRecommentId = memberProductRecommentId;
    }

    /**
     * 产品推荐类目
     * @return member_product_recommendation_class 产品推荐类目
     */
    public String getMemberProductRecommendationClass() {
        return memberProductRecommendationClass;
    }

    /**
     * 产品推荐类目
     * @param memberProductRecommendationClass 产品推荐类目
     */
    public void setMemberProductRecommendationClass(String memberProductRecommendationClass) {
        this.memberProductRecommendationClass = memberProductRecommendationClass == null ? null : memberProductRecommendationClass.trim();
    }

    /**
     * --产品|服务id
     * @return product_id --产品|服务id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * --产品|服务id
     * @param productId --产品|服务id
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * 产品/服务名称
     * @return product_name 产品/服务名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 产品/服务名称
     * @param productName 产品/服务名称
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 产品价格
     * @return product_price 产品价格
     */
    public Long getProductPrice() {
        return productPrice;
    }

    /**
     * 产品价格
     * @param productPrice 产品价格
     */
    public void setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * 产品推荐优惠价
     * @return product_discount_price 产品推荐优惠价
     */
    public Long getProductDiscountPrice() {
        return productDiscountPrice;
    }

    /**
     * 产品推荐优惠价
     * @param productDiscountPrice 产品推荐优惠价
     */
    public void setProductDiscountPrice(Long productDiscountPrice) {
        this.productDiscountPrice = productDiscountPrice;
    }

    /**
     * 开始推荐时间
     * @return product_recommendation_begin 开始推荐时间
     */
    public Date getProductRecommendationBegin() {
        return productRecommendationBegin;
    }

    /**
     * 开始推荐时间
     * @param productRecommendationBegin 开始推荐时间
     */
    public void setProductRecommendationBegin(Date productRecommendationBegin) {
        this.productRecommendationBegin = productRecommendationBegin;
    }

    /**
     * 推荐截止时间
     * @return product_recommendation_end 推荐截止时间
     */
    public Date getProductRecommendationEnd() {
        return productRecommendationEnd;
    }

    /**
     * 推荐截止时间
     * @param productRecommendationEnd 推荐截止时间
     */
    public void setProductRecommendationEnd(Date productRecommendationEnd) {
        this.productRecommendationEnd = productRecommendationEnd;
    }

    /**
     * 会员等级
     * @return rank 会员等级
     */
    public String getRank() {
        return rank;
    }

    /**
     * 会员等级
     * @param rank 会员等级
     */
    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    /**
     * 排序
     * @return sort 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 创建人
     * @return created_by 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 创建人
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * 创建时间
     * @return created_at 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 创建时间
     * @param createdAt 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 更新人
     * @return update_by 更新人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新人
     * @param updateBy 更新人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 更新时间
     * @return update_at 更新时间
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 更新时间
     * @param updateAt 更新时间
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * 审核人
     * @return auditor_id 审核人
     */
    public Integer getAuditorId() {
        return auditorId;
    }

    /**
     * 审核人
     * @param auditorId 审核人
     */
    public void setAuditorId(Integer auditorId) {
        this.auditorId = auditorId;
    }

    /**
     * 审核状态
     * @return aud_status 审核状态
     */
    public Integer getAudStatus() {
        return audStatus;
    }

    /**
     * 审核状态
     * @param audStatus 审核状态
     */
    public void setAudStatus(Integer audStatus) {
        this.audStatus = audStatus;
    }

    /**
     * 状态
     * @return status 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}