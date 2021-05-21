/*3. Create a HashSet with at least 10 elements of type String
Write program covering all the operations of HashSet*/

import java.util.*;
  
class Hash_Set {
  
    // Main Method
    public static void main(String[] args)
    {
        HashSet<String> ht = new HashSet<String>();
  
        // Adding elements into HashSet usind add()
        ht.add("Apple");
        ht.add("Mango");
        ht.add("Pineapple");
        ht.add("Orange");
        ht.add("Strawberry");
        ht.add("Grapes");
        ht.add("Blueberry");
        ht.add("Banana");
        ht.add("Cherry");
        ht.add("Kiwi");
        ht.add("Apple"); // adding duplicate elements
  
        // Displaying the HashSet
        System.out.println("Elements are:");
        System.out.println(ht);

        //Checking whether a specific value exists or not
        System.out.println("List contains Cherry or not:" + ht.contains("cherry"));
  
        // Removing items from HashSet using remove()
        ht.remove("Banana");
        System.out.println("List after removing Banana:" + ht);
  
        // Iterating over hash set items
        System.out.println("Iterating over list:");
        Iterator<String> i = ht.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}