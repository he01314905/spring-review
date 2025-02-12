package com.example.bean;

import java.util.Arrays;

public class Array {
	private String[] hobbies;

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Array [hobbies=" + Arrays.toString(hobbies) + "]";
	}
}
