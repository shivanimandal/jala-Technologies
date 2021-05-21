//19. Write a function to find the missing number of sorted array of 1 to 100

import java.util.Scanner;

public class MissingNumber {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the n value between 1 to 100: ");
      int n = sc.nextInt();

      int arr[] = new int[n];

      System.out.println("Enter (n-1) sorted numbers: ");
      for(int i=0; i<=n-2; i++) {
         arr[i] = sc.nextInt();
      }

      //Finding the missing number
      int sumOfAll = (n*(n+1))/2;
      int sumOfArray = 0;
      for(int i=0; i<=n-2; i++) {
         sumOfArray = sumOfArray+arr[i];
      }

      int missingNumber = sumOfAll-sumOfArray;
      System.out.println("Missing number is: "+missingNumber);
   }
}