import java.util.*;
public class LinkedHashSets {
    // maintains a doubly linked List across all elements.
    // In Set order is unpredictable if we want to maintain order the use LinkedHashSet
    // It iterated based on the insertion order
    // elements returns based on the insertion order
    public static void main(String[] args){
        LinkedHashSet<String> linkedset1 = new LinkedHashSet<String>();

        // add
        linkedset1.add("Manimekalai");
        linkedset1.add("Saranya");

        LinkedHashSet<String> linkedset2 = new LinkedHashSet<String>();
        // addAll()
        linkedset2.addAll(linkedset1);
        System.out.println("After apply addAll() "+linkedset2);

        // contains()
        System.out.println("contains() "+linkedset2.contains("Saranya")); // Check letter case as well

        // equals()
        System.out.println("Apply equals() "+linkedset1.equals(linkedset2));

        // Iterating though the LinkedHashSet 
        Iterator itr1 = linkedset1.iterator(); 
        while (itr1.hasNext()) 
            System.out.print("Iterate through while() "+itr1.next()+"\n");
  
        // Using enhanced for loop 
        for (String s : linkedset2) 
            System.out.print("Iterate through for loop "+s+"\n"); 

        // remove
        linkedset1.remove("Saranya");
        System.out.println("After apply remove() "+linkedset1);

        // removeAll
        linkedset1.removeAll(linkedset2);
        System.out.println("After apply removeAll() "+linkedset1);

        // clear
        linkedset2.clear();
        System.out.println("After apply clear() "+linkedset2);
    }
}
