package com.aspectj_aop.example.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

	public void generate() {
		System.out.println("正在生成訂單...");
	}
	public void cancel() {
		System.out.println("正在取消訂單...");
		String s =null;
		s.toString(); //測試回滾事務打印
	}
}
