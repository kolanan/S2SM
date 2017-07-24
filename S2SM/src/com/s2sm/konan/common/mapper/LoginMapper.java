package com.s2sm.konan.common.mapper;

import com.s2sm.konan.common.entity.User;

public interface LoginMapper {
	 User login(String username,String password);
}
