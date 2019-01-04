package ry.basic.mapper;


import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import ry.basic.model.DataProcessor;

public interface DataProcessorMapper {
    int deleteByPrimaryKey(@Param("idProject") String idProject, @Param("idContract") String idContract, @Param("curTerm") Integer curTerm, @Param("dtObserve") Date dtObserve, @Param("flgValid") String flgValid);

    int insert(DataProcessor record);

    int insertSelective(DataProcessor record);

    DataProcessor selectByPrimaryKey(@Param("idProject") String idProject, @Param("idContract") String idContract, @Param("curTerm") Integer curTerm, @Param("dtObserve") Date dtObserve, @Param("flgValid") String flgValid);

    int updateByPrimaryKeySelective(DataProcessor record);

    int updateByPrimaryKey(DataProcessor record);
    
    void batchInsert(List<DataProcessor> dataProcessors);
    
    List<DataProcessor> batchfetch(@Param("beg") int beg, @Param("end") int end);
}