package com.aspectj_aop.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class SecurityAspect { //安全切面
//通知+切面
	//前置通知
		@Before("com.aspectj_aop.service.LogAspect.commend()")
		public void beforeAdvice() {
			System.out.println("前置通知:安全...");
		}
}
