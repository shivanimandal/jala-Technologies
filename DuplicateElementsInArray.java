//10. Write a function to find the duplicate values of an array

import java.util.*;

class DuplicateElementsInArray { 
   
    public static void main(String[] args) { 
       
        Scanner sc = new Scanner(System.in);

	System.out.println("Enter number of elements u want to enter: ");
        int n = sc.nextInt();
 
        int [] arr = new int [n];
	
	System.out.println("Enter the elements you want to enter: ");
	for(int i = 0;i < n;i++) {
		arr[i] = sc.nextInt();
	}
   
        //Elements in array
        System.out.println("Elements in array: ");    
        for (int i = 0; i < arr.length; i++) {     
           System.out.print(arr[i] + " ");    
        }     
            
        System.out.println(); 
            
         System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);
            }  
        } 
     }    
}    