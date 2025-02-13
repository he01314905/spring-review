package com.aspectj_aop.example.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext app = new ClassPathXmlApplicationContext("aspectj2.xml");
	AccountService acc = app.getBean("accountService",AccountService.class);
	OrderService order = app.getBean("orderService",OrderService.class);
	acc.transfer();
	acc.withdraw();
	order.generate();
	order.cancel();
}
}
