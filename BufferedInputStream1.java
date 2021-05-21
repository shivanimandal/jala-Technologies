//Read text from a .txt file using BufferedInputStream

import java.io.*;
  
public class BufferedInputStream1 {
    public static void main(String[] args)
        throws Exception
    {
  
        // Create input stream 'demo.txt'
        // for reading containing
        // text "WELCOME"
        FileInputStream inputStream = new FileInputStream("demo.txt");
  
        // bufferedInputStream
        BufferedInputStream buffInputStr = new BufferedInputStream(inputStream);
  
        while (buffInputStr.available() > 0) {
  
            char c = (char)buffInputStr.read();
  
            // Print the characters
            System.out.println("Char : " + c);
        }
    }
}