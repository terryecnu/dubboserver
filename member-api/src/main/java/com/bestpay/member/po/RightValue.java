package com.bestpay.member.po;

import java.io.Serializable;

public class RightValue implements Serializable {
    private static final long serialVersionUID = 2257782786199333196L;
    /**
     * 规则id
     */
    private Integer ruleId;

    /**
     * 业务类型0幸运抽奖1.生日礼包,2代金券3.折扣券，4权益标识
     */
    private String businessType;

    /**
     * 次数|值|产品服务id
     */
    private String value;

    /**
     * 批次号
     */
    private String batchId;

    /**
     * 倍数
     */
    private Double multiple;

    /**
     * 子业务类型0大转盘 1.宝库,2成长值倍数 3.保险代金券，4折扣，5产品，6服务，7道具
     */
    private String businessItemType;

    /**
     * 权益项id
     */
    private Integer rightId;

    /**
     * 是否有效
     */
    private Integer invaild;

    /**
     * 等级id
     */
    private Integer rankId;

    /**
     * 规则id
     * @return rule_id 规则id
     */
    public Integer getRuleId() {
        return ruleId;
    }

    /**
     * 规则id
     * @param ruleId 规则id
     */
    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * 业务类型0幸运抽奖1.生日礼包,2代金券3.折扣券，4权益标识
     * @return business_type 业务类型0幸运抽奖1.生日礼包,2代金券3.折扣券，4权益标识
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * 业务类型0幸运抽奖1.生日礼包,2代金券3.折扣券，4权益标识
     * @param businessType 业务类型0幸运抽奖1.生日礼包,2代金券3.折扣券，4权益标识
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    /**
     * 次数|值|产品服务id
     * @return value 次数|值|产品服务id
     */
    public String getValue() {
        return value;
    }

    /**
     * 次数|值|产品服务id
     * @param value 次数|值|产品服务id
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * 批次号
     * @return batch_id 批次号
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * 批次号
     * @param batchId 批次号
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    /**
     * 倍数
     * @return multiple 倍数
     */
    public Double getMultiple() {
        return multiple;
    }

    /**
     * 倍数
     * @param multiple 倍数
     */
    public void setMultiple(Double multiple) {
        this.multiple = multiple;
    }

    /**
     * 子业务类型0大转盘 1.宝库,2成长值倍数 3.保险代金券，4折扣，5产品，6服务，7道具
     * @return business_item_type 子业务类型0大转盘 1.宝库,2成长值倍数 3.保险代金券，4折扣，5产品，6服务，7道具
     */
    public String getBusinessItemType() {
        return businessItemType;
    }

    /**
     * 子业务类型0大转盘 1.宝库,2成长值倍数 3.保险代金券，4折扣，5产品，6服务，7道具
     * @param businessItemType 子业务类型0大转盘 1.宝库,2成长值倍数 3.保险代金券，4折扣，5产品，6服务，7道具
     */
    public void setBusinessItemType(String businessItemType) {
        this.businessItemType = businessItemType == null ? null : businessItemType.trim();
    }

    /**
     * 权益项id
     * @return right_id 权益项id
     */
    public Integer getRightId() {
        return rightId;
    }

    /**
     * 权益项id
     * @param rightId 权益项id
     */
    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    /**
     * 是否有效
     * @return invaild 是否有效
     */
    public Integer getInvaild() {
        return invaild;
    }

    /**
     * 是否有效
     * @param invaild 是否有效
     */
    public void setInvaild(Integer invaild) {
        this.invaild = invaild;
    }

    /**
     * 等级id
     * @return rank_id 等级id
     */
    public Integer getRankId() {
        return rankId;
    }

    /**
     * 等级id
     * @param rankId 等级id
     */
    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }
}