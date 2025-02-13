package com.aspectj_aop.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	
public void generate() {
	System.out.println("正在生成訂單...");
//	if(1==1) {
//		throw new RuntimeException("運行時異常");
//	}
}
}
