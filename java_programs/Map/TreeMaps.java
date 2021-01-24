import java.util.*;
public class TreeMaps{
    // Map is used to store data as key value pairs
    // Map contains unique keys
    // It stores key values pairs in sorted order.
    // It is useful if we want to update,search and delete based on the key
    // conatins values based on the key
    // TreeMap contains only unique elements.
    // cannot have a null key but can have multiple null values.
    // TreeMap is non synchronized.
    // TreeMap maintains ascending order.
    public static void main(String[] args){
        TreeMap<Integer, String> tmap1  = new TreeMap<>(); 
        tmap1.put(1, "Family");
        tmap1.put(4, "Education");
        tmap1.put(3, "Happiness");
        tmap1.put(5, "Money");
        tmap1.put(2, "Health");

        System.out.println("After inserting the elements "+tmap1); // {1=Family, 2=Health, 3=Happiness, 4=Education, 5=Money}

        // update
        tmap1.put(2, "Affection"); 
        System.out.println("After updating the elements "+tmap1); 

        // get by key
        System.out.println("Getting value based on key: " + tmap1.get(1)); 

        // Check tree map size
        System.out.println("Size of the map: "+ tmap1.size()); 

        // Check map is empty or not
        System.out.println("Check map is empty or not " + tmap1.isEmpty()); // true or false

        // Check particular key is contains or not
        System.out.println("Map contains key 5 ?:" + tmap1.containsKey(5));  // true
        System.out.println("Map contains key 11 ?:" + tmap1.containsKey(11)); // false
        
        // check particular value is contains or not
        System.out.println( "Contains value Happiness ? " + tmap1.containsValue("Happiness")); // true
        System.out.println( "Contains value FALSE ? " + tmap1.containsValue("FALSE")); // false


        // remove
        tmap1.remove(5);
        System.out.println("After removing the elements "+tmap1); 

        // Iterate the tree map elements
        for(Map.Entry mapElement:tmap1.entrySet()){
            System.out.println("Key: "+mapElement.getKey()+" values: "+mapElement.getValue());
        }
    }
}