package myspring.bean;

public class User {
	private int age;
	private String name;

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
}
