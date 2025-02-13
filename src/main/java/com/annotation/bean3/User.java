package com.annotation.bean3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	@Value("老王")
private String name;
	@Value("30")
private int age;
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
