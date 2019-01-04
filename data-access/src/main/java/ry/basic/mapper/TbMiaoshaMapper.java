package ry.basic.mapper;

import org.apache.ibatis.annotations.Param;

import ry.basic.model.TbMiaosha;



public interface TbMiaoshaMapper {
    int deleteByPrimaryKey(String goodsCode);

    int insert(TbMiaosha record);

    int insertSelective(TbMiaosha record);

    TbMiaosha selectByPrimaryKey(String goodsCode);

    int updateByPrimaryKeySelective(TbMiaosha record);

    int updateByPrimaryKey(TbMiaosha record);
    
    int updateGoodNums(@Param("goodsCode") String goodsCode);
}