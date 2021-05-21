/*program of two methods with the same name, number of parameters and data type but
different return Type.*/

class Method
{
   public double myMethod(int num1, int num2)
   {
      System.out.println("First myMethod");
      return num1+num2;
   }
   public int myMethod(int a, int b)
   {
      System.out.println("Second myMethod");
      return a-b;
   }
}
class Example2
{
   public static void main(String args[])
   {
      Method obj= new Method();
      obj.myMethod(10,10);
      obj.myMethod(20,12);
   }
}