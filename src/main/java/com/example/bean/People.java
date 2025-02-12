package com.example.bean;

public class People {
private String name;
private int age;
private boolean sex;

//c命名簡化建構子注入
//基於建構子注入方法

public People(String name, int age, boolean sex) {
	super();
	this.name = name;
	this.age = age;
	this.sex = sex;
}

@Override
public String toString() {
	return "People [name=" + name + ", age=" + age + ", sex=" + sex + "]";
}

}
