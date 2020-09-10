package cn.csdn.mapper;

import cn.csdn.pojo.TbLoanSpecialcaseinfor;

public interface TbLoanSpecialcaseinforMapper {
    int deleteByPrimaryKey(String id);

    int insert(TbLoanSpecialcaseinfor record);

    int insertSelective(TbLoanSpecialcaseinfor record);

    TbLoanSpecialcaseinfor selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TbLoanSpecialcaseinfor record);

    int updateByPrimaryKey(TbLoanSpecialcaseinfor record);
}