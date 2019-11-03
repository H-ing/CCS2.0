package com.goclass.mapper;

import com.goclass.pojo.Timer;
import com.goclass.pojo.TimerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimerMapper {
    long countByExample(TimerExample example);

    int deleteByExample(TimerExample example);

    int deleteByPrimaryKey(Long timerId);

    int insert(Timer record);

    int insertSelective(Timer record);

    List<Timer> selectByExample(TimerExample example);

    Timer selectByPrimaryKey(Long timerId);

    int updateByExampleSelective(@Param("record") Timer record, @Param("example") TimerExample example);

    int updateByExample(@Param("record") Timer record, @Param("example") TimerExample example);

    int updateByPrimaryKeySelective(Timer record);

    int updateByPrimaryKey(Timer record);
}