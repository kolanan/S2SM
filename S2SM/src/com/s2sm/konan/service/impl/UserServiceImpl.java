package com.s2sm.konan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s2sm.konan.common.entity.UserList;
import com.s2sm.konan.common.mapper.UserMapper;
import com.s2sm.konan.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper userMapper;
	
	
	@Override
	public UserList LoginTest(String name, String password) {
			return userMapper.LoginTest(name,password);
	}


	@Override
	public void updateUserList(UserList userList) {
		userMapper.updateUserList(userList);
		
	}

	

}
