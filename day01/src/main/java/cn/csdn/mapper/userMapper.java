package cn.csdn.mapper;

import cn.csdn.pojo.user;

public interface userMapper {
    int deleteByPrimaryKey(String number);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(String number);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
}