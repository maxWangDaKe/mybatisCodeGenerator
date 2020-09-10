package cn.csdn.mapper;

import cn.csdn.pojo.tbConAccountInfo;

public interface tbConAccountInfoMapper {
    int deleteByPrimaryKey(String accountId);

    int insert(tbConAccountInfo record);

    int insertSelective(tbConAccountInfo record);

    tbConAccountInfo selectByPrimaryKey(String accountId);

    int updateByPrimaryKeySelective(tbConAccountInfo record);

    int updateByPrimaryKey(tbConAccountInfo record);
}