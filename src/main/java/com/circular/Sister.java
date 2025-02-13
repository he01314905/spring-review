package com.circular;

public class Sister {
	private String name;
	private Brother brother;
	
	public String getName() {return name;}
	
	
	public Sister(String name, Brother brother) {
		super();
		this.name = name;
		this.brother = brother;
	}
	
	@Override
	public String toString() {
		return "Brother [name=" + name + ", brother=" + brother.getName() + "]";
	}

}
