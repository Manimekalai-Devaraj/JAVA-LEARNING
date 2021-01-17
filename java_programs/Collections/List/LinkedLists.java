import java.util.*;
public class LinkedLists {
    // inkedList implements the Collection interface
    // used It uses a doubly linked list to store elements
    // Fast because no shift required
    // Maintains insertion order not synchronized
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();  
        list.add("Ravi");  
        list.add("Vijay");  
        list.add("Mani");  
        list.add("Ajay"); 

        LinkedList<String> list2=new LinkedList<String>();  
        list2.addAll(list);  

        // remove
        list2.remove(1);

        // get element
        System.out.println(list.get(1));
        System.out.println(list2);

        // remove all
        list2.removeAll(list);  
        System.out.println(list2);

        // class linked list
        LinkedList<String> list3 = new LinkedList<String>();
 
        // Adding elements to the linked list
        list3.add("A");
        list3.add("B");
        list3.addLast("C");
        list3.addFirst("D");
        list3.add(2, "E");
        list3.add(0, "S"); 
        System.out.println("Before add "+list3);

        list3.add(0, "SM");
        System.out.println("After add "+list3);

        // update or set
        System.out.println("Before update "+list3);
        list3.set(0, "MS");
        System.out.println("Before update "+list3);

        // remove
        list3.remove("B");
        list3.remove(3);
        list3.removeFirst();
        list3.removeLast();

        // iterate the linked list
        // Using the for each loop 
        for (String str : list3) 
            System.out.println("Iterate the linked list "+str);
    }
}
