package com.override;

class Person{
	private int id;
	private String name;
	Person(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void add(){
		
	}
}

class Customer extends Person{
	private int salary;
	Customer(){
		super(101, "Raja");
	}
	void add(){
		
	}
	
}

public class ConstructorDemo extends Customer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
