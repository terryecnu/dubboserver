package com.bestpay.member.mapper;

import com.bestpay.member.dto.MemberRankDto;
import com.bestpay.member.po.MemberRank;
import com.bestpay.member.vo.RankNextNameAndNextValueVo;

import java.util.List;
import java.util.Map;

public interface MemberRankMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer memberRankId);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insert(MemberRank record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(MemberRank record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    MemberRank selectByPrimaryKey(Integer memberRankId);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(MemberRank record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(MemberRank record);

    List<MemberRankDto> selectAll();

    /**
     * 根据当前成长值查询下级等级和成长值最低值
     * @param growthValue
     * @return
     */
    RankNextNameAndNextValueVo selectNextGrowthValueByUserGrowthValue(Double growthValue);


    /**
     * 根据等级ID查询最大的成长值
     *
     * @param rankId
     * @return
     */
    Double selectMaxRankMaxValue(Integer rankId);

    /**
               * 查询升级列表
     * @param map
     * @return
     */
    List<MemberRank> selectUpRank(Map map);
    /**
                *查询降级列表
     * @param map
     * @return
     */
    List<MemberRank> selectDownRank(Map map);
}