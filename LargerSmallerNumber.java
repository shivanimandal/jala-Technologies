//7. Print the smaller and larger number

import java.util.*;
class LargerSmallerNumber
{
	public static void main(String[] args) {
		int small = 0,large = 0;
		System.out.println("Enter the Number: ");//n number you want to enter
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = sc.nextInt();
		small = num;
		
		for(int i = 1;i < n;i++) {
			num = sc.nextInt();
			if(num > large) {
				large = num;
			}
			if(num < small) {
				small = num;
			}
		}
		System.out.println("The largest Number is: "+large);
		System.out.println("The Smallest Number is: "+small);
	}
} 
