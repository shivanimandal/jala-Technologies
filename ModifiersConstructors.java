/*3.Apply private,public, protected and default access modifiers to the constructor*/

class Test {

  //default constructor
  Test() {
     System.out.println("This is a default constructor.");
  }

  // private constructor
  private Test(int x,int y) {
    System.out.println("This is a private constructor.");
  }
  
  // public constructor
  public Test(int i) {
     System.out.println("This is a public constructor.");
  }
 
  // protected constructor
  protected Test(String name) {
     System.out.println("This is a protected constructor.");
  }

  // create a public static method
  public static void method() {

    // create an instance
    Test obj = new Test();
    Test obj1 = new Test(10);
    Test obj2 = new Test("Kajal");
    Test obj3 = new Test(10,20);
    
  }

}

class ModifiersConstructors {

  public static void main(String[] args) {

    // calling the void method()
    Test.method();
    
  }
}