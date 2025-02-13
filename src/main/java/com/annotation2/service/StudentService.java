package com.annotation2.service;

import org.springframework.stereotype.Service;

import com.annotation2.dao.StudentDao;

import jakarta.annotation.Resource;

@Service
public class StudentService {

	@Resource(name="studentDaoImplMySQL")
	private StudentDao studentDao;
	
	public void deleteStudent() {
		studentDao.deleteById();
	}
//	@Resource(name="studentDaoImplMySQL")
//	public void setStudentDao(StudentDao studentDao) {
//		this.studentDao=studentDao;
//	}
}
