package com.goclass.mapper;

import com.goclass.pojo.Timetablerule;
import com.goclass.pojo.TimetableruleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimetableruleMapper {
    long countByExample(TimetableruleExample example);

    int deleteByExample(TimetableruleExample example);

    int deleteByPrimaryKey(Long timetableRuleId);

    int insert(Timetablerule record);

    int insertSelective(Timetablerule record);

    List<Timetablerule> selectByExample(TimetableruleExample example);

    Timetablerule selectByPrimaryKey(Long timetableRuleId);

    int updateByExampleSelective(@Param("record") Timetablerule record, @Param("example") TimetableruleExample example);

    int updateByExample(@Param("record") Timetablerule record, @Param("example") TimetableruleExample example);

    int updateByPrimaryKeySelective(Timetablerule record);

    int updateByPrimaryKey(Timetablerule record);
}