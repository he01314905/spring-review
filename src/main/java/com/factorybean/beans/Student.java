package com.factorybean.beans;

import java.util.Date;

public class Student {

	//java.util.Date 被Spring當作簡單類型 但日期格式有要求
	private Date birth;

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Student [birth=" + birth + "]";
	}
	
}
