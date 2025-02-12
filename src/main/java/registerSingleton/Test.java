package registerSingleton;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class Test {
//將自己已創好實體的bean 納入Spring容器管理
	public static void main(String[] args) {
		Student student=new Student();
		System.out.println(student);
		
		  DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		  factory.registerSingleton("studentBean", student);
		  
		  //從spring容器中獲取
		Student stu=  factory.getBean("studentBean",Student.class);
		System.out.println(stu);
	}
}
