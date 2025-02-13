package com.proxy.dymanicproxy.client;

import java.lang.reflect.Proxy;

import com.proxy.dymanicproxy.service.OrderService;
import com.proxy.dymanicproxy.service.OrderServiceImpl;
import com.proxy.dymanicproxy.service.TimerInvocationHandler;
import com.proxy.dymanicproxy.util.ProxyUtil;



public class Client {
	public static void main(String[] args) {
		//創建目標對象
		OrderService target =new OrderServiceImpl();
		//創建代理對象(類加載器,代理類要實現的介面,調用處理器)
		//1. 在記憶體中動態生成代理類的字節碼class
		//2. new對象了,通過記憶體中生成的代理類這個代碼,實例化代理對象
		
		//newProxyInstance 有三個參數
		//1.ClassLoader loader  記憶體中的字節碼也是class文件,要執行必須通過類加載器,並且要與目標對象使用同一個加載器
		//2.Class<?>[] interfaces 代理類和目標類須實現同一個或同一些介面
		//3.InvocationHandler h 被翻譯為: 調用處理器 是一個介面,在裡面所編寫的就是 增強代碼 既然是介面就需要實現類
//		OrderService proxyObj =(OrderService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new TimerInvocationHandler(target));
		OrderService proxyObj=(OrderService)ProxyUtil.newProxyInstance(target);
		//調用代理對象要代理的方法
		//調用代理對象的代理方法,如果要做增強,目標對象的方法要保證執行
		proxyObj.detail();
		proxyObj.generate();
		proxyObj.modify();
		String name =proxyObj.getName();
		System.out.println(name);
	}
}
