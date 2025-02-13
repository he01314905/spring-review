package com.annotation.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation.dao.OrderDao;

public class Test {
public static void main(String[] args) {
//	annotation 的 value 可以省略 如果沒給value的值 會以Class首字母小寫為名稱
	
	ApplicationContext application = new ClassPathXmlApplicationContext("annotation.xml");
	User user = application.getBean("userBean",User.class);
	System.out.println(user);
	Vip vip = application.getBean("vipBean",Vip.class);
	System.out.println(vip);
	Order order =application.getBean("orderBean",Order.class);
	System.out.println(order);
	Student student =application.getBean("studentBean",Student.class);
	System.out.println(student);
	
	OrderDao orderDao =application.getBean("orderDao",OrderDao.class);
	System.out.println(orderDao);
	
}
}
