/*Create two interfaces with the same method (same signature) in both the interfaces.
Implement these two interfaces in one class. Call the method.*/


interface Printable {  
 void print();  
}  
interface Showable {  
   void print();  
}  
  
class TestInterface implements Printable, Showable {  
     public void print() {
        System.out.println("Welcome");
     }  
     public static void main(String args[]) {  
        TestInterface obj = new TestInterface();  
         obj.print();  
     }  
}  