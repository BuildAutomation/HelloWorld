package com.yash;

public class Hello {
	public static void main(String[] args) {
		Message message = new Message();
		message.setUser("Demo");
		System.out.println(message.getMsg());
	}
}
