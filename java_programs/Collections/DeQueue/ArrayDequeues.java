import java.util.Deque;

import java.util.*;
public class ArrayDequeues {
    // ArrayDeque implements both Queue and Deque
    // Can do operations in both the sides (Top and Bottom)
    // ArrayDeque is faster than ArrayList and Stack
    // Double Ended Queue
    // Resizable-array no capacity restriction
    // Null elements are not allowed
    public static void main(String[] args){
        // <------------------------- Adding Elements ------------------------------>
        Deque <String> dequeueArray1 = new ArrayDeque<String>();
        dequeueArray1.add("Tamil");
        dequeueArray1.add("English");
        dequeueArray1.add("Maths");
        System.out.println("ArrayDeque elements are "+dequeueArray1);

        // addFirst() method to insert at start  throw exception if no space available to insert element
        dequeueArray1.addFirst("Telugu"); 
        // push() method : 
        dequeueArray1.push("Gujarati");  // pushed at 1st position

        // addLast() method to insert at end 
        dequeueArray1.addLast("Marati"); 

        // offer() method to insert throw false if no space available to insert element
        dequeueArray1.offer("For"); 
        dequeueArray1.offerFirst("Welcome"); 
        dequeueArray1.offerLast("Geeks"); 

        // toArray() method : 
        Object[] arr = dequeueArray1.toArray(); 
        System.out.println("\nArray Size : " + arr.length); 

        // <-------------------------------- Accessing the Elements  ------------------------------->
        // element() method : to get Head element throws exception if no element exists
        System.out.println("Head Element using element(): " + dequeueArray1.element()); 
   
        // getFirst() method : to get Head element throws exception if no element exists
        System.out.println("Head Element using getFirst(): " +  dequeueArray1.getFirst()); 
   
        // getLast() method : to get last element throws exception if no element exists
        System.out.println("Last Element using getLast(): " +  dequeueArray1.getLast()); 

        // element() method : to get Head element and returns null if not exists
        System.out.println("Head Element using peek(): " + dequeueArray1.peek()); 
   
        // getFirst() method : to get Head element and returns null if not exists
        System.out.println("Head Element using peekFirst(): " +  dequeueArray1.peekFirst()); 
   
        // getLast() method : to get last element and returns null if not exists
        System.out.println("Last Element using peekLast(): " +  dequeueArray1.peekLast()); 

   
        // <-------------------------------- Removing the Elements  ------------------------------->
        
        // remove element from front throws exception if no element exists
        System.out.println("remove element from top/front pop() "+dequeueArray1.pop()); 
  
        // remove element from front returns null if no element exists
        System.out.println("remove element from front poll() "+dequeueArray1.poll()); 
  
        // remove element from front 
        System.out.println("pollFirst() "+dequeueArray1.pollFirst()); 
  
        // remove element from back 
        System.out.println("pollLast() "+dequeueArray1.pollLast()); 


        // remove() method : Will get 1st element and remove it from dequeue
        // this will throw exception because queue is empty

        Deque <String> dequeueArray2 = new ArrayDeque<String>();
        // System.out.println("Head element remove : " + dequeueArray2.remove());
        // System.out.println("First element remove : " + dequeueArray2.removeFirst());
        // System.out.println("last element remove : " + dequeueArray2.removeLast());

        System.out.println("remove all elements : " + dequeueArray2.removeAll(dequeueArray1));
        System.out.println("removeLastOccurrence() : " + dequeueArray1.removeLastOccurrence("Maths"));

        // apply removeIf() method 
        // to remove based on the condition pass or fail
        dequeueArray1.removeIf(n -> (n) == "Maths"); 

        // containsAll() we can use this for comparing to dequeue array
        System.out.println("containsAll() : " + dequeueArray2.containsAll(dequeueArray1)); // true or false



        for(String i : dequeueArray1){
            System.out.println("Iterate array deque elements "+i);
        }
        System.out.println("Checks whether the queue is empty or not= "+dequeueArray1.isEmpty()); // returns either true or false
    }
    
}
