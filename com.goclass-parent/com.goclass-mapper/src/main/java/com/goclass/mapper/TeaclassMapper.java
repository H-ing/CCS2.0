package com.goclass.mapper;

import com.goclass.pojo.Teaclass;
import com.goclass.pojo.TeaclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeaclassMapper {
    long countByExample(TeaclassExample example);

    int deleteByExample(TeaclassExample example);

    int insert(Teaclass record);

    int insertSelective(Teaclass record);

    List<Teaclass> selectByExample(TeaclassExample example);

    int updateByExampleSelective(@Param("record") Teaclass record, @Param("example") TeaclassExample example);

    int updateByExample(@Param("record") Teaclass record, @Param("example") TeaclassExample example);
}