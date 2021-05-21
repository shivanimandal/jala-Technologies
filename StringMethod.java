//8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()

class StringMethod {
  
 public static void main(String args[]) {  

   String str1="Sun";  
   String str2="Microsystems";  
   String str3=new String("Sun"); 
   String str4="sun";
   String str5="Java Programming is a high level language";
   String str6="Micrasystems";
  
   //equals
   System.out.println("str1 equals to str2: "+str1.equals(str2));  
   System.out.println("str1 equals to str3: "+str1.equals(str3)); 
   
   //equalsIgnoreCase()
   System.out.println("str1 equals to str2:"+str1.equalsIgnoreCase(str2));
   System.out.println("str1 equals to str4:"+str1.equalsIgnoreCase(str4)); 

   //startsWith
   if (str5.startsWith("Java"))
   {
        System.out.println("str5 string starts with Java");
   }
   else
   {
        System.out.println("str5 string does not starts with Java");
   }
  
   //endsWith
   if (str5.endsWith("level")) // LINE C
   {
        System.out.println("str5 string ends with level");
   }
   else
   {
        System.out.println("str5 string does not ends with level");
   }

   //compareTo
   System.out.println("str1.compareTo(str3): " + str1.compareTo(str3));
   System.out.println("str2.compareTo(str6): " + str2.compareTo(str6));
    
 }  
}  