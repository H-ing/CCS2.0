package com.goclass.mapper;

import com.goclass.pojo.TbFifthResult;

public interface TbFifthResultMapper {
    int deleteByPrimaryKey(Long fiveresultId);

    int insert(TbFifthResult record);

    int insertSelective(TbFifthResult record);

    TbFifthResult selectByPrimaryKey(Long fiveresultId);

    int updateByPrimaryKeySelective(TbFifthResult record);

    int updateByPrimaryKeyWithBLOBs(TbFifthResult record);

    int updateByPrimaryKey(TbFifthResult record);
}