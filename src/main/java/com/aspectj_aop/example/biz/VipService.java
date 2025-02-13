package com.aspectj_aop.example.biz;

import org.springframework.stereotype.Service;

@Service
public class VipService {

	public void saveVip() {
		System.out.println("新增會員訊息..");
	}
	public void deleteVip() {
		System.out.println("刪除會員訊息..");
	}
	public void modifyVip() {
		System.out.println("修改會員訊息..");
	}
	public void getVip() {
		System.out.println("獲取會員訊息..");
	}
}
