package com.codegnan.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.codegnan.beans.Student;

public class StudentApp {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("Student.txt")){
			int size=fis.available();
			byte[] bytes=new byte[size];
			fis.read(bytes);
			String Content=new String(bytes);
			String[] lines=Content.split("\n");
			ArrayList<Student> students=new ArrayList<>();
			for(String line:lines) {
				if(line.trim().length()>0) {
					Student student=Student.parseStudent(line);
					students.add(student);
				}
			
				
			}
			for(Student student:students) {
				System.out.println(student.toString());
				
			}
				
			
		} catch (FileNotFoundException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
