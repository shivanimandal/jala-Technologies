//16. Write a function to get the difference of largest and smallest value

import java.util.*;
class DiffOfLargeSmall { 
 
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of elements you want to enter: ");
    int n = sc.nextInt();

    int arr[] = new int[n];
	
    System.out.println("Enter the elements into an array: ");
    for(int i = 0;i < n;i++) {
	arr[i] = sc.nextInt();
    }
 
   // Calling getDiff() method for getting difference of max and min value
    getDiff(arr);

  }

   // Method for getting the difference
   public static void getDiff(int inputArray[]) {
      
      int maxValue = inputArray[0];
      int minValue = inputArray[0];

      for(int i = 1; i < inputArray.length; i++)
	{
		if(inputArray[i] > maxValue)
			maxValue = inputArray[i];
		else if(inputArray[i] < minValue)
			minValue = inputArray[i];
	}
        
      System.out.println("Difference between the largest and smallest values of the array: "+(maxValue-minValue));
   }
}