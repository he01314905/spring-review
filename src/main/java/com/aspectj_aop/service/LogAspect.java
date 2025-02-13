package com.aspectj_aop.service;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("logAspect")
@Aspect
@Order(2)
public class LogAspect { //切面
//切面=通知+切點
	//通知就是增加,具體要編寫的增強程式碼
	
	@Pointcut("execution(* com.aspectj_aop.service..*(..))")
	public void commend() {
		//這個方法只是標記,方法名隨意,內容也可不寫
	}
	
	
	
	//Before只要標註就是一個前置通知
	//前置通知
	@Before("commend()")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("我是一個前置通知...");
		//通過方法的簽名 可以獲取一個方法的具體資料
		//獲取目標方法名
		System.out.println("目標方法的方法名:"+joinPoint.getSignature().getName());
	}
	
	//後置通知
	@AfterReturning("commend()")
	public void afterReturningAdvice() {
		System.out.println("我是一個後置通知...");
	}
	
	//環繞通知(最大的通知 前置之前 後置之後)
	@Around("commend()")
	public void aroundAdvice(ProceedingJoinPoint jointPoint) throws Throwable {
		System.out.println("前環繞");
		jointPoint.proceed();
		System.out.println("後環繞");
	}
	
	//異常通知
	@AfterThrowing("commend()")
	public void afterThrowingAdvice() {
		System.out.println("異常通知");
	}
	//最終通知
	@After("commend()")
	public void afterAdvice() {
		System.out.println("最終通知");
	}
	
}
