package com.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		User user = new User();
		System.out.println(user.userName + "........." + user.pwd);

		FileOutputStream fos = new FileOutputStream("testtrans.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(user);

		FileInputStream fis = new FileInputStream("testtrans.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		User a2 = (User) ois.readObject();
		System.out.println(a2.userName + "........." + a2.pwd);
		
		
	}

}

class User implements Serializable {
	String userName = "Bhaskar";
	transient String pwd = "kajal";
	
	private void writeObject(ObjectOutputStream os)throws Exception
	{
	os.defaultWriteObject();
	String epwd="123"+pwd;
	os.writeObject(epwd);
	}
	private void readObject(ObjectInputStream is)throws Exception{
	is.defaultReadObject();
	String epwd=(String)is.readObject();
	pwd=epwd.substring(3);
	}
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", pwd=" + pwd + "]";
	}
	
}
