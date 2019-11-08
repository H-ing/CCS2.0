package com.goclass.mapper;

import com.goclass.pojo.Teacherswill;
import com.goclass.pojo.TeacherswillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherswillMapper {
    long countByExample(TeacherswillExample example);

    int deleteByExample(TeacherswillExample example);

    int deleteByPrimaryKey(Long teachersWillId);

    int insert(Teacherswill record);

    int insertSelective(Teacherswill record);

    List<Teacherswill> selectByExample(TeacherswillExample example);

    Teacherswill selectByPrimaryKey(Long teachersWillId);

    int updateByExampleSelective(@Param("record") Teacherswill record, @Param("example") TeacherswillExample example);

    int updateByExample(@Param("record") Teacherswill record, @Param("example") TeacherswillExample example);

    int updateByPrimaryKeySelective(Teacherswill record);

    int updateByPrimaryKey(Teacherswill record);
}