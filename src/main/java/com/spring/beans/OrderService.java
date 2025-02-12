package com.spring.beans;

public class OrderService {
private OrderDao orderDao;

public void setOrderDao(OrderDao orderDao) {
	this.orderDao = orderDao;
}

//生成訂單業務方法
public void generate() {
	orderDao.insert();
}
}
