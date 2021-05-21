//10. Replacing characters in strings with replace()

public class StringReplace {

   public static void main(String args[]) {
         
      // Initialising String
      String Str = new String("Java is high level language");
       
      //Before replacing the string 
      System.out.println(Str);
 
      // Using replace to replace characters
      System.out.print("After replacing all a with A : " );
      System.out.println(Str.replace('a', 'A'));
        
      // Using replace to replace characters
      System.out.print("After replacing all i with G : " );
      System.out.println(Str.replace('i', 'G'));
        
   }
}