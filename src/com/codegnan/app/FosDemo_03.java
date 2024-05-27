package com.codegnan.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FosDemo_03 {

	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("file2.txt") ){
			String str="Codegnan Destination";
			byte[] bytes=str.getBytes();
			fos.write(bytes);
			
			
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
