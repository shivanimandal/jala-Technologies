//1. Create an abstract class with abstract and non-abstract methods.

abstract class Animal { // Abstract class
   
   abstract void sound(); //abstract method

   public void display() { // non-abstract method

      System.out.print("Different animals sound different");
   }
}

class Dog extends Animal {

   void sound() {

           System.out.println("Dogs bark");
   }

   public static void main(String args[]) {  

      Animal obj = new Dog();
      obj.sound();
      obj.display();
   }
}
