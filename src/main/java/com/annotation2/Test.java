package com.annotation2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation2.service.OrderService;
import com.annotation2.service.StudentService;

public class Test {
	public static void main(String[] args) {
		
		//如果裝配的對象有實作兩個以上 可以利用 Autowired 搭配 Qualfier byName的方式 
		
		
		ApplicationContext app = new ClassPathXmlApplicationContext("autowired.xml");
		OrderService orderSVC= app.getBean("orderService",OrderService.class);
		orderSVC.generate();
		
		StudentService studentSVC =app.getBean("studentService",StudentService.class);
		studentSVC.deleteStudent();
	}
}
