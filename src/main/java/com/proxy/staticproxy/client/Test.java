package com.proxy.staticproxy.client;

import com.proxy.staticproxy.service.OrderService;
import com.proxy.staticproxy.service.OrderServiceImpl;
import com.proxy.staticproxy.service.OrderServiceProxy;

public class Test {
	public static void main(String[] args) {
//		OrderService orderSVC =new OrderServiceImpl();
//		orderSVC.generate();
//		orderSVC.detail();
//		orderSVC.modify();
		
		//創建目標對象
		OrderService target =new OrderServiceImpl();
		//創建代理對象
		OrderServiceProxy proxy = new OrderServiceProxy(target);
		proxy.generate();
		proxy.detail();
		proxy.modify();
	}
}
