package com.factorybean.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class DateFactoryBean implements FactoryBean<Date>{
	
		private String strDate;
		
	@Override
	public Date getObject() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date date = sdf.parse(strDate);
		return date;
	}

	public DateFactoryBean(String strDate) {
		super();
		this.strDate = strDate;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

}
