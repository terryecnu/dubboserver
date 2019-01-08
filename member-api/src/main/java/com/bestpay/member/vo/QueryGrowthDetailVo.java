package com.bestpay.member.vo;
/**
 * Created by WDL on 2018/11/27.
 */
public class QueryGrowthDetailVo extends BaseVo {
    private Integer pageNo;
    private Integer pageSize;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public int getStartOffset() {
        return pageSize * (pageNo - 1);
    }

    public int getEndOffset() {
        return pageSize * pageNo;
    }

    @Override
    public String toString() {
        return "QueryGrowthDetailVo{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                '}';
    }
}