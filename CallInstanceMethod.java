//4. Call instance methods in static methods

class CallInstanceMethod {

  //instance method
  public void method1() {

        System.out.println("Hi,This is Instance Method Called From Static Method");
        System.out.println();

  }

  //static method
 public static void main(String args[]) {
   
  CallInstanceMethod  obj = new CallInstanceMethod();
  
  //calling instance method
  obj.method1();

 }

}
  