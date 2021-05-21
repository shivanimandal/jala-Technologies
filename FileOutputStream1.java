//Write a program to write text to .txt file using OutputStream

import java.io.FileOutputStream;  
public class FileOutputStream1 {  
    public static void main(String args[]){    
           try{    
             FileOutputStream f =new FileOutputStream("out.txt");    
             String s="Welcome";    
             byte b[]=s.getBytes();    
             f.write(b);    
             f.close();    
             System.out.println("success...");    
            }
	    catch(Exception e){
		System.out.println(e);
	    }    
      }    
}  