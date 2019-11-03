package com.goclass.mapper;

import com.goclass.pojo.Administrativeclass;
import com.goclass.pojo.AdministrativeclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdministrativeclassMapper {
    long countByExample(AdministrativeclassExample example);

    int deleteByExample(AdministrativeclassExample example);

    int deleteByPrimaryKey(Long administrativeClassroomId);

    int insert(Administrativeclass record);

    int insertSelective(Administrativeclass record);

    List<Administrativeclass> selectByExample(AdministrativeclassExample example);

    Administrativeclass selectByPrimaryKey(Long administrativeClassroomId);

    int updateByExampleSelective(@Param("record") Administrativeclass record, @Param("example") AdministrativeclassExample example);

    int updateByExample(@Param("record") Administrativeclass record, @Param("example") AdministrativeclassExample example);

    int updateByPrimaryKeySelective(Administrativeclass record);

    int updateByPrimaryKey(Administrativeclass record);
}