/*Runtime Polymorphism with Data Members/Instance variables, Repeat the above
process only for data members*/

class A 
{
	char name = 'A';
	int num = 20;
	String str = "Class A properties are inherited";
}

class B extends A 
{
	char name1 = 'B';
	int num1 = 50;
	String str1 = "Class B inherites properties from class A";
}

class C extends B
{
	char name2 = 'C';
	int num2 = 100;
	String str2 = "Class C inherites properties from class B";
}

public class Inheritance2 {
	public static void main(String[] args)
	{
		A obj = new A();
		System.out.println(obj.name);
		System.out.println(obj.num);
		System.out.println(obj.str);
		
		B obj1 = new B();
		System.out.println(obj1.name1);
		System.out.println(obj1.num1);
		System.out.println(obj1.str1);

		C obj2 = new C();
		System.out.println(obj2.name2);
		System.out.println(obj2.num2);
		System.out.println(obj2.str2);
	}
}
		
		
