package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient_7_6 {
	public static void main(String[] args) {
		// 1. Spring Container working
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");

		// 2. Spring Container to UserServiceImpl object Lookup
		UserService userService = (UserService) container.getBean("userService");

		// 3. Login function Test
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");

		UserVO user = userService.getUser(vo);
		if (user != null) {
			System.out.println(user.getName() + " 님 환영합니다.");
		} else {
			System.out.println("Login Fail");
		}

		// 4. Quit Container.
		container.close();

	}
}
