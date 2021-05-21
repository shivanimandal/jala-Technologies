//9. Write a function to reverse an array of integer values

import java.util.*;

class ReverseArray { 
   
    public static void main(String[] args) { 
       
        Scanner sc = new Scanner(System.in);

	System.out.println("Enter number of elements u want to enter: ");
        int n = sc.nextInt();

        int [] arr = new int [n];
	
	System.out.println("Enter the elements you want to enter: ");
	for(int i = 0;i < n;i++) {
		arr[i] = sc.nextInt();
	}

        System.out.println("Original array: ");  
        for (int i = 0; i < n; i++) {  
            System.out.print(arr[i] + " ");  
        }
    
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = n-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  
   
         
    }    
}    