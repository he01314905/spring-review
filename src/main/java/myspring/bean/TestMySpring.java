package myspring.bean;

import myspring.core.ApplicationContext;
import myspring.core.ClassPathXmlApplicationContext;

public class TestMySpring {

	public static void main(String[] args) {
		ApplicationContext application = new ClassPathXmlApplicationContext("myspring.xml");
		
		Object user = application.getBean("user");
		System.out.println(user);
		UserService userSVC= (UserService)application.getBean("userService");
		userSVC.save();
	}
}
