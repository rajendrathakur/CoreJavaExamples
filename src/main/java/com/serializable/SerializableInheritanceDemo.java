package com.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableInheritanceDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Ant d1 = new Ant();
		d1.i = 125;
		System.out.println(d1.i + "........" + d1.j);
		FileOutputStream fos = new FileOutputStream("testinheritance.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		FileInputStream fis = new FileInputStream("testinheritance.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Ant d2 = (Ant) ois.readObject();
		System.out.println(d2.i + "........" + d2.j);
	}

}

class Animal {
	int i = 10;
}

class Ant extends Animal implements Serializable {
	int j = 20;
}
