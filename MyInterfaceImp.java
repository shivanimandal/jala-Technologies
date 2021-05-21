/*Use Interface instances to call the implemented method in the implemented class*/

interface MyInterface
{
   public void method1();
}
class MyInterfaceImp implements MyInterface
{
   public void method1()
   {
	System.out.println("implementation of method1");
   }
    
   public static void main(String[] args) {
	MyInterface obj = new MyInterfaceImp();
	obj.method1();// interface instance
    }
}