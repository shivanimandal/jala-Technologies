//Write a program to generate FileNotFoundException

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
public class FileNotFoundException {
     
    private static final String filename = "input.txt";
     
    public static void main(String[] args) {
        BufferedReader rd = null;
        try {
            rd = new BufferedReader(new FileReader(new File(filename)));
             
            String inputLine = null;
            while((inputLine = rd.readLine()) != null)
                System.out.println(inputLine);
        }
        catch(IOException ex) {
            System.err.println("An IOException was caught!");
            ex.printStackTrace();
        }
        finally {
            try {
                rd.close();
            }
            catch (IOException ex) {
                System.err.println("An IOException was caught!");
                ex.printStackTrace();
            }
        }
    }
}