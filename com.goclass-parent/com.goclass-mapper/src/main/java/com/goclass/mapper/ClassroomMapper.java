package com.goclass.mapper;

import com.goclass.pojo.Classroom;
import com.goclass.pojo.ClassroomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassroomMapper {
    long countByExample(ClassroomExample example);

    int deleteByExample(ClassroomExample example);

    int deleteByPrimaryKey(Long classroomId);

    int insert(Classroom record);

    int insertSelective(Classroom record);

    List<Classroom> selectByExample(ClassroomExample example);

    Classroom selectByPrimaryKey(Long classroomId);

    int updateByExampleSelective(@Param("record") Classroom record, @Param("example") ClassroomExample example);

    int updateByExample(@Param("record") Classroom record, @Param("example") ClassroomExample example);

    int updateByPrimaryKeySelective(Classroom record);

    int updateByPrimaryKey(Classroom record);
}