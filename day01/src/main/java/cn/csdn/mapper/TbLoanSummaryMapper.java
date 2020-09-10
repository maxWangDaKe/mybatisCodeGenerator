package cn.csdn.mapper;

import cn.csdn.pojo.TbLoanSummary;

public interface TbLoanSummaryMapper {
    int deleteByPrimaryKey(String loanSummaryId);

    int insert(TbLoanSummary record);

    int insertSelective(TbLoanSummary record);

    TbLoanSummary selectByPrimaryKey(String loanSummaryId);

    int updateByPrimaryKeySelective(TbLoanSummary record);

    int updateByPrimaryKey(TbLoanSummary record);
}