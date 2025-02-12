package com.factorybean.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factory.xml");
	Gun gun =applicationContext.getBean("gun",Gun.class);
	System.out.println(gun);
	
	Person person = applicationContext.getBean("person",Person.class);
	System.out.println(person);
	
	Student student =applicationContext.getBean("student",Student.class);
	System.out.println(student);
}
}
