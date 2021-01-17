import java.util.*;
public class ArrayLists {
    // ArrayList class implements the List interface
    // allows duplicate elements
    // maintains insertion order and non synchronized
    // Slow when compared to array and randomly accessed
    public static void main(String[] args){

        // Array list
        ArrayList<String> subjects = new ArrayList<String>(); // can be used for wrapper class not primitive types
        subjects.add("Tamil");
        subjects.add("English");
        subjects.add("Maths");
        subjects.add("Science");
        subjects.add("Social Science");
        subjects.add("Time");
        System.out.println("Before: "+subjects);
        
        // add item
        subjects.add("Hindi");
        System.out.println("After adding the elements: "+subjects);

        // get elements
        System.out.println("Getting the element before update: "+subjects.get(3));

        // update elements
        subjects.set(3,"Arabic");
        System.out.println("After updating the elements: "+subjects.get(3));

        // loop the array list elements
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println("loop the array-list "+subjects.get(i));
        }
        for (String i:subjects) {
            System.out.println("loop the array-list using for-each "+i);
        }
        // sort array list
        Collections.sort(subjects);
        System.out.println("After sorting the array list: "+subjects);

        // inserting all elements of subjects to arrlist from the third position 
        ArrayList<String> arrlist = new ArrayList<String>();
        arrlist.add("Time");
        arrlist.add("Time1");
        arrlist.addAll(2, subjects); 
        System.out.println("Add items from one array list to another list "+arrlist.toString());

        // remove item
        subjects.remove("English");
        subjects.remove(1);
        System.out.println("After remove the elements: "+subjects);

        arrlist.removeAll(subjects);
        System.out.println("After removeAll the elements: "+subjects);
        System.out.println("After removeAll the elements: "+arrlist);

        System.out.println("After removeIf(): "+subjects.removeIf(n -> (n == "Time")));

        // contains
        System.out.println("Array list contains() "+arrlist.contains("Time1")+" "+arrlist.contains("Time112"));
        
        System.out.println("Array list indexOf() "+arrlist.indexOf("Time1"));

        System.out.println("Array list isEmpty() "+arrlist.isEmpty()); // either true or false

        System.out.println("Array list isEmpty() "+arrlist.isEmpty()); // either true or false

        // clear all the elements
        subjects.clear();
        System.out.println("After clearing the array list: "+subjects);
    }
}
