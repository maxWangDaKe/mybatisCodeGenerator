package cn.csdn.mapper;

import cn.csdn.pojo.TbConRate;

public interface TbConRateMapper {
    int deleteByPrimaryKey(String bizIntRateId);

    int insert(TbConRate record);

    int insertSelective(TbConRate record);

    TbConRate selectByPrimaryKey(String bizIntRateId);

    int updateByPrimaryKeySelective(TbConRate record);

    int updateByPrimaryKey(TbConRate record);
}