//4. Write a program to find the two numbers equal or not.

import java.util.*;
class Equality
{
	public static void main(String args[]) {
		Scanner ob = new Scanner(System.in);
		System.out.printf("Enter any two numbers to check for equality: ");
		int a = ob.nextInt();
		int b = ob.nextInt();
		if(a == b) 
		{
			System.out.println("The given two numbers are equal");
		} else if(a != b) {
			System.out.println("The given two numbers are not equal");
		}
	}
}