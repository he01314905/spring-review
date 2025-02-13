package com.circular;

public class Wife {
	
	private String name;
	private Husband husband;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Husband getHusband() {
		return husband;
	}


	public void setHusband(Husband husband) {
		this.husband = husband;
	}


	@Override
	public String toString() {
		return "Wife [name=" + name + ", husband=" + husband.getName() + "]";
	}
	
}
