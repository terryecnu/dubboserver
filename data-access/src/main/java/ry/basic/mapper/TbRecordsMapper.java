package ry.basic.mapper;

import ry.basic.model.TbRecords;

public interface TbRecordsMapper {
    int deleteByPrimaryKey(Integer recordsId);

    int insert(TbRecords record);

    int insertSelective(TbRecords record);

    TbRecords selectByPrimaryKey(Integer recordsId);

    int updateByPrimaryKeySelective(TbRecords record);

    int updateByPrimaryKey(TbRecords record);
}