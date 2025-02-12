package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		User user =applicationContext.getBean("user",User.class);
		Emp emp = applicationContext.getBean("emp",Emp.class);
		emp.save();
	
		OrderService order=applicationContext.getBean("orderService",OrderService.class);
		order.generate();
		
		OrderService order2=applicationContext.getBean("orderService2",OrderService.class);
		order2.generate();
		
	}
}
