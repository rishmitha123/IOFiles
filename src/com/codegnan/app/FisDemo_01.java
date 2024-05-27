package com.codegnan.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FisDemo_01 {

	public static void main(String[] args) {
		String str="";
		try(FileInputStream fis=new FileInputStream("file1.txt")){
//			int b;
//			
//			do {
//				b=fis.read();
//				if(b!=-1) {
//					str=str+(char)b;
//				}
//				else {
//					//do nothing
//				}
//			}
//			while(b!=-1);
			int size=fis.available();
			byte [] bytes=new byte[size];
			fis.read(bytes);
			str=new String(bytes);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("file content :");
		System.out.println(str);

	}

}
