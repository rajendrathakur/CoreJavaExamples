package com.override;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class Parent{
	void add()throws ArrayIndexOutOfBoundsException{
		
	}
	
	void calculate() throws IOException{
		
	}
}

class Child extends Parent{
	void add() throws RuntimeException{
		
	}
	
	void calculate() {
		
	}
	//FileNotFoundException
}

public class OverideExceptionRule {

	public static void main(String[] args) {

	}

}
