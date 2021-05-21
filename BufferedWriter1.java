//Write text to a .txt file using BufferedWriter

import java.io.*;  
public class BufferedWriter1 {  
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("out.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome!!");  
    buffer.close();  
    System.out.println("Success");  
    }  
}  