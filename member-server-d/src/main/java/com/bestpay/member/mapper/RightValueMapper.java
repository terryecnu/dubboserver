package com.bestpay.member.mapper;

import com.bestpay.member.po.RightValue;

import java.util.List;

public interface RightValueMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer ruleId);


    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(RightValue record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    RightValue selectByPrimaryKey(Integer ruleId);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(RightValue record);
    /**
                * 根据权益id查询权益项值
     * @param rightId
     * @return
     */
    List<RightValue> selectByRightId(Integer rightId);

}