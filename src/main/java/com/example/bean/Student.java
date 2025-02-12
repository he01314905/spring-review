package com.example.bean;

public class Student {
	private String name;

	private Clazz clazz;
	

	public String getName() {
		return name;
	}

	public Clazz getClazz() {
		return clazz;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", clazz=" + clazz + "]";
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
