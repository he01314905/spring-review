package com.aspectj_aop.example.service;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

	public void transfer(){
		System.out.println("帳戶正在轉帳作業...");
	}
	public void withdraw() {
		System.out.println("正在取款...");
	}
}
