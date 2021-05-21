//6. Print all the static, instance variables in main method

class PrintStaticInstanceVar {
 
   //static variable
   static int a = 10;
   
  //instance variable
  int b = 30;


 public static void main(String args[]) {
   
  PrintStaticInstanceVar obj = new PrintStaticInstanceVar();
   
  System.out.println("This Is Main Method");
   
  //printing static variable
  System.out.println("Static Variable 'a' Value is = "+a);

  //printing instance variable
  System.out.println("Instance Variable 'b' Value is = "+obj.b);
 }
}
  