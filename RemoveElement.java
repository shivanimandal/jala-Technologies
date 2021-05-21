//12. Write a method to remove duplicate elements from an array


import java.util.Scanner;
class RemoveElement {

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

      System.out.println("Enter the element to be removed: ");
      int num = sc.nextInt();
      
       System.out.println("Before deletion the elements in an array are: ");
       for(int i = 0; i < n; i++)
	{
		System.out.print(arr[i]+" ");
        }
	System.out.println();

      obj.find(arr,num);	
   }
}
class Check {

   public static void find(int a[], int t) {
	
	int[] b = new int[a.length-1];

	for(int i=0, j=0;i<a.length;i++){
            if(a[i]!=t){
                b[j]=a[i];
                j++;
            }
        }
	 
	System.out.println("After deletion the elements in an array are: ");	
      	for(int i = 0; i < b.length; i++)
	{
		System.out.print(b[i]+" ");
        }
   }
}		
      