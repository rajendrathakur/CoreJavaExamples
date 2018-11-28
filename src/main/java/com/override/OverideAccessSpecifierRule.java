package com.override;

class A{
	  void msg(){
		System.out.println("Parent class message");
	}
	
}

class B extends A{
    protected void msg(){
    	System.out.println("Sub class message");
	}
    
}

public class OverideAccessSpecifierRule {

	public static void main(String[] args) {
      B b = new B();
      b.msg();
      
      
	}
	

}
