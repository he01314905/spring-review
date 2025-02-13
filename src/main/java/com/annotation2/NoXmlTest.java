package com.annotation2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotation2.service.StudentService;

public class NoXmlTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=	new AnnotationConfigApplicationContext(Spring6Config.class);
		StudentService studentSVC = ac.getBean("studentService",StudentService.class);
		studentSVC.deleteStudent();
	
	}
}
