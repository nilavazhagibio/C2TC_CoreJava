//program to demonstrate simple class in java
package com.tnsif.daythree.constructor;

public class OopsConcept {
	private int serialNum;
	private String name;
	private int age;
	
	public int getSerialNum() {
		return serialNum;
	}
	
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//Object class method - to return string representation of the object
	
	public String tostring() {
		return "OopsConcept [Serial Number=" + serialNum + ", name=" + name +", age=" + age + "]";				
				
	}
}
