package com.codegnan.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FioDemo_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file name");
		String file=sc.nextLine();
		System.out.println("enter the value");
		String str=sc.nextLine();
		try(FileOutputStream fos=new FileOutputStream("file.txt")){
			byte[] bytes=str.getBytes();
			fos.write(bytes);
			fos.close();

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s="";
		try(FileInputStream fis=new FileInputStream("file.txt")){
			int size = fis.available();
			byte[] bytes = new byte[size];			 
			fis.read(bytes);
			s = new String(bytes);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s);
		
		

	}
	
}
