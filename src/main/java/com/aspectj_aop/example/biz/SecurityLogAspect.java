package com.aspectj_aop.example.biz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityLogAspect {
	@Pointcut("execution(* com.aspectj_aop.example.biz..save*(..))")
	public void savePointCut() {}
	@Pointcut("execution(* com.aspectj_aop.example.biz..delete*(..))")
	public void deletePointCut() {}
	@Pointcut("execution(* com.aspectj_aop.example.biz..modify*(..))")
	public void modifyPointCut() {}

		
	@Before("savePointCut() || deletePointCut() || modifyPointCut()")
	public void beforeAdvice(JoinPoint joinPoint) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String nowTime = sdf.format(new Date());
		System.out.println(nowTime+"張三"+joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
	}
}
