package com.yash;

public class Message {
	private String user;
	private String msg="Welcome to the SampleApp";

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getMsg() {
		return msg+" "+getUser()+" ...!";
	}

}
