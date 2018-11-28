package com.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableHasDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("testhas.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		FileInputStream fis = new FileInputStream("testhas.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.c.r.j);
	}

}

class Dog implements Serializable {
	Cat c = new Cat();
}

class Cat implements Serializable {
	Rat r = new Rat();
}

class Rat implements Serializable {
	int j = 20;
}
