package cn.csdn.mapper;

import cn.csdn.pojo.TbLoanFee;

public interface TbLoanFeeMapper {
    int deleteByPrimaryKey(String feeId);

    int insert(TbLoanFee record);

    int insertSelective(TbLoanFee record);

    TbLoanFee selectByPrimaryKey(String feeId);

    int updateByPrimaryKeySelective(TbLoanFee record);

    int updateByPrimaryKey(TbLoanFee record);
}