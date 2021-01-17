import java.util.*;  
public class Vectors {
    // Similar to arrayList
    // synchronized
    // COntains method that is not part of method
    public static void main(String[] args){
        Vector<String> vectorList1 = new Vector<String>();  

        // add elements
        vectorList1.add("Divya");  
        vectorList1.add("Sri");  
        vectorList1.add("Ganesh");  
        vectorList1.add("Saarath");
        vectorList1.addElement("Mani");

        // Check size  
        System.out.println("Size is: "+vectorList1.size());  

        // Checking contains  and indexOf
        if(vectorList1.contains("Ganesh"))  
        {  
           System.out.println("Ganesh is present at the index " +vectorList1.indexOf("Ganesh"));  
        }  

        //Get the first element  
        System.out.println("TGet first element = "+vectorList1.firstElement()); 

        //Get the last element  
        System.out.println("The last element = "+vectorList1.lastElement()); 

        // get elements
        System.out.println("Element at index 1 is = "+vectorList1.get(1));  

        //Create an empty list  
        List<String> vectorList2 = new ArrayList<String>();  

        //Add values in the List  
        vectorList2.add("Divya");  
        vectorList2.add("Saarath");  
        System.out.println("Check vector contains all list elements?: "+vectorList1.containsAll(vectorList2));  // either true or false

        // elementAt return value based on the index value
        System.out.println("Element at index 1 is = "+vectorList1.elementAt(2));

        //Create an new Array with intial size 4  
        String tempArray[] = new String[5];

        //Copy Vector element to Array  
        vectorList1.copyInto(tempArray);   
        System.out.println("Copy elements from vector to array = "+tempArray);

        //Cannot Copy a Vector element to Array List, linkedList
        ArrayList <String> arrayList = new ArrayList();
        LinkedList <String> linkedList = new LinkedList();

        // vectorList1.copyInto(arrayList);   
        // vectorList1.copyInto(linkedList);   

        // elements()
        Enumeration<String> enumList = vectorList1.elements();
        while(enumList.hasMoreElements()){
            System.out.println("Elements = "+enumList.nextElement());
        }

        //Iterator  
        Iterator<String> itrList = vectorList1.iterator();  
        while(itrList.hasNext()){  
            System.out.println("Elements using iterator= "+itrList.next());  
        }

        // equals - Both vector list size and elements values should be equal
        Vector<Integer> vectorList3 = new Vector<>();  
        vectorList3.add(1);  
        vectorList3.add(2);  
        vectorList3.add(3);  
        
        Vector<Integer> vectorList4 = new Vector<>();  
        vectorList4.add(1);  
        vectorList4.add(2);  
        vectorList4.add(3);  
        System.out.println("vectorList3 equals vectorList4 ? "+vectorList3.equals(vectorList4)); // Will return true
        vectorList4.add(4);  
        System.out.println("vectorList3 equals vectorList4 ? "+vectorList3.equals(vectorList4)); // Will return false 

        //Use forEach() method to print vector elements  
        vectorList4.forEach(System.out::println);  
        for(int i: vectorList4){
            System.out.println(i);
        }

        // Check empty
        System.out.println("Is the Vector empty? = " +vectorList4.isEmpty());   // return true or false

        //Display vector elements  
        System.out.println("Vector elements: " +vectorList1);  
        //replace all vector element "2" with "20"  
        Collections.replaceAll(vectorList1, "Ganesh", "GaneshChar");  
        //Display vector elements after replacement  
        System.out.println("New vector elements: " + vectorList1);  

        // remove 
        System.out.println("Remove element at index 4: " +vectorList1.remove(4)); 
        System.out.println("After Remove element at index 4: " +vectorList1);  

        vectorList1.removeElementAt(1);
        System.out.println("After Remove element at index 1: " +vectorList1);  
        vectorList1.removeAllElements();
        System.out.println("After Remove all elements: " +vectorList1);  
        System.out.println("After RemoveAll: " +vectorList1.removeAll(vectorList1));

        // convert it as array
        System.out.println("Convert it as string() " +vectorList1.toString());
        System.out.println("Convert it as array() " +vectorList1.toArray());
    }
}
