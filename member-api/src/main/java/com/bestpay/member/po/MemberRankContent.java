package com.bestpay.member.po;

import java.io.Serializable;
import java.util.Date;

public class MemberRankContent implements Serializable {
    private static final long serialVersionUID = 6905892479787772909L;
    /**
     * 
     */
    private Integer contentId;

    /**
     * 
     */
    private Integer busiCode;

    /**
     * 
     */
    private Integer busiId;

    /**
     * 
     */
    private Integer memberRankId;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 修改人
     */
    private String updatedBy;

    /**
     * 修改时间
     */
    private Date updatedAt;


    private Integer isValid;


    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    /**
     * 
     * @return content_id 
     */
    public Integer getContentId() {
        return contentId;
    }

    /**
     * 
     * @param contentId 
     */
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    /**
     * 
     * @return busi_code 
     */
    public Integer getBusiCode() {
        return busiCode;
    }

    /**
     * 
     * @param busiCode 
     */
    public void setBusiCode(Integer busiCode) {
        this.busiCode = busiCode;
    }

    /**
     * 
     * @return busi_id 
     */
    public Integer getBusiId() {
        return busiId;
    }

    /**
     * 
     * @param busiId 
     */
    public void setBusiId(Integer busiId) {
        this.busiId = busiId;
    }

    /**
     * 
     * @return member_rank_id 
     */
    public Integer getMemberRankId() {
        return memberRankId;
    }

    /**
     * 
     * @param memberRankId 
     */
    public void setMemberRankId(Integer memberRankId) {
        this.memberRankId = memberRankId;
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
     * 修改人
     * @return updated_by 修改人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 修改人
     * @param updatedBy 修改人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * 修改时间
     * @return updated_at 修改时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 修改时间
     * @param updatedAt 修改时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}