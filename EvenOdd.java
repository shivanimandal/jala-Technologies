//4. Write a program to print the odd and even numbers.

import java.util.*;
class EvenOdd
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: "); // how many numbers you want to enter
		int n = sc.nextInt();
		System.out.println("Enter number to check even or odd: ");
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if(num%2==0) {
				System.out.println(num+" is even number");
			} else {
				System.out.println(num+" is odd number");
			}
		}
	}
} 