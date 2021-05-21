//1. Different ways creating a string

public class CreatingString {  

   public static void main(String args[]) { 
 
      String str1 = "java"; //creating string by java string literal
  
      String str2 = new String("programming"); //creating java string by new keyword 

      char ch[]={'l','a','n','g','u','a','g','e'};  
      String str3 = new String(ch); //converting char array to string  
 
      System.out.println(str1);  
      System.out.println(str2);  
      System.out.println(str3);  
   }
}  