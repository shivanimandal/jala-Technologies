//3. Program to equal operator and not equal operators

import java.util.Scanner;
class EqualToAndNotEqualToOperator
{
	public void check(int x, int y) {
		if(x==y) 
		{
			System.out.println("Both given values are equal");
		} else if(x!=y) {
			System.out.println("Both given values are not equal");
		}
	}
	public static void main(String args[]) {
		int a,b;
		Scanner ob = new Scanner(System.in);
		System.out.printf("Enter any two numbers to check for equality: ");
		a = ob.nextInt();
		b = ob.nextInt();
		EqualToAndNotEqualToOperator obj = new EqualToAndNotEqualToOperator();
		obj.check(a,b);
	}
}