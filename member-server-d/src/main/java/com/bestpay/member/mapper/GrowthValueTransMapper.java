package com.bestpay.member.mapper;

import com.bestpay.member.dto.GrowthDetail;
import com.bestpay.member.vo.GrowthTransVo;
import com.bestpay.member.vo.QueryGrowthDetailVo;

import java.util.List;

public interface GrowthValueTransMapper {
    /**
     * @mbggenerated 2018-11-26
     */

    /**
     * 查询成长值记录列表
     * @param vo
     * @return
     */
    List<GrowthDetail> queryGrowthDetailList(QueryGrowthDetailVo vo);

    int insertGrowthRecord(GrowthTransVo transVo);
}