package com.s2sm.konan.action;

import com.s2sm.konan.common.entity.User;
import com.s2sm.konan.service.LoginService;

public class LoginAction {
	private String username;
	private String password;
	LoginService loginService;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String doLogin() throws Exception{
		User user = new User();
		user = loginService.login(username, password);
		if(user != null){
			return "yes";
		}
		return "no";
		
	}
}
