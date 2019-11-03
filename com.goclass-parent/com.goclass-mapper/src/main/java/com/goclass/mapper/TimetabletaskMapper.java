package com.goclass.mapper;

import com.goclass.pojo.Timetabletask;
import com.goclass.pojo.TimetabletaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimetabletaskMapper {
    long countByExample(TimetabletaskExample example);

    int deleteByExample(TimetabletaskExample example);

    int deleteByPrimaryKey(Long timetableTaskId);

    int insert(Timetabletask record);

    int insertSelective(Timetabletask record);

    List<Timetabletask> selectByExample(TimetabletaskExample example);

    Timetabletask selectByPrimaryKey(Long timetableTaskId);

    int updateByExampleSelective(@Param("record") Timetabletask record, @Param("example") TimetabletaskExample example);

    int updateByExample(@Param("record") Timetabletask record, @Param("example") TimetabletaskExample example);

    int updateByPrimaryKeySelective(Timetabletask record);

    int updateByPrimaryKey(Timetabletask record);
}