//3. Print static variables in Instance methods

class InstanceMethod {

  //static variables
  static String str = "Shivani";

  public void getName() {
        System.out.println("My Name is "+str);
  }

 public static void main(String args[]) {
   
  InstanceMethod obj = new InstanceMethod();
 
  //calling instance methods
  obj.getName();
 }
}
  