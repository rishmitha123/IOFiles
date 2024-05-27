package com.codegnan.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FosDemo_04 {

	public static void main(String[] args) {
		
		
			try(FileOutputStream fos=new FileOutputStream("file3.txt")){
				Scanner sc=new Scanner(System.in);
				System.out.println("enter a value");
				String str=sc.next();
				byte[] bytes=str.getBytes();
				fos.write(bytes);
				fos.close();
								
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			System.out.println("end of code");

	}

}
