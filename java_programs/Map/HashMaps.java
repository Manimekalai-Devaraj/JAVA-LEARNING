import java.util.*;
public class HashMaps{
    // Map is used to store data as key value pairs
    // Map contains unique keys
    // It is useful if we want to update,search and delete based on the key
    // Hashmap implements Map interface
    // It does not allow duplicate keys but it allows duplicate values
    // It allows null keys and values
    // it doesn't maintain any order while adding.
    // It can't be traversed so need to convert it into Set using keySet() or entrySet() method
    // It uses hashing technique , key will be used for all the operations like search,indexing ect,.
    public static void main(String[] args){
       // Default Initialization of a Map 
       HashMap<String, String> hm1 = new HashMap<>(); 
  
        // Inserting the Elements 
        hm1.put("Key1", "Zara"); 
        hm1.put("Key2", "Ahalya"); 
        hm1.put("Key3", "Sarath"); 
        hm1.put("Key4", "Dev"); 
        hm1.put("Key5", "Tamil"); 

        // The key already exist so automatically value will be updated
        hm1.put("Key3", "Maran"); 
        // Here value already exist but not the key so it will allowed
        hm1.put("Key6", "Sarath"); 
        // Allows null key and values
        hm1.put(null, null); 


  
        System.out.println("After inserting into map : "+hm1);  // { Key2=Ahalya, Key1=Manimekalai, Key3=Sarath }

        // Updating the elements
        hm1.put("Key1", "Manimekalai");
        System.out.println("After Updating the Map " + hm1); 

        // get values based on the key
        System.out.println("Get values based on the key: "+hm1.get("Key1"));
        
        // Check map size
        System.out.println("Size of the map: "+ hm1.size()); 
  
        // Check map is empty or not
        System.out.println("Check map is empty or not " + hm1.isEmpty()); // true or false

        // Check particular key is contains or not
        System.out.println("Map contains key three ?:" + hm1.containsKey("Key1"));  // true
        System.out.println("Map contains key three ?:" + hm1.containsKey("Key10")); // false
        
        // check particular value is contains or not
        System.out.println( "Contains value Tamil ? " + hm1.containsValue("Tamil")); // true
        System.out.println( "Contains value Hello ? " + hm1.containsValue("Hello")); // false


        // remove elements
        hm1.remove("Key2");
        System.out.println("After removing the Map " + hm1); 

        // Iterate the elements
        for(Map.Entry mapKey: hm1.entrySet()){
            if(mapKey.getKey() == "Key1"){
                // update values through Map.Entry interface methods
                mapKey.setValue("Hi");
            }
            System.out.println("Iterate map elements: "+ "Key: "+ mapKey.getKey()+" value: "+ mapKey.getValue());
        }
    }
}