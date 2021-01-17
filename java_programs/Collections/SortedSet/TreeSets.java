import java.util.TreeSet;

public class TreeSets {
    // SortedSet is alternate of Set interface
    // provides a total ordering on its elements
    // TreeSet implements the Set interface
    // TreeSet is like HasSet
    // does not allow null 
    // It allows unique values
    // access time of TreeSet is fast
    // does not preserve the insertion order but Stored in ascending order
    public static void main(String[] args){

        TreeSet<String> treeSet1 = new TreeSet<String>(); 

        // add()
        treeSet1.add("Bus");
        treeSet1.add("Car");
        treeSet1.add("Zoom");
        treeSet1.add("GMeet");
        treeSet1.add("Skype");

        // Duplicates will not get insert 
        treeSet1.add("Bike"); 
        System.out.println("TreeSet elements "+treeSet1);

        // contains()
        System.out.println(treeSet1.contains("Bike"));
        TreeSet<String> treeSet2 = new TreeSet<String>(); 
        System.out.println("Apply containsAll() "+treeSet1.containsAll(treeSet2));

        // equals
        System.out.println("Apply equals() "+treeSet1.equals(treeSet2));

        // isEmpty()
        System.out.println("Apply isEmpty() "+treeSet1.isEmpty());

        // descendingSet()
        System.out.println("Apply descendingSet() "+treeSet1.descendingSet());

        // Print the first element in the TreeSet 
        System.out.println("First Value " + treeSet1.first()); 
  
        // Print the last element in the TreeSet 
        System.out.println("Last Value " + treeSet1.last()); 

        // Find the values just greater 
        // and smaller than the above string 
        System.out.println("Higher " + treeSet1.higher("Zoom")); 
        System.out.println("Lower " + treeSet1.lower("Zoom"));

        // remove
        treeSet1.remove("Zoom");
        System.out.println("After remove " + treeSet1); 

        // Removing the first element 
        treeSet1.pollFirst(); 
  
        System.out.println("After removing first " + treeSet1); 
  
        // Removing the last element 
        treeSet1.pollLast(); 
  
        System.out.println("After removing last " + treeSet1); 

        // clear() elements
        treeSet1.clear();
        System.out.println("After clearing the treeSet " + treeSet1); 

    }
}
