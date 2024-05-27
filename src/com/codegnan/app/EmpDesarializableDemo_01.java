package com.codegnan.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.codegnan.beans.Employee;

public class EmpDesarializableDemo_01 {

	public static void main(String[] args) {
		try(
				FileInputStream fis=new FileInputStream("employee.data");
				ObjectInputStream ois=new ObjectInputStream(fis);
				){
			Employee employee=(Employee) ois.readObject();
			System.out.println("deserialized content :"+employee);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of code");

	}

}
