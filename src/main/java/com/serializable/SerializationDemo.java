package com.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
     Account account = new Account();

	 FileOutputStream fos = new FileOutputStream("test.txt");
	 ObjectOutputStream oos = new ObjectOutputStream(fos);
	 oos.writeObject(account);
	 
	 FileInputStream fis = new FileInputStream("test.txt");
	 ObjectInputStream ois = new ObjectInputStream(fis);
	 Account deseraccount = (Account) ois.readObject();
	 
	 System.out.println("i = "+deseraccount.i+" "+"j="+deseraccount.j);
	 
	 
	}

}

class Account implements Serializable{

	private static final long serialVersionUID = 1L;
	
	int i = 10;
	int j = 20;
	
}
