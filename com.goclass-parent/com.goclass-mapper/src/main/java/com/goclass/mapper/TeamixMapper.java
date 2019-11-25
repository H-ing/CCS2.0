package com.goclass.mapper;

import com.goclass.pojo.Teamix;
import com.goclass.pojo.TeamixExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamixMapper {
    long countByExample(TeamixExample example);

    int deleteByExample(TeamixExample example);

    int deleteByPrimaryKey(Long teaclassId);

    int insert(Teamix record);

    int insertSelective(Teamix record);

    List<Teamix> selectByExample(TeamixExample example);

    Teamix selectByPrimaryKey(Long teaclassId);

    int updateByExampleSelective(@Param("record") Teamix record, @Param("example") TeamixExample example);

    int updateByExample(@Param("record") Teamix record, @Param("example") TeamixExample example);

    int updateByPrimaryKeySelective(Teamix record);

    int updateByPrimaryKey(Teamix record);
}