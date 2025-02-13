package com.aspectj_aop.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aspectj_aop.service.OrderService;


public class TestAop {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("aspectj.xml");
//		UserService userSVC = app.getBean("userService",UserService.class);
//		userSVC.login();
//		userSVC.logout();
		
		OrderService order = app.getBean("orderService",OrderService.class);
		order.generate();
		
	}
}
