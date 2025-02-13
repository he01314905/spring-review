package com.annotation.bean3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("annotation2.xml");
		MyDataSource myDataSource=	app.getBean("myDataSource",MyDataSource.class);
		System.out.println(myDataSource);
		
		User user = app.getBean("user",User.class);
		System.out.println(user);
	}
}
