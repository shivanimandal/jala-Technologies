/*2. Create an interface with two methods, but implement only one in a class. Call the
method implemented.*/


interface MyInterface
{
   public void method1();
   public void method2();
}
class MainClass implements MyInterface
{
   public void method1()
   {
	System.out.println("implementation of method1");
   }

   public void method2()
   {
	System.out.println("implementation of method2");
   }
    
    public static void main(String[] args) {
	MyInterface obj = new MainClass();
	obj.method1();
     }
}