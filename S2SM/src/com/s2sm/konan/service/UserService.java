package com.s2sm.konan.service;

import com.s2sm.konan.common.entity.UserList;

public interface UserService {

	UserList LoginTest(String name,String password);
	
	void updateUserList(UserList userList);
}
