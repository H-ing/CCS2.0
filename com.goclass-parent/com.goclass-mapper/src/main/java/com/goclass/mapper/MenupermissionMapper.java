package com.goclass.mapper;

import com.goclass.pojo.Menupermission;
import com.goclass.pojo.MenupermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenupermissionMapper {
    long countByExample(MenupermissionExample example);

    int deleteByExample(MenupermissionExample example);

    int deleteByPrimaryKey(Long menuId);

    int insert(Menupermission record);

    int insertSelective(Menupermission record);

    List<Menupermission> selectByExample(MenupermissionExample example);

    Menupermission selectByPrimaryKey(Long menuId);

    int updateByExampleSelective(@Param("record") Menupermission record, @Param("example") MenupermissionExample example);

    int updateByExample(@Param("record") Menupermission record, @Param("example") MenupermissionExample example);

    int updateByPrimaryKeySelective(Menupermission record);

    int updateByPrimaryKey(Menupermission record);
}