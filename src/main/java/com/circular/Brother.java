package com.circular;

public class Brother {
	private String name;
	private Sister sister;
	
	
	public String getName() {return name;}


	public Brother(String name, Sister sister) {
		super();
		this.name = name;
		this.sister = sister;
	}


	@Override
	public String toString() {
		return "Brother [name=" + name + ", sister=" + sister.getName() + "]";
	}
}
