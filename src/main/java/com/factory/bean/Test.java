package com.factory.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("star.xml");
	Star star =applicationContext.getBean("starBean",Star.class);
	System.out.println(star);
}
}
