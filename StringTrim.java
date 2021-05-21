//9. Trimming strings with trim()

public class StringTrim {
  
  public static void main(String args[]) {
  
    String s1=" Jala Technologies "; 
 
    System.out.println(s1);//without trim()
    System.out.println("Length of string without trim(): "+s1.length());
  
    System.out.println(s1.trim());//with trim() 
    System.out.println("Length of string trim(): "+s1.trim().length()); 
  }
}  