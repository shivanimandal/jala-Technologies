//5. Searching in strings using indexOf()

public class IndexOfString {  

   public static void main(String args[]) { 
 
   String s1 = "java programming is a high level language";
  
   //passing substring  
   int index1 = s1.indexOf("is");
   int index2 = s1.indexOf("high"); 
 
   System.out.println(index1+"  "+index2);  
  
   //passing substring with from index  
   int index3 = s1.indexOf("i",13); //returns the index of i substring after 13th index
  
   System.out.println(index3); 
  
   //passing char value  
   int index4 = s1.indexOf('n');//returns the index of n char value 
 
   System.out.println(index4);
 
 }

}  