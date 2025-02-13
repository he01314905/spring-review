package com.reflect;

public class SomeService {

	public void doSome() {
		System.out.println("doSome方法執行");
	}
	
	public String doSome(String s) {
		System.out.println("doSome(String s)方法執行");
		return s;
	}
	
	public String doSome(String s,int x) {
		System.out.println("doSome(String s,int x)方法執行");
		return s+x;
	}
}
