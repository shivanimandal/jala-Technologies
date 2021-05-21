/*Create two interfaces with one method each. Implement these two interfaces in one
class.*/

interface Printable {  
  void print();  
}
  
interface Showable {  
  void show();  
} 
 
class TwoInterface implements Printable,Showable {  
    public void print() {
        System.out.println("Hello");
    }
  
    public void show() {
        System.out.println("Techno's");
    }  
  
    public static void main(String args[]) {  
        TwoInterface obj = new TwoInterface();  
        obj.print();  
        obj.show();  
    } 
 
}  