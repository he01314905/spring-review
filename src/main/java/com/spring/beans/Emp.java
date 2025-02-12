package com.spring.beans;

public class Emp {
	private User user;
	
	public Emp(User user) {
		this.user=user;
		System.out.println("員工正在生成");
	}
	
	public void save() {
		user.insert();
	}
}
