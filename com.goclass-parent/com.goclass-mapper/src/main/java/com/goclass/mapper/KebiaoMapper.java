package com.goclass.mapper;

import com.goclass.pojo.Kebiao;
import com.goclass.pojo.KebiaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KebiaoMapper {
    long countByExample(KebiaoExample example);

    int deleteByExample(KebiaoExample example);

    int deleteByPrimaryKey(Long schedulId);

    int insert(Kebiao record);

    int insertSelective(Kebiao record);

    List<Kebiao> selectByExample(KebiaoExample example);

    Kebiao selectByPrimaryKey(Long schedulId);

    int updateByExampleSelective(@Param("record") Kebiao record, @Param("example") KebiaoExample example);

    int updateByExample(@Param("record") Kebiao record, @Param("example") KebiaoExample example);

    int updateByPrimaryKeySelective(Kebiao record);

    int updateByPrimaryKey(Kebiao record);
}