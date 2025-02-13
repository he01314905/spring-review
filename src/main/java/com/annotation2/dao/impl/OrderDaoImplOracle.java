package com.annotation2.dao.impl;

import org.springframework.stereotype.Repository;

import com.annotation2.dao.OrderDao;

@Repository("orderDaoImplOracle")
public class OrderDaoImplOracle implements OrderDao{

	public void insert() {
		System.out.println("Oracle數據庫正在保存訊息...");
		
	}
}
