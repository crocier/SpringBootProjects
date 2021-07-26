package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Home {
	
	//POJO class 
	
	private String owner;
	private int doorno;
	
	@Autowired
	@Qualifier("abc")
	private InternetConnection modem;
	
	public Home() {
		System.out.println("Constructor is called");
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	
	public void connect()
	{
		modem.switchOn();
		System.out.println("Connecting to internet");
	}

}
