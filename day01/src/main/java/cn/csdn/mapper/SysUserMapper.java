package cn.csdn.mapper;

import cn.csdn.pojo.SysUser;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    int deleteByPrimaryKey(@Param("id") String id, @Param("userNum") String userNum);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(@Param("id") String id, @Param("userNum") String userNum);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}