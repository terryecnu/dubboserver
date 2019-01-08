package com.bestpay.member.mapper;

import com.bestpay.member.dto.RightDto;
import com.bestpay.member.dto.RightInfoDto;
import com.bestpay.member.po.Right;

import java.util.List;

public interface RightMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer insuranceCrmRightId);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insert(Right record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(Right record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    Right selectByPrimaryKey(Integer insuranceCrmRightId);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(Right record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeyWithBLOBs(Right record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(Right record);

    /**
     * 查询所有的权益
     * @return
     */
    List<RightDto> selectAll();

    /**
     * 查询权益详情
     * @param rightId
     * @return
     */
    RightInfoDto selectByRightId(Integer rightId);

    /**
     * 获取所有暗图标权益
     * @return
     */
    List<RightDto> selectAllDarkImgRights();
    
    List<Right> selectByRankId(Integer rankId);
    
}