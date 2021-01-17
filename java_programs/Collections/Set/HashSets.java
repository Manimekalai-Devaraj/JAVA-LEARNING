import java.util.*;  
public class HashSets {
    // implements Set Interface
    // It uses hash table for storage
    // It contains unique item (No duplicate)
    // Hashing is used to store the elements in the HashSet
    // does not allow null value
    // Its best approach for search operation
    // non synchronized.
    // While iterate the elements order is unpredictable
    public static void main(String[] args){
        HashSet<String> hashSet1 = new HashSet<String>(); 
        // add
        hashSet1.add("Manimekalai");
        hashSet1.add("Sarath");
        hashSet1.add("Sathya");
        System.out.println("After adding the elements: "+hashSet1);


        // Iterating though the HashSet 
        Iterator itr1 = hashSet1.iterator(); 
        while (itr1.hasNext()) 
            System.out.print("Iterate through while loop."+itr1.next()+"\n"); 
  
        // Using enhanced for loop 
        for (String s : hashSet1) 
            System.out.print("Iterate through for loop."+s+"\n"); 

        // remove()
        System.out.println("remove() :" +hashSet1.remove("Sathya"));
        System.out.println("After removing the elements: "+hashSet1);

        // clear
        hashSet1.clear();
        System.out.println("After clearing the elements: "+hashSet1);

        HashSet<String> hashSet2 = new HashSet<String>(); 
        hashSet2.add("Tamil");

        // removeAll
        hashSet1.removeAll(hashSet2);
        System.out.println("After applying the removeAll(): "+hashSet1);

        // addAll
        hashSet2.addAll(hashSet1);
        System.out.println("After applying the addAll(): "+hashSet2);

        // contains
        System.out.println("contains() :"+hashSet1.contains("Sarath"));
        System.out.println("contains() :"+hashSet1.contains("Hi"));

        // containsAll
        System.out.println("Use containsAll() "+hashSet2.containsAll(hashSet1));

        // equals
        System.out.println("Check for equals(): "+hashSet1.equals(hashSet2));

        // isEmpty()
        System.out.println("Check for empty hashSet or not: "+hashSet1.isEmpty());
    }

}
