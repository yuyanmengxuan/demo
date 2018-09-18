package com.yang.demo.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stringrever {
	public static void main(String[] args) throws IOException {
	  File file=new File("d://BugReport.txt");
	  FileInputStream is=new FileInputStream(file);
	  FileOutputStream os=new FileOutputStream("d://hehe.txt");
	  byte [] b=new byte[10];
	  int read = is.read(b);
	  while(read!=-1) {
		  System.out.println(new String(b,0,read));
		  os.write(b, 0, read);
		  read = is.read(b);
	  }
	
	}
}
