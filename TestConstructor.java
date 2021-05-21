//3.Calling constructor of the current class using this()

class A {  
  A() {
    System.out.println("Hello");
  }  

  A(int x) {  
     this();  
     System.out.println(x);  
  }  
}
  
class TestConstructor {  
   public static void main(String args[]) {  
      A a=new A(10);  
   }
}  