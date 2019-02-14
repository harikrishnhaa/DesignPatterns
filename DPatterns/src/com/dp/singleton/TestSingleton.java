package com.dp.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.DriverManager;

public class TestSingleton {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {
		
		SingleUtil s1 = SingleUtil.getInstance();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Hari\\Java\\DesignPatterns\\singletontest.ser")));
		oos.writeObject(s1);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:\\Hari\\Java\\DesignPatterns\\singletontest.ser")));
		SingleUtil s2 = (SingleUtil) ois.readObject();
		
		System.out.println("s1 == s2 : "+(s1 == s2));
		System.out.println("s1 equals s2 : "+(s1.equals(s2)));
		
		SingleUtil s3 = (SingleUtil) s1.clone();
		
		System.out.println("s1 == s3 : "+(s1 == s3));
		System.out.println("s1 equals s3 : "+(s1.equals(s3)));
		
		
	}

}
