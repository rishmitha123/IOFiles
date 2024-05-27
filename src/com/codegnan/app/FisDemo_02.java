package com.codegnan.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FisDemo_02 {
	
	public static void main(String[] args) {
		String str="";
		System.out.println("Enter a file");
		Scanner sc = new Scanner(System.in);
		String file = sc.next();
		try(FileInputStream fis = new FileInputStream(file)){			
			int size = fis.available();
			byte[] bytes = new byte[size];			
			fis.read(bytes);
			str = new String(bytes);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(str);
	}
}