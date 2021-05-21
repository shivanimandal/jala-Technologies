//4. Write a function to test if array contains a specific value

import java.util.Scanner;
class ToFindSpecificValue {

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

      System.out.println("Enter the element to be found: ");
      int num = sc.nextInt();

      obj.find(arr,num);	
   }
}
class Check {

   public static void find(int a[], int t) {

      int i = 0;
      int flag = 0;
      while(i < a.length) {

	if(t == a[i]) {
		System.out.println(t+" is found.");
		flag++;
		break;
	}
	i++;

      }
      if(flag==0) {
		System.out.println(t+" is not found.");
      }	
   }
}		
      