package com.proxy.dymanicproxy.util;

import java.lang.reflect.Proxy;

import com.proxy.dymanicproxy.service.OrderService;
import com.proxy.dymanicproxy.service.TimerInvocationHandler;

public class ProxyUtil {
	
	//封裝一個工具方法,通過這個方法獲取代理對象
	
	public static Object newProxyInstance(Object target) {
		//newProxyInstance 有三個參數
				//1.ClassLoader loader  記憶體中的字節碼也是class文件,要執行必須通過類加載器,並且要與目標對象使用同一個加載器
				//2.Class<?>[] interfaces 代理類和目標類須實現同一個或同一些介面
				//3.InvocationHandler h 被翻譯為: 調用處理器 是一個介面,在裡面所編寫的就是 增強代碼 既然是介面就需要實現類
				return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
						target.getClass().getInterfaces(), 
						new TimerInvocationHandler(target));
	}
}
