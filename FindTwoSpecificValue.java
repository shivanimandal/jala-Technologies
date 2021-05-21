//17. Write a method to verify if the array contains two specified elements(12,23)

import java.util.Scanner;
class FindTwoSpecificValue {

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

      System.out.println("Enter the element two elements you want to find: ");
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();

      obj.find(arr,num1,num2);	
   }
}
class Check {

   public static void find(int a[], int num1, int num2) {

      int i = 0;
      int flag = 0;
      
      while(i < a.length) {

	if(num1 == a[i] || num2 == a[i]) {
		flag++;
            if(flag==2) 
               break;
	}
	i++;
      }

      if(flag==2) {
		System.out.println("Two Specific Values Found.");
      } else {
                System.out.println("Two Specific Values Not Found.");
      }
	
   }
}		
      