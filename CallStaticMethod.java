//5. Call static methods in instance methods

class CallStaticMethod {

  //static method
    public static void staticMethod() {
     
    System.out.println("This is static Method Called By Instance Method");

    }

  //instance method
  public void instanceMethod() {

        System.out.println("Hi,This is Instance Method Calling Static Method");

        //calling static method
        staticMethod();

  }

 public static void main(String args[]) {
   
  CallStaticMethod  obj = new CallStaticMethod();
  
  //calling instance method
  obj.instanceMethod();
 }

}
  