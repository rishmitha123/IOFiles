package com.codegnan.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FosDemo_01 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("file1.txt");
			String str="Java Programming";
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
		System.out.println("end of program");

	}

}
