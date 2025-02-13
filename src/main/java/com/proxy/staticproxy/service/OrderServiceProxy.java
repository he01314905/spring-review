package com.proxy.staticproxy.service;

//代理對象 代理對象要與目標對象有相同行為,實現同一個或同一些介面
public class OrderServiceProxy implements OrderService{

	//將目標對象作為代理對象一個屬性,這種關係叫做關聯關係,比繼承關係的耦合度低
	//has a 
	//這裡要寫公共介面類型,因為耦合度低
	private OrderService target;
	
	//創建對象的時候將目標對象傳給介面
	public OrderServiceProxy(OrderService target) {
		this.target = target;
	}


	public void generate() { //代理方法
		long begin =System.currentTimeMillis();
		target.generate();
		long end =System.currentTimeMillis();
		System.out.println("耗時"+ (end-begin)+"毫秒");
		
	}

	
	public void modify() {//代理方法
		long begin =System.currentTimeMillis();
		target.modify();
		long end =System.currentTimeMillis();
		System.out.println("耗時"+ (end-begin)+"毫秒");
	}

	
	public void detail() {//代理方法
		long begin =System.currentTimeMillis();
		target.detail();
		long end =System.currentTimeMillis();
		System.out.println("耗時"+ (end-begin)+"毫秒");
		
	}

}
