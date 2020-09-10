package cn.csdn.mapper;

import cn.csdn.pojo.TbLoanAccountInfo;

public interface TbLoanAccountInfoMapper {
    int deleteByPrimaryKey(String accountId);

    int insert(TbLoanAccountInfo record);

    int insertSelective(TbLoanAccountInfo record);

    TbLoanAccountInfo selectByPrimaryKey(String accountId);

    int updateByPrimaryKeySelective(TbLoanAccountInfo record);

    int updateByPrimaryKey(TbLoanAccountInfo record);
}