package com.codegnan.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.codegnan.beans.Student1;

public class Student1App {

	public static void main(String[] args) {
		
				
				try(FileInputStream fis = new FileInputStream("studentmarks")){
					int size = fis.available();
					byte[] bytes = new byte[size];
					fis.read(bytes);
					String content = new String(bytes);
					String[] lines = content.split("\n");
					ArrayList<Student1> students = new ArrayList<>();
					for(String line : lines) {
						if(line.trim().length() >0 ) {
							Student1 student = Student1.parseStudent(line);
							students.add(student);
						}
					}
					for(Student1 student : students) {
						System.out.println(student.toString());
						System.out.println(student.getTotal());
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("End of the program");
			}

		
	}

	
	


