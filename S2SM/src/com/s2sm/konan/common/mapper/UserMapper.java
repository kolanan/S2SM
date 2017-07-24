package com.s2sm.konan.common.mapper;

import com.s2sm.konan.common.entity.UserList;

public interface UserMapper {

	UserList LoginTest(String name,String password);
	
	void updateUserList(UserList userList);
}
