//2. Write a function to calculate the average value of an array of integers

import java.util.Scanner;
class AverageOfElementsOfAnArray {

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
      obj.average(arr);	
   }
}
class Check {

   public static void average(int a[]) {

      int sum = 0;

      for( int num : a) {
          sum = sum+num;
      }

      double avg = sum/a.length;

      System.out.println("Sum of array elements is:"+sum);
      System.out.println("Average of array elements is:"+avg);

   }
}