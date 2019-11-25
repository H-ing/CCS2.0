package com.goclass.mapper;

import com.goclass.pojo.Mixadmin;
import com.goclass.pojo.MixadminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MixadminMapper {
    long countByExample(MixadminExample example);

    int deleteByExample(MixadminExample example);

    int deleteByPrimaryKey(Long mixId);

    int insert(Mixadmin record);

    int insertSelective(Mixadmin record);

    List<Mixadmin> selectByExample(MixadminExample example);

    Mixadmin selectByPrimaryKey(Long mixId);

    int updateByExampleSelective(@Param("record") Mixadmin record, @Param("example") MixadminExample example);

    int updateByExample(@Param("record") Mixadmin record, @Param("example") MixadminExample example);

    int updateByPrimaryKeySelective(Mixadmin record);

    int updateByPrimaryKey(Mixadmin record);
}