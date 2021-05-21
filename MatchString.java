//6. Matching a String Against a Regular Expression With matches()

public class MatchString {
      
   public static void main(String args[]) {
        
      // Initializing String 
      String Str = new String("Welcome to this world");
        
      // Testing if regex is present
      System.out.print("Does String contains regex (.*)Welcome(.*) ? : " );
      System.out.println(Str.matches("(.*)Welcome(.*)"));
        
      // Testing if regex is present
      System.out.print("Does String contains regex Welcome ? : " );
      System.out.println(Str.matches("Welcome"));
        
   }
}