package com.cognizant.spring;

public class Country {
	public String code;
	public String name;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Country() {
		System.out.println("Inside Country Constructor");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
}
