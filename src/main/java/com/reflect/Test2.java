package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test2 {
public static void main(String[] args) throws Exception {
	
	/*
	 * 1.知悉一個類,com.reflect.User
	 * 2.這個類符合javabean規範,屬性私有化,提供setter,getter
	 * 3.知道內部有一個age屬性,也知道他是int型別
	 * 請利用反射機制調用set方法,給User的age賦值
	 * */
	
	String className="com.reflect.User";
	String propertyName ="age";
	
	//先獲取類
	Class<?> clazz = Class.forName(className);
	//獲取方法名
	String setMethodName = "set"+propertyName.toUpperCase().charAt(0)+propertyName.substring(1);
	
	//根據屬性名取得屬性類型
	Field field=clazz.getDeclaredField(propertyName);
	
	Method method =clazz.getDeclaredMethod(setMethodName, field.getType());
	
	Object obj = clazz.newInstance();
	
	method.invoke(obj, 30);
	System.out.println(obj);
}
}
