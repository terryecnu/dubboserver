package com.bestpay.member.mapper;

import com.bestpay.member.po.CustomerTask;
import org.apache.ibatis.annotations.Param;

public interface CustomerTaskMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer customerTaskId);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insert(CustomerTask record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(CustomerTask record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    CustomerTask selectByPrimaryKey(Integer customerTaskId);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(CustomerTask record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(CustomerTask record);

    /**
     * 查询(当月&当日)用户完成分享记录条数(0-全部 1-月，2-日)
     */
    int selectShareOrSignUpTaskCountByType(@Param("taskId") Integer taskId, @Param("userNo") String userNo,
                                           @Param("type") Integer type);
}