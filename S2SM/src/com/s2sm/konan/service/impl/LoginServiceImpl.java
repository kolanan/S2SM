package com.s2sm.konan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s2sm.konan.common.entity.User;
import com.s2sm.konan.common.mapper.LoginMapper;
import com.s2sm.konan.service.LoginService;


@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginMapper loginMapper;

	@Override
	public User login(String username, String password) {
		return loginMapper.login(username,password);
	}

	
}
