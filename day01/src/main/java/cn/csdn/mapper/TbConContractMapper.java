package cn.csdn.mapper;

import cn.csdn.pojo.TbConContract;

public interface TbConContractMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_con_contract
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String contractId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_con_contract
     *
     * @mbg.generated
     */
    int insert(TbConContract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_con_contract
     *
     * @mbg.generated
     */
    int insertSelective(TbConContract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_con_contract
     *
     * @mbg.generated
     */
    TbConContract selectByPrimaryKey(String contractId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_con_contract
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TbConContract record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_con_contract
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TbConContract record);
}