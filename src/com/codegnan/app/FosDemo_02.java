package com.codegnan.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FosDemo_02 {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		try {
			 fos=new FileOutputStream("file1.txt");
			String str="Java Programming";
			byte[] bytes=str.getBytes();
			fos.write(bytes);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
		System.out.println("end of program");

	}

}


	}

}
