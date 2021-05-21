//Write a program to write text to .txt file using FileWriter

import java.io.FileWriter;  
public class FileWriter1 {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("input.txt");    
           fw.write("Welcome");    
           fw.close();    
          }
	  catch(Exception e){
		System.out.println(e);
	  }    
          System.out.println("Success...");    
     }    
}  