package com.annotation2.dao.impl;

import org.springframework.stereotype.Repository;

import com.annotation2.dao.OrderDao;

@Repository("orderDaoImplMySQL")
public class OrderDaoImplMySQL implements OrderDao{

	public void insert() {
		System.out.println("MySQL數據庫正在保存訊息...");
		
	}

}
