package myspring.core;

public interface ApplicationContext {
	
	//根據bean名稱獲取該對象
	Object getBean(String beanName);
}
