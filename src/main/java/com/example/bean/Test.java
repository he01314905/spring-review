package com.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Emp;
import com.spring.beans.OrderService;
import com.spring.beans.User;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("example.xml");
		Student student =applicationContext.getBean("studentBean",Student.class);
		System.out.println(student);
		Clazz clazz = applicationContext.getBean("clazzBean",Clazz.class);
		System.out.println(clazz);
		Array array = applicationContext.getBean("array",Array.class);
		System.out.println(array);
		MathBean math = applicationContext.getBean("mathBean",MathBean.class);
		System.out.println(math);
		
		ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("springCollection.xml");
		ListSet listSet =applicationContext1.getBean("listSet",ListSet.class);
		System.out.println(listSet);
		
		ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("pc.xml");
		Dog dog =applicationContext2.getBean("dogBean",Dog.class);
		System.out.println(dog);
		
		People people=applicationContext2.getBean("people",People.class);
		System.out.println(people);
	}
}
