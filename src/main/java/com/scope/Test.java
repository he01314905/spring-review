package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.User;

public class Test {
public static void main(String[] args) {
	//Spring默認Singleton
	//配置文件 scope=singleton,prototype ,如果要其他選項例如 session request 需要dependency spring-webmvc
	
	
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("scope.xml");
	SpringBean scope =applicationContext.getBean("scope",SpringBean.class);
	System.out.println(scope);
	SpringBean scope1=applicationContext.getBean("scope",SpringBean.class);
	System.out.println(scope1);
	
	new Thread(new Runnable() {

		@Override
		public void run() {
			SpringBean scope3=applicationContext.getBean("scope",SpringBean.class);
			System.out.println(scope3);
			SpringBean scope4=applicationContext.getBean("scope",SpringBean.class);
			System.out.println(scope4);
		}
		
	}).start();
}
}
