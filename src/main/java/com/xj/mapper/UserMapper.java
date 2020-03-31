package com.xj.mapper;

import com.xj.domain.SysRole;
import com.xj.domain.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    SysUser selectById(Long id);
    List<SysUser> selectAll();
    Integer insert(SysUser user);
    Integer insert2(SysUser user);
    Integer insert3(SysUser user);
    Integer updateById(SysUser user);
    List<SysRole> selectRolesByUserIdAndRoleEnabled(@Param("userId") Long userId,@Param("enabled") Integer enabled);
}
