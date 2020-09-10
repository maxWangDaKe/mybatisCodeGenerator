package cn.csdn.mapper;

import cn.csdn.pojo.TbLoanIntRate;

public interface TbLoanIntRateMapper {
    int deleteByPrimaryKey(String loanIntRateId);

    int insert(TbLoanIntRate record);

    int insertSelective(TbLoanIntRate record);

    TbLoanIntRate selectByPrimaryKey(String loanIntRateId);

    int updateByPrimaryKeySelective(TbLoanIntRate record);

    int updateByPrimaryKey(TbLoanIntRate record);
}