/*A, B and C are classes
A is a super class. B is a sub class of A. C is a sub class of B.
Create three methods in each class, 2 methods are specific to each class and third
method (override method) should be in all three Classes A, B and C
Create a class with main method. Create an object for each class A, B and C in main
method and call every method of each class using its own object/instance.
Call an overridden method with super class reference to B and C class’s objects*/

class A 
{
	public void name()
	{
		System.out.println("This is class A");
	}
	public void detail()
	{
		System.out.println("This is the super class");
	}
	void print()
	{
		System.out.println("This properties are inherited");
	}
}

class B extends A 
{
	public void name2()
	{
		System.out.println("This is class B");
	}
	public void detail2()
	{
		System.out.println("This is the subclass of A");
	}
	void print()
	{
		System.out.println("This inherites properties from class A");
	}
}

class C extends B
{
	public void name3()
	{
		System.out.println("This is class C");
	}
	public void detail3()
	{
		System.out.println("This is the subclass of B");
	}
	void print()
	{
		System.out.println("This inherites properties from class B");
	}
}

public class Inheritance1 {
	public static void main(String[] args)
	{
		A ob = new A();
		System.out.println("Class A properties : ");
		ob.name();
		ob.detail();
		ob.print();
		
		B ob1 = new B();
		A obj = new B();
		System.out.println("Class B properties : ");
		ob1.name2();
		ob1.detail2();
		ob1.print();

		C ob2 = new C();
		A obj1 = new C();
		System.out.println("Class C properties : ");
		ob2.name3();
		ob2.detail3();
		ob2.print();
	}
}
		
		
