package cn.csdn.mapper;

import cn.csdn.pojo.SysMenu;

public interface SysMenuMapper {
    int deleteByPrimaryKey(String menuNum);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(String menuNum);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
}