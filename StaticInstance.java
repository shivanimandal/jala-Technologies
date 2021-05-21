/*1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
methods and a main method.*/

class StaticInstance {
 
   //static variables
   static int a = 10;
   static int b;
   
  //instance variables
  int c = 30;
  int d = 40;

  static void method1() {
	System.out.println("In Static Method1");
        //accessing static variable a
        System.out.println("Static Variable a value is "+a);
        System.out.println();
  }
  
 static void method2() {
 	System.out.println("In Static Method2");
        //accessing static variable b
        b = a + 5;
        System.out.println("Static Variable 'b' value is "+b);
        System.out.println();
 }
  
 void instanceMethod1() {
	System.out.println("In Instance Method1");
        //accessing instance variable c
        System.out.println("Instance Variable c value is "+c);
        System.out.println();
 }

 void instanceMethod2() {
	System.out.println("In Instance Method2");
        //accessing instance variable d
        System.out.println("Instance Variable c value is "+this.d);
        System.out.println();
 }

 public static void main(String args[]) {
   
  StaticInstance obj = new StaticInstance();
   
  System.out.println("In Main Method");
  System.out.println();
 
  //calling static methods
  method1();
  method2();
 
  //calling instance methods
  obj.instanceMethod1();
  obj.instanceMethod2();
 }
}
  