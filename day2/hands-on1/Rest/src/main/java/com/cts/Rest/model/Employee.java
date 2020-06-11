package com.cts.Rest.model;

public class Employee {
	private int id;
	private String first;
	private String last;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", first=" + first + ", last=" + last + "]";
	}
	public Employee(int id, String first, String last) {
		super();
		this.id = id;
		this.first = first;
		this.last = last;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
