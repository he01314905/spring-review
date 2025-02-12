package com.example.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListSet {
	private List<String> names;
	
	private Set<String> address;

	private Map<Integer,String> phones;
	
	public Map<Integer, String> getPhones() {
		return phones;
	}

	public void setPhones(Map<Integer, String> phones) {
		this.phones = phones;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	

	public Set<String> getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "ListSet [names=" + names + ", address=" + address + ", phones=" + phones + "]";
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}
}
