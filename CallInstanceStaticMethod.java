//7. Call static methods and instance methods in main method

class CallInstanceStaticMethod {
  //static method
  static int staticMethod() {
	System.out.println("This is Static Method");
        return 5;
  }
  
 //instance method
 int instanceMethod() {
	System.out.println("This is Instance Method");
        return 10;
 }

 public static void main(String args[]) {
   
  CallInstanceStaticMethod obj = new CallInstanceStaticMethod();
   
  System.out.println("This is Main Method");
 
  //calling static methods
  System.out.println("Value of 'a' is "+staticMethod());
 
  //calling instance method
  System.out.println("Value of 'b' is "+obj.instanceMethod());
  
 }

}
  