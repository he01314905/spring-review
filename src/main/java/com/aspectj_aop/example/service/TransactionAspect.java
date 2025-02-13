package com.aspectj_aop.example.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionAspect {

	@Around("execution(* com.aspectj_aop.example.service..*(..))")
	public void aroundAdvice(ProceedingJoinPoint jointPoint) {
		try {
			System.out.println("開啟事務");
			
			jointPoint.proceed();
			System.out.println("提交事務");
		}catch(Throwable e) {
			System.out.println("回滾事務");
		
		}
	}
}
