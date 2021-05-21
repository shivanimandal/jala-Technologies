//1. Write a function to add integer values of an array

import java.util.Scanner;
class SumOfElementsOfAnArray {

   public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);
      Check obj = new Check();

      System.out.print("Enter how many elements you want to entered: ");
      int n = sc.nextInt();

      int[] arr = new int[n];
      
      System.out.println("Enter the elements:");
      for (int i=0; i<n; i++)
      {
    	  arr[i] = sc.nextInt();
      }
      obj.add(arr);	
   }
}
class Check {
   public static void add(int a[]) {
	int sum = 0;
      for( int num : a) {
          sum = sum+num;
      }
      System.out.println("Sum of array elements is:"+sum);
   }
}