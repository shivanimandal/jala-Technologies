//4. Extract a string using Substring

public class SubString {

   public static void main(String args[]) {

       String str = new String("Java Programming is a high level language");

       System.out.println("Substring starting from index 22:");
       System.out.println(str.substring(22));

       System.out.println("Substring starting from index 22 and ending at 32:");
       System.out.println(str.substring(22, 32));
   }
}