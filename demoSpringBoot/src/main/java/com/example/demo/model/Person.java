package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Override
	public String toString() {
		return " Mobile number =" + num + ", Name=" + name;
	}
	@Id
	private long num;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	
	

}
