//3. Write a program to find the index of an array element

import java.util.Scanner;
class IndexOfElement {

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

      System.out.println("Enter the element to find its index position: ");
      int num = sc.nextInt();

      obj.index(arr,num);	
   }
}
class Check {

   public static void index(int a[], int t) {

      int i = 0;
      int flag = 0;
      while(i < a.length) {

	if(t == a[i]) {
		System.out.println("Index position of "+t+" is "+i);
		flag++;
		break;
	}
	i++;

      }
      if(flag==0) {
		System.out.println("Element not found");
      }	
   }
}		
      