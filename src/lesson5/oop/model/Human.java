package lesson5.oop.model;

import lesson5.oop.action.AbstractAction;

// 面向对象的三大特性
//第一个： 封装
public class Human implements AbstractAction{
	
	private String name;
	private String gender;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	@Override
	public void run() {
		System.out.println(this.name + " is running");
	}
	
	
}
