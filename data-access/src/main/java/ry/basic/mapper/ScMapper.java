package ry.basic.mapper;


import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import ry.basic.model.Sc;

public interface ScMapper {
    int deleteByPrimaryKey(@Param("sid") String sid, @Param("cid") String cid);

    int insert(Sc record);

    int insertSelective(Sc record);

    Sc selectByPrimaryKey(@Param("sid") String sid, @Param("cid") String cid);
    
    List<Sc> selectList(@Param("sid") String sid, @Param("time") Date time);


    int updateByPrimaryKeySelective(Sc record);

    int updateByPrimaryKey(Sc record);
}