package com.assignment5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GrepImplforFile {

	public static void main(String[] argv) {
        
		GrepImplforFile grep = new GrepImplforFile();
		try{
			System.out.println(grep.findString(null,"E:\\myfile.txt"));
		}catch(IOException e){
			System.out.println(e);
		}
    }
	
	public boolean findString(String s, String f) throws IOException{
		boolean fs = false;
		if(s != null){
			if(s != " "){
				Pattern pattern = Pattern.compile(s);
				Matcher matcher = pattern.matcher("");
				String file = f;
				BufferedReader br = null;
		        String line;
		        try{
		            br = new BufferedReader(new FileReader(file));
		        }
		        catch (IOException e){
		            System.err.println("Cannot read '" + file + "': " + e.getMessage());
		        }
		        while ((line = br.readLine()) != null){
		        	//System.out.println("File content = "+line);
		            Matcher match1 = matcher.reset(line);
		            if (match1.find()){
		                fs = true;//("string ** "+s+" ** find in the file.");
		            }
		        }
		        br.close();
			}
				
		}else{System.out.println("enter valid string or value");}
		return fs;
	}
}
