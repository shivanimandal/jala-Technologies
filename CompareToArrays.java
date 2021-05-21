//11. Write a program to find the common values between two arrays

import java.util.*;

class CompareToArrays { 
   
    public static void main(String[] args) { 
       
        Scanner sc = new Scanner(System.in);

	System.out.println("Enter number of elements u want to enter in array1: ");
        int n = sc.nextInt();
        
        System.out.println("Enter number of elements u want to enter in array2: ");
        int m = sc.nextInt();

        int [] arr1 = new int [n];
        int [] arr2 = new int [m];
	
	System.out.println("Enter the elements you want to enter in array1: ");
	for(int i = 0;i < n;i++) {
		arr1[i] = sc.nextInt();
	}
   
        System.out.println("Enter the elements you want to enter in array2: ");
	for(int i = 0;i < m;i++) {
		arr2[i] = sc.nextInt();
	}
        
        System.out.print("Common Elements are: ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }    
}    