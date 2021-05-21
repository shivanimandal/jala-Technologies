/*12. Print gender (Male/Female) program according to given M/F using switch*/

import java.util.*;
class CheckGender{    
	public static void main(String args[]) {    
		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter gender (M/m or F/f): "); 
		char ch = sc.next().charAt(0); 
	 
		switch(ch)
    		{
        		case 'M':
        		case 'm':
            			 System.out.println("Male");
            			 break;
        		case 'F':
        		case 'f':
            			 System.out.println("Female");
            			 break;
        		default:
            			System.out.println("Unspecified Gender\n");
   		 }
	}    
}   