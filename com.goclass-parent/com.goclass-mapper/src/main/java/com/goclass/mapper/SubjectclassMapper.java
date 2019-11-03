package com.goclass.mapper;

import com.goclass.pojo.Subjectclass;
import com.goclass.pojo.SubjectclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectclassMapper {
    long countByExample(SubjectclassExample example);

    int deleteByExample(SubjectclassExample example);

    int deleteByPrimaryKey(Long subjectClassroomId);

    int insert(Subjectclass record);

    int insertSelective(Subjectclass record);

    List<Subjectclass> selectByExample(SubjectclassExample example);

    Subjectclass selectByPrimaryKey(Long subjectClassroomId);

    int updateByExampleSelective(@Param("record") Subjectclass record, @Param("example") SubjectclassExample example);

    int updateByExample(@Param("record") Subjectclass record, @Param("example") SubjectclassExample example);

    int updateByPrimaryKeySelective(Subjectclass record);

    int updateByPrimaryKey(Subjectclass record);
}