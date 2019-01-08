package com.bestpay.member.mapper;

import com.bestpay.member.po.MemberRankContent;

import java.util.List;

public interface MemberRankContentMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer contentId);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insert(MemberRankContent record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(MemberRankContent record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    MemberRankContent selectByPrimaryKey(Integer contentId);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(MemberRankContent record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(MemberRankContent record);

    List<MemberRankContent> selectAll();
}