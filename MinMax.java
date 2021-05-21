//8. Write a function to find the minimum and maximum value of an array

import java.util.*;
class MinMax { 
 
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of elements you want to enter: ");
    int n = sc.nextInt();

    int arr[] = new int[n];
	
    System.out.println("Enter the elements into an array: ");
    for(int i = 0;i < n;i++) {
	arr[i] = sc.nextInt();
    }
 
    // Calling getMax() method for getting max value
    int max = getMax(arr);
    System.out.println("Maximum Value is: "+max);
 
    // Calling getMin() method for getting min value
    int min = getMin(arr);
    System.out.println("Minimum Value is: "+min);
  }
 
  // Method for getting the maximum value
  public static int getMax(int[] inputArray){ 

    int maxValue = inputArray[0];
 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    }
 
    return maxValue; 
  }
 
  // Method for getting the minimum value
  public static int getMin(int[] inputArray){
 
    int minValue = inputArray[0]; 

    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 

    return minValue; 
  } 
}