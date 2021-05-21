/*6. Create an interface with a default method and implement it in a class. Do not provide
implementation to the default method and call the method.*/

interface TestInterface
{
    // abstract method
    public void multiply(int a);
  
    // default method
    default void show()
    {
      System.out.println("Default Method Executed");
    }
}
  
class InterfaceWithDefault implements TestInterface
{
    // implementation of multiply abstract method
    public void multiply(int a)
    {
        System.out.println(a*a);
    }
  
    public static void main(String args[])
    {
        InterfaceWithDefault ob = new InterfaceWithDefault();
        ob.multiply(5);
  
        // default method executed
        ob.show();
    }
}