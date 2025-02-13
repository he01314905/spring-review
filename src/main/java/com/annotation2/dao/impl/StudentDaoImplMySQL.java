package com.annotation2.dao.impl;

import org.springframework.stereotype.Repository;

import com.annotation2.dao.StudentDao;

@Repository("studentDaoImplMySQL")
public class StudentDaoImplMySQL implements StudentDao{

	@Override
	public void deleteById() {
		System.out.println("MySQL數據庫正在刪除訊息...");
	}

}
