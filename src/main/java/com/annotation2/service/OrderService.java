package com.annotation2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.annotation2.dao.OrderDao;

@Service("orderService")
public class OrderService {

	@Autowired
	@Qualifier("orderDaoImplOracle")
	private OrderDao orderDao;
	
	public void generate() {
		orderDao.insert();
	}
}
