//14. Write a method to find the second largest number in an array

import java.util.*;

class SecondLargest { 
   
    public static void main(String[] args) { 
       
        Scanner sc = new Scanner(System.in);

	System.out.println("Enter number of elements u want to enter: ");
        int n = sc.nextInt();

        int [] arr = new int [n];
	
	System.out.println("Enter the elements you want to enter: ");
	for(int i = 0;i < n;i++) {
		arr[i] = sc.nextInt();
	}

	int largest = arr[0];
        int secondLargest = arr[0];
		
	System.out.println("The given array is:" );
	 for (int i = 0; i < n; i++) {
		System.out.print(arr[i]+" ");
	 }

	for (int i = 0; i < n; i++) {
          if (arr[i] > largest) {
		secondLargest = largest;
	        largest = arr[i];
 
		} else if (arr[i] > secondLargest) {
		    secondLargest = arr[i];
 
		}
	}
 
	System.out.println("\nSecond largest number is: "+ secondLargest);
    }
}
 
