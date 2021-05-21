//2. Write a program to print your name.

import java.util.Scanner;
class Name 
{
	public static void main(String a[]) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String str = ob.next();
		System.out.println("My name is "+str);
	}
}