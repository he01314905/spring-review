package com.circular;

import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		//沒有產生循環是因為 toString方法調用的是另一半的getName()方法 而非創建對象
	
		ApplicationContext application=new ClassPathXmlApplicationContext("circle.xml");
		Husband husband= application.getBean("husbandBean",Husband.class);
		Wife wife=application.getBean("wifeBean",Wife.class);
		System.out.println(husband);
		System.out.println(wife);
		
//		Brother br=application.getBean("b",Brother.class);
//		Sister si=application.getBean("s",Sister.class);
//		System.out.println(br);
//		System.out.println(si);
		
		
	}
}
