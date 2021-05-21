/*3. Create a class with PROTECTED fields and methods. Access these fields and methods
from any other class in the same package.
Also, Access the PROTECTED fields and methods from child class located in a different
package
Access the PROTECTED fields and methods from any class in different package*/

class Protected_AccessModifier
{
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.display();
		System.out.println(obj.num);
	}
}

class Demo
{
	protected int num = 10;
	protected void dipslay()
	{
		System.out.println("Welcome");
	}
}