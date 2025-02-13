package com.proxy.dymanicproxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimerInvocationHandler implements InvocationHandler{
	//目標對象
	private Object target;
	public TimerInvocationHandler(Object target) {
		//賦值給目標對象
		this.target=target;
	}
	//InvocationHandler 內必須是 invoke 由jdk調用
	//invoke在代理類在調用代理方法時被調用
	//invoke由jdk調用,它會自動給我們傳裡面三個參數
	//1.Object proxy 代理對象的引用,比較少用
	//2.Method method 目標對象的目標方法
	//3.Object[] args	目標方法的實參
	
	//invoke方法執行中,使用method來調用目標對象的目標方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long begin =System.currentTimeMillis();
		Object retValue = method.invoke(target, args);
		long end =System.currentTimeMillis();
		System.out.println("耗時"+ (end-begin)+"毫秒");
		//注意這個return ,如果代理對象調用的方法有返回值,invoke必須將目標執行結果繼續返回
		return retValue;
	}

}
