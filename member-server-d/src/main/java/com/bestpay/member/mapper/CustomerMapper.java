package com.bestpay.member.mapper;

import com.bestpay.member.dto.CustomerDto;
import com.bestpay.member.dto.ProductDto;
import com.bestpay.member.dto.RightDto;
import com.bestpay.member.po.Customer;

import java.util.List;

public interface CustomerMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer crmId);



    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(Customer record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    Customer selectByPrimaryKey(Integer crmId);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(Customer record);



    Customer selectById(Integer custId);

    Integer queryCount();


    /**
     * 判断用户是否存在
     * @param userNo
     * @return
     */
    int isUserExists(String userNo);

    /**
     * 查询该用户
     * @param userNo
     * @return
     */
    Customer selectByUserNo(String userNo);

    /**
     * 用户中心  用户信息
     * @param userNo
     * @return
     */
    CustomerDto selectCustomerDtoByUserNo(String userNo);

    List<RightDto> queryRightsByUserNo(String userNo);

    List<ProductDto> selectMemberCenterProductsByUserNo(String userNo);

    /**
     * 查询所有的基表权益
     * @return
     */
    List<RightDto> queryAllBasicRights();
}