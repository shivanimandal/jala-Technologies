//6. Write a function to copy an array to another array

import java.util.*;

class CopyArray { 
   
    public static void main(String[] args) { 
       
        Scanner sc = new Scanner(System.in);

	//int n = sc.nextInt();
	//System.out.println("Enter number of elements u want to enter: ");
 
        int [] arr1 = new int [];
     
         //Create another array arr2 with size of arr1    
        int arr2[] = new int[arr1.length]; 
	
	System.out.println(Enter the elements you want to enter: ");
	for(int i = 0;i++) {
		arr1[i] = sc.nextInt();
	}
   
        //Copying all elements of one array into another    
        for (int i = 0; i < arr1.length; i++) {     
            arr2[i] = arr1[i];     
        }      
         //Displaying elements of array arr1     
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr1.length; i++) {     
           System.out.print(arr1[i] + " ");    
        }     
            
        System.out.println();    
            
        //Displaying elements of array arr2     
        System.out.println("Elements of new array: ");    
        for (int i = 0; i < arr2.length; i++) {     
           System.out.print(arr2[i] + " ");    
        }     
    }    
}    