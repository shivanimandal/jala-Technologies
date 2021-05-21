//5. Write a program to print largest number among three numbers.

import java.util.*;
class LargestNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count = 0, num;
		int large = 0;
		System.out.println("Enter three numbers : ");
		while(count < 3) {
			num = sc.nextInt();
			if(num>large) {
				large = num;
			}
			count++;
		}
		System.out.println("Largest number among three numbers is "+large);
	}
}