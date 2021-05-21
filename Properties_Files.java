//program to read data from properties file.

import java.util.*;  
import java.io.*;  
public class Properties_Files {
  
	public static void main(String[] args)throws Exception {  
    		FileReader reader=new FileReader("login.properties");  
      
    		Properties p=new Properties();  
   	        p.load(reader);  
      
    		System.out.println(p.getProperty("user"));  
    		System.out.println(p.getProperty("password")); 
                System.out.println(p.getProperty("email")); 
                System.out.println(p.getProperty("phoneno"));
		System.out.println(p.getProperty("city"));
		System.out.println(p.getProperty("country"));
	}  
}  