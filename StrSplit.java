//11. Splitting strings with split()

import java.util.*;
public class StrSplit {
  
	public static void main(String args[]) {
  
             Scanner sc= new Scanner(System.in); 
             System.out.print("Enter a string: ");  
             String str= sc.nextLine();  
            
             System.out.println("After spliting the above string");
	     String[] arrStr = str.split("\\s");
             for (int i=0; i < arrStr.length; i++){
               System.out.println(arrStr[i]);
            }

       }
}