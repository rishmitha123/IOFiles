package com.codegnan.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.codegnan.beans.Employee;

public class EmpSerializableDemo_01 {

	
	public static void main(String[] args) {
		try(
			FileOutputStream fos=new FileOutputStream("employee.data");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
				){
		
				
		Employee e1=new Employee(101,"rishmitha","vankadarurishmitha17@gmail.com");
		oos.writeObject(e1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of code");
		
			
			
	

	}

}
