//14. Converting to uppercase and lowercase

import java.util.*;
public class UpperLowerCase {

   public static void main(String args[]){

       String low = new String("java programming");//lowercase String
       String upr = new String("OBJECT ORIENTED PROGRAMMING");//uppercase string

       //Standard method of conversion to uppercase
       System.out.println(low.toUpperCase());

       //Standard method of conversion to lowercase
       System.out.println(upr.toLowerCase());
   }
}