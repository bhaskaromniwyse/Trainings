package com.assignment5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			File file = new File("E:\\myfile.txt");
			if(file.createNewFile())
				System.out.println("file created");
			else{
				System.out.println("file not created");
				
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write("hi files");
				bw.write("welcome to java");
				bw.close();
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
