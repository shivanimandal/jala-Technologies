//11. Program to check whether a number is EVEN or ODD using switch

import java.util.*;

class EvenOddSwitch {

	public static void main(String args[]) {

    		Scanner sc = new Scanner(System.in); 

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		switch(n%2) { //this will return either 0 or 1
		case 0:
    			System.out.println(n+" is a Even number");
    			break;
		case 1:
    			System.out.println(n+" is a Odd number");
		}
	}
}