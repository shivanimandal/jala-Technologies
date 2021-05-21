//2. Print instance variables in static methods

class StaticMethod {

  //instance variables
  int c = 30;
  int d = 40;

  static void method1() {
        System.out.println("Accessing d variable from static method1: "+new StaticMethod().d);
        System.out.println();
  }

 public static void main(String args[]) {
   
  StaticMethod obj = new StaticMethod();
 
  System.out.println("Accessing c variable from static main method: "+obj.c);
 
  //calling static methods
  method1();
 }
}
  