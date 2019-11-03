package com.goclass.mapper;

import com.goclass.pojo.Selectiondetailed;
import com.goclass.pojo.SelectiondetailedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelectiondetailedMapper {
    long countByExample(SelectiondetailedExample example);

    int deleteByExample(SelectiondetailedExample example);

    int deleteByPrimaryKey(Long selectionDetailedId);

    int insert(Selectiondetailed record);

    int insertSelective(Selectiondetailed record);

    List<Selectiondetailed> selectByExample(SelectiondetailedExample example);

    Selectiondetailed selectByPrimaryKey(Long selectionDetailedId);

    int updateByExampleSelective(@Param("record") Selectiondetailed record, @Param("example") SelectiondetailedExample example);

    int updateByExample(@Param("record") Selectiondetailed record, @Param("example") SelectiondetailedExample example);

    int updateByPrimaryKeySelective(Selectiondetailed record);

    int updateByPrimaryKey(Selectiondetailed record);
}