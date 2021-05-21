/*Create a class with PUBLIC fields and methods.
Access the public methods and fields from any class in the same package or different
package.*/

class Public_AccessModifier
{
	public static void main(String[] args) {
		A d = new A();
		d.dispaly();
		System.out.println(d.num);
	}
}

class A
{
	public int num=10;
	public void display()
	{
		System.out.println("Welcome");
	}
}