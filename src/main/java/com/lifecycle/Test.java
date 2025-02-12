package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	//Spring 如果 scope不是singleton 只會管理前8步 後面兩個destory不管
	ApplicationContext applicationContext =new ClassPathXmlApplicationContext("life.xml");
//	Vip vip =applicationContext.getBean("vip",Vip.class);
	User user = applicationContext.getBean("user",User.class);
	System.out.println("第六步,使用bean: " +user);
	
	ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext)applicationContext;
	context.close();
}
}
