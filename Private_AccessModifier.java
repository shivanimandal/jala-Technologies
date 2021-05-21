/*1. Create a class with PRIVATE fields, private method and a main method. Print the fields
in main method. Call the private method in main method.
Create a sub class and try to access the private fields and methods from sub class.*/

class Private_AccessModifier 
{
	private int num = 30;
	private String str = "Welcome";
	private void print()
	{
		System.out.println("This is Private Method");
	}
	public static void main(String[] args) {
		Private_AccessModifier obj = new Private_AccessModifier();
		System.out.println(obj.num);
		System.out.println(obj.str);
		obj.print();
		Private_Method_Class obj1 = new Private_Method_Class();
		obj1.setNum(40);
		obj1.setStr("Speech");
		System.out.println(obj1.getNum());
		System.out.println(obj1.getStr());
	}
}

class Private_Method_Class
{
	private int num;
	private String str;
	public void setNum(int num)
	{
		this.num=num;
	}
	public void setStr(String str)
	{
		this.str=str;
	}
	public int getNum()
	{
		return this.num;
	}
	public String getStr()
	{
		return this.str;
	}
	private void print()
	{
		System.out.println("Subclass Private Method");
	}
}