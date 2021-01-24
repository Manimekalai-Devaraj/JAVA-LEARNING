import java.util.*;
public class LinkedHashMaps {
    // Map is used to store data as key value pairs
    // Map contains unique keys
    // It is useful if we want to update,search and delete based on the key
    // LinkedHashMaps extents HashMap and implements the Map interface 
    // It does not allow duplicate keys but it allows duplicate values
    // It allows null keys and values
    // LinkedHashMaps maintains the insertion order
    // It can't be traversed so need to convert it into Set using keySet() or entrySet() method
    // It uses hashing technique , key will be used for all the operations like search,indexing ect,.
    public static void main(String[] args){
        LinkedHashMap <String,String> lhm1 = new LinkedHashMap<>();

        // Add mappings using put method 
        lhm1.put("one", "https://www.geeksforgeeks.org/"); 
        lhm1.put("two", "https://www.javatpoint.com/"); 
        lhm1.put("three", "full.io");

        System.out.println("After adding the elements: "+lhm1); // Maintains insertion order

        // update use put() function
        // The key already exist so automatically value will be updated
        lhm1.put("two", "https://www.javatpoint.co/");

        // Here value already exist but not the key so it will allowed
        lhm1.put("four", "https://www.javatpoint.co/"); 
        
        // Allows null key and values
        lhm1.put(null, null); 

        System.out.println("After updating the elements: "+lhm1);

        // get by key
        System.out.println("Getting value based on key: " + lhm1.get("one")); 

        // Check map size
        System.out.println("Size of the map: "+ lhm1.size()); 
  
        // Check map is empty or not
        System.out.println("Check map is empty or not " + lhm1.isEmpty()); // true or false

        // Check particular key is contains or not
        System.out.println("Map contains key three ?:" + lhm1.containsKey("three"));  // true
        System.out.println("Map contains key three ?:" + lhm1.containsKey("ten")); // false
        
        // check particular value is contains or not
        System.out.println( "Contains value full.io ? " + lhm1.containsValue("full.io")); // true
        System.out.println( "Contains value full.io.com ? " + lhm1.containsValue("full.io.com")); // false

        // remove map
        lhm1.remove("one");

        // Iterate linkedHashMap cannot iterate directly so convert it as entryset or set
        for (Map.Entry<String, String> mapElement : lhm1.entrySet()) { 
  
            System.out.println("Iterate map elements: "+ "Key: "+ mapElement.getKey()+" value: "+ mapElement.getValue());

        } 
    }
}
