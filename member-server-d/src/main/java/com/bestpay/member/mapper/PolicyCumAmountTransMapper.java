package com.bestpay.member.mapper;

import com.bestpay.member.po.PolicyCumAmountTrans;

public interface PolicyCumAmountTransMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer acctTransId);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insert(PolicyCumAmountTrans record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(PolicyCumAmountTrans record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    PolicyCumAmountTrans selectByPrimaryKey(Integer acctTransId);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(PolicyCumAmountTrans record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
	int updateByPrimaryKey(PolicyCumAmountTrans record);
    
    /**
     * 根据userId查询用户总保费
     * @param userId
     * @return
     */
	Double querySumPolicyAmount(String userId);
    
}