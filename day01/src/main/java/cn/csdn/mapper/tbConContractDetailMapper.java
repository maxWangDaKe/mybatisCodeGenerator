package cn.csdn.mapper;

import cn.csdn.pojo.tbConContractDetail;

public interface tbConContractDetailMapper {
    int deleteByPrimaryKey(String contractDetailId);

    int insert(tbConContractDetail record);

    int insertSelective(tbConContractDetail record);

    tbConContractDetail selectByPrimaryKey(String contractDetailId);

    int updateByPrimaryKeySelective(tbConContractDetail record);

    int updateByPrimaryKey(tbConContractDetail record);
}