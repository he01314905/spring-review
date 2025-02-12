package com.example.bean;

import java.util.Date;

public class Dog {
private String name;
private int age;
private Date birth;

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Dog [name=" + name + ", age=" + age + ", birth=" + birth + "]";
}

public void setAge(int age) {
	this.age = age;
}

public void setBirth(Date birth) {
	this.birth = birth;
}
}
