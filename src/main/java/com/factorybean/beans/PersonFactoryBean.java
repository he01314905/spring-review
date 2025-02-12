package com.factorybean.beans;

import org.springframework.beans.factory.FactoryBean;


//工廠bean 可以獲取普通bean
public class PersonFactoryBean implements FactoryBean<Person>{

	@Override
	public Person getObject() throws Exception {
		return new Person();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean isSingleton() {
		return true;
	}

}
