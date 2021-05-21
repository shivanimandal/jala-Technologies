/* program of two methods with the same name and same number of parameters of different
type and call from main method*/

class Example1 {
   void disp(int a, double b) {
	System.out.println("Method A");
   }
   void disp(int a, float b) {
	System.out.println("Method C");
   }
   public static void main(String args[]){
	Example1 obj = new Example1();
	obj.disp(20, 2.546);
	obj.disp(100, 20.67f);
   }
}