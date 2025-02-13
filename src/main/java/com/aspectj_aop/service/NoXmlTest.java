package com.aspectj_aop.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NoXmlTest {
	public static void main(String[] args) {
	ApplicationContext app =new AnnotationConfigApplicationContext(Spring6Config.class);
		OrderService orderSVC =app.getBean("orderService",OrderService.class);
		orderSVC.generate();
	}
}
