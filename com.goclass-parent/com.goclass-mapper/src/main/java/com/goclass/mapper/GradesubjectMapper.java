package com.goclass.mapper;

import com.goclass.pojo.Gradesubject;
import com.goclass.pojo.GradesubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradesubjectMapper {
    long countByExample(GradesubjectExample example);

    int deleteByExample(GradesubjectExample example);

    int deleteByPrimaryKey(Long relationshipId);

    int insert(Gradesubject record);

    int insertSelective(Gradesubject record);

    List<Gradesubject> selectByExample(GradesubjectExample example);

    Gradesubject selectByPrimaryKey(Long relationshipId);

    int updateByExampleSelective(@Param("record") Gradesubject record, @Param("example") GradesubjectExample example);

    int updateByExample(@Param("record") Gradesubject record, @Param("example") GradesubjectExample example);

    int updateByPrimaryKeySelective(Gradesubject record);

    int updateByPrimaryKey(Gradesubject record);
}