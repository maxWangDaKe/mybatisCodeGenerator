package cn.csdn.mapper;

import cn.csdn.pojo.TbLoanInfo;

public interface TbLoanInfoMapper {
    int deleteByPrimaryKey(String loanInfoId);

    int insert(TbLoanInfo record);

    int insertSelective(TbLoanInfo record);

    TbLoanInfo selectByPrimaryKey(String loanInfoId);

    int updateByPrimaryKeySelective(TbLoanInfo record);

    int updateByPrimaryKey(TbLoanInfo record);
}