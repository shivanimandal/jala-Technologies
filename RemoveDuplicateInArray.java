//18. Write a program to remove the duplicate elements and return the new array

import java.util.*;

public class RemoveDuplicateInArray{ 
   
    public static void main(String[] args) { 
       
        Scanner sc = new Scanner(System.in);

	System.out.println("Enter number of elements u want to enter: ");
        int n = sc.nextInt();
 
        int [] arr = new int [n];
     
	System.out.println("Enter the elements you want to enter: ");
	for(int i = 0;i < n;i++) {
		arr[i] = sc.nextInt();
	}
        int length=remove(arr, n);
    
       //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
    
    public static int remove(int arr[], int n) { 
 
        if (n==0 || n==1){  
            return n;  
        }
  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }
  
        temp[j++] = arr[n-1];
     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        } 
 
        return j;  
    }  
}    