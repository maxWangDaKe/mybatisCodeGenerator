package cn.csdn.mapper;

import cn.csdn.pojo.TbLoanDetail;

public interface TbLoanDetailMapper {
    int deleteByPrimaryKey(String loanDetailId);

    int insert(TbLoanDetail record);

    int insertSelective(TbLoanDetail record);

    TbLoanDetail selectByPrimaryKey(String loanDetailId);

    int updateByPrimaryKeySelective(TbLoanDetail record);

    int updateByPrimaryKey(TbLoanDetail record);
}