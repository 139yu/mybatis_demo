package com.xj.mapper;

import com.xj.domain.SysUser;

public interface UserMapper {
    SysUser selectById(Long id);
}
