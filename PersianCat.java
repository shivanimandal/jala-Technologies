/*2. Create a sub class for an abstract class. Create an object in the child class for the
abstract class and access the non-abstract methods*/

abstract class Cat {  // abstract class

     public void meow() { //non-abstract method
        
         System.out.println("Meow!!");
     }
}

class PersianCat extends Cat {  //subclass
  
   public static void main(String[] args) {
  
       PersianCat ob = new PersianCat();
       ob.meow();
   }

}