package com.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class User implements BeanNameAware,BeanClassLoaderAware,BeanFactoryAware,InitializingBean,DisposableBean{
	private String name;

	public void setName(String name) {
		System.out.println("第二步,給對象屬性賦值");
		this.name = name;
	}
public User() {
	System.out.println("第一步,無參數建構子執行");
}

public void initBean() {
	System.out.println("第四部,初始化Bean");
}

public void destoryBean() {
	System.out.println("第七步,銷毀Bean");
}
@Override
public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
	System.out.println("生產這個Bean的工廠對象是:"+beanFactory);
	
}
@Override
public void setBeanClassLoader(ClassLoader classLoader) {
	System.out.println("Bean這個類的加載器:"+classLoader);
	
}
@Override
public void setBeanName(String name) {
	System.out.println("這個bean的名字是:"+name);
	
}
@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("InitializingBean afterPropertiesSet執行");
	
}
@Override
public void destroy() throws Exception {
	System.out.println("DisposableBean destory執行");
	
}

}
