package com.aspectj_aop.example.biz;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
public void saveUser() {
	System.out.println("新增用戶訊息..");
}
public void deleteUser() {
	System.out.println("刪除用戶訊息..");
}
public void modifyUser() {
	System.out.println("修改用戶訊息..");
}
public void getUser() {
	System.out.println("獲取用戶訊息..");
}
}
