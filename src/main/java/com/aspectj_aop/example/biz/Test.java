package com.aspectj_aop.example.biz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext app = new ClassPathXmlApplicationContext("aspectj2.xml");
	UserService  userService=app.getBean("userService",UserService.class);
	VipService vipService = app.getBean("vipService",VipService.class);
	userService.saveUser();
	userService.deleteUser();
	userService.modifyUser();
	userService.getUser();
	vipService.saveVip();
	vipService.deleteVip();
	vipService.modifyVip();
	vipService.getVip();
	
}
}
