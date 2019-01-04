package ry.basic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ry.basic.model.Course;



public interface CourseMapper {
    int deleteByPrimaryKey(String cid);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(String cid);
    
    List<Course> selectList();

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

	List<Course> queryList(@Param("items")List<String> items);
}