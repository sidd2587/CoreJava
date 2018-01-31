package com.main.java.Serialization;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.logging.Logger;

public class SerializationTest {
	
	private static final Logger logger = Logger.getLogger(SerializationTest.class.getName());

	public static void main(String[] args){
		
		
		Employee employee = new Employee("Amit");
		
		Employee employee1 = new Employee("Sumit");
		
		
	  try 
	  {
		  OutputStream outputStream = new FileOutputStream("D:\\serialization\\ser.txt");
		  ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
			
		  
		  logger.info("Serialization process started : For employe classs");
		  
		  objectOutputStream.writeObject(employee);
		  objectOutputStream.writeObject(employee1);
		  
		  objectOutputStream.writeObject(new EofIndicatorClass());
		  
		
		  
		  InputStream inputStream = new FileInputStream("D:\\serialization\\ser.txt");
		   ObjectInput input = new ObjectInputStream(inputStream);
		  Object obj;
		  while(input.read() == -1){
			  
			 // System.out.println(input.read());
			  obj = input.readObject();
			  System.out.println("object read" +obj);
		  }
		  
	} catch (Exception e) {
e.printStackTrace();	}
		
	}
}


class EofIndicatorClass implements Serializable{}