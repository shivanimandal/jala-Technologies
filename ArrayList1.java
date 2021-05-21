/*1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to
ArrayList and perform the below operations
Add an element to the ArrayList
Iterate through the ArrayList by using Iterator object
Add an element at a specific index
Remove an element from the ArrayList, Remove at an index
Update the element at a specific index
Check the element is present at a particular index
Get an element at a particular index
Find out the size of the ArrayList
Check the given element is present in the ArrayList
Remove all elements of the ArrayList*/


import java.util.*;  
public class ArrayList1 {  
 public static void main(String args[]) { 
 
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist 
 
  list.add("Mumbai");//Adding elements to the arraylist    
  list.add("Delhi");    
  list.add("Bangalore");    
  list.add("Hyderabad");
  list.add("Bihar"); 
  list.add("Chennai"); 
  list.add("Tamil Nadu");
  list.add("Punjab");
  list.add("Jammu & Kashmir"); 
  list.add("Goa");
        
  //Traversing list through Iterator  
  Iterator itr=list.iterator();
  while(itr.hasNext()){  
   System.out.println(itr.next());//printing the element  
  }
  System.out.println();

  list.add(2,"Kolkata");  // adding element at a specific index

  System.out.println("Afer adding element at a specific index the elements in the list are:");
  System.out.println(list);
  System.out.println();
 
  list.remove(5); // removing 6th element
 
  System.out.println("Afer removing element at a specific index the elements in the list are:");
  System.out.println(list);
  System.out.println();

  //Updating 1st element
  list.set(0, "Madhya Pradesh");
  
  //Updating 2nd element
  list.set(1, "Tripura");

  System.out.println("Afer updating elements at a specific index the elements in the list are:");
  System.out.println(list);
  System.out.println();

  //getting an element at a particular index
  String element = list.get(1);
  System.out.println("The element at index 1 : "+element);
  System.out.println();

  // size of the arraylist
  System.out.println("The size of the ArrayList is: " + list.size());
  
  // Checking the given element is present in the ArrayList
  System.out.println("The element 'Madhya Pradesh' is available in ArrayList : " + list.contains("Madhya Pradesh"));
  System.out.println("The element 'Mumbai' is available in ArrayList : " + list.contains("Mumbai"));
  System.out.println();

  // remove all elements using clear() method
  list.clear();
  System.out.println("\nAfter clear\n\n" + "ArrayList: " + list);
  
  // print size of ArrayList after clear list
  System.out.println("Size of ArrayList = " + list.size());

  
 }  
}  