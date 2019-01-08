package com.bestpay.member.mapper;

import com.bestpay.member.dto.GrowValueDto;
import com.bestpay.member.po.GrowthValue;
import com.bestpay.member.vo.QueryGrowthDetailVo;
import org.apache.ibatis.annotations.Param;

public interface GrowthValueMapper {
    /**
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer acctId);

    /**
     * @mbggenerated 2018-11-26
     */
    int insert(GrowthValue record);

    /**
     * @mbggenerated 2018-11-26
     */
    int insertSelective(GrowthValue record);

    /**
     * @mbggenerated 2018-11-26
     */
    GrowthValue selectByPrimaryKey(Integer acctId);

    /**
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(GrowthValue record);

    /**
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(GrowthValue record);

    /**
     * 查询成长值的基本信息
     *
     * @param vo
     * @return
     */
    GrowValueDto queryMyGrowthValue(QueryGrowthDetailVo vo);

    /**
     * 查询下级的会员等级信息
     *
     * @param currentRankMaxValue
     * @return
     */
    GrowValueDto queryNextRankInfo(Integer currentRankMaxValue);

    /**
     * 获取时间戳作为编号
     */
    public String getTimeStamp();

    Double queryGrowthValueById(Integer taskId);

    /**
     * 更新用戶成長值
     *
     * @param userNo
     * @param growthValue
     * @return
     */
    int updateGrowthValue(@Param("userNo") String userNo, @Param("growthValue") Double growthValue);

    /**
     * 更新成长值账户表与用户表的成长值一致
     *
     * @param userNo
     * @return
     */
    int updateAcctGrowthValue(@Param("userNo") String userNo);
}