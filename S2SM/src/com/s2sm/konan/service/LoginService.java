package com.s2sm.konan.service;

import com.s2sm.konan.common.entity.User;

public interface LoginService {
	User login(String username,String password);
}
