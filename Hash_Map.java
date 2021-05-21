/*2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
Insert a Key value mapping into the map
Fetch the value of a Key
Create a clone/copy of HashMap
Check if the given Key is in the Map
Check if the value is in the Map
Check if the map is empty
Print the size of the Map to the console
Print all the Keys of the map to the console
Print all the Keys of the map to the console
Remove a specific Key-value pair
Copy all the elements of the Map to another Map*/

import java.util.*;
  
public class Hash_Map {
    public static void main(String[] args)
    {
        
        // Creating an empty HashMap
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
  
        // Mapping string values to int keys
        hmap.put(10, "Ramesh");
        hmap.put(15, "Sunitha");
        hmap.put(20, "Greeshma");
        hmap.put(25, "Pavan");
        hmap.put(30, "Shivani");
        hmap.put(35, "Nikitha");
        hmap.put(40, "Ramesh");
        hmap.put(45, "Keerthi");
        hmap.put(50, "Vinesh");
        hmap.put(55, "Sahiti");
        
  
        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hmap);
  
        // Getting/fetching the value of 25
        System.out.println("The Value is: " + hmap.get(25));
  
        // Getting/fetching the value of 10
        System.out.println("The Value is: " + hmap.get(10));

	// Displaying the cloned HashMap using clone()
        System.out.println("The cloned map look like this: " + hmap.clone());

        // key to be searched
        int key = 35;
        
        // check key exists in the map
        boolean isKeyExists = hmap.containsKey(key);

        System.out.println("Does key "+key+" exists : "+isKeyExists);

        // Check value exists in the map
        System.out.println("Does the value 'Shivani' present : " + hmap.containsValue("Shivani"));

        // Checking for the emptiness of Map
        System.out.println("Is the map empty : " + hmap.isEmpty());

        // Displaying the size of the map
        System.out.println("The size of the map is " + hmap.size());

        System.out.println("\nKeys...");
        Set keys = hmap.keySet();
        Iterator i = keys.iterator();
        while (i.hasNext()) {
           System.out.println(i.next());
        }

        System.out.println("\nValues...");
        Collection getValues = hmap.values();
        i = getValues.iterator();
        while (i.hasNext()) {
          System.out.println(i.next());
        }

        // Removing the existing key mapping
        String r = (String)hmap.remove(20);

        System.out.println("New map after removing specific key and value is: "+ hmap);

        // copying the hmap to secondmap
       HashMap<Integer, String> secondmap = new HashMap<Integer, String>();
       secondmap.putAll(hmap);
       
        System.out.println("After copying hmap to secondmap the elements in secondmap are: ");
        System.out.println(secondmap);
    }
}