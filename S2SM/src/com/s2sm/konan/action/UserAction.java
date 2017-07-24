package com.s2sm.konan.action;
import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.s2sm.konan.common.entity.UserList;
import com.s2sm.konan.service.UserService;

public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String password;
	private String question;
	private String answer;
	private String pagename;
	public String getPagename() {
		return pagename;
	}
	public void setPagename(String pagename) {
		this.pagename = pagename;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	private UserService userService;
	private static Logger log = Logger.getLogger(UserAction.class.getName());
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String execute() throws Exception{
		log.info("===CategoryAction execute start=========");
		UserList userList2 = userService.LoginTest(name,password);
		log.info("===CategoryAction execute end=========");
		if(userList2==null){
			return "fail";
		}
		else{ 
			return SUCCESS;
		}

	}
	
	public String jump() throws Exception{
		return this.pagename;
	}
	
	public String updateUserList() throws Exception{
		UserList userList = new UserList();
		userList.setName(name);
		userList.setPassword(password);
		userList.setQuestion(question);
		userList.setAnswer(answer);
		userService.updateUserList(userList);
		return SUCCESS;
	}

}