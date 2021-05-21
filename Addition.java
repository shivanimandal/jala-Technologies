//1. How to create a class, object, method and its signature

import java.util.Scanner;
//creating class
class Addition
{
	public static void main(String args[])
	{
		int a,b;
		//creating Scanner class object
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		//reading values from user
		a = ob.nextInt();
		b = ob.nextInt();
		//method calling
		addMethod(a,b);
	}
	public static void addMethod(int a, int b) {
	//method body        Method signature
		System.out.println("Addition of two numbers is:"+(a+b));
	} 
} 