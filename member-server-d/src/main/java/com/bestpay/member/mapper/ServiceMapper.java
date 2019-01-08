package com.bestpay.member.mapper;

import com.bestpay.member.po.Service;

public interface ServiceMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer memberProductRecommentId);


    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(Service record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    Service selectByPrimaryKey(Integer memberProductRecommentId);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(Service record);

}