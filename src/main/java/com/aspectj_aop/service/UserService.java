package com.aspectj_aop.service;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	public void login() {
		System.out.println("系統正在登入...");
	}
	
	public void logout() {
		System.out.println("退出系統中...");
	}
}
