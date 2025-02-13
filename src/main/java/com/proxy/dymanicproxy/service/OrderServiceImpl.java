package com.proxy.dymanicproxy.service;

public class OrderServiceImpl implements OrderService{

	
	public void generate() {
		try {
			Thread.sleep(1234);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("訂單已生成");
		
	}

	
	public void modify() {
		try {
			Thread.sleep(456);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("訂單已修改");
		
	}

	
	public void detail() {
		try {
			Thread.sleep(111);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("訂單詳情");
		
	}


	public String getName() {
		System.out.println("getName()方法執行");
		return "張三";
	}

}
