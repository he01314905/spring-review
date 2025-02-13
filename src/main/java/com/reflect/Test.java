package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test {
public static void main(String[] args) throws Exception {
	
	//使用反射機制調用方法
	//獲取類
	Class<?> clazz = Class.forName("com.reflect.SomeService");
	
	//獲取方法
	Method doSomeMethod = clazz.getDeclaredMethod("doSome", String.class,int.class);
	
	//調用方法
	//四要素: 哪個對象,哪個方法,什麼參數,返回什麼值	
//	Constructor<?> con=clazz.getDeclaredConstructor();
//	Object obj =con.newInstance();
	Object obj =clazz.newInstance();
	//上面兩種為取的對象
	//doSomeMethod 哪個方法 ,李四250為參數 returnvalue為返回值
	Object returnvalue = doSomeMethod.invoke(obj,"李四",250);
	System.out.println(returnvalue);
	
	
Method method2 =clazz.getDeclaredMethod("doSome");
	
	Object obj2 = clazz.newInstance();
	method2.invoke(obj);

}
}
