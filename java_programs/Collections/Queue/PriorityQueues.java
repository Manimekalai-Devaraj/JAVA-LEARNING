import java.util.*;  
public class PriorityQueues {
    // In this class we covered PriorityQueue
    // FIFO
    // Stored objects and elements
    // Does not allow null values
    // ASCII value will have the highest priority.
    // implements queue interface
    public static void main(String[] args){
        PriorityQueue <Integer> queue1 = new PriorityQueue();
        // add elements
        queue1.add(1000);
        queue1.add(1234);
        queue1.add(3453);
        
        // will throw error
        // queue1.add(null);

        // get top element
        System.out.println("PriorityQuey peek() "+queue1.peek());
        System.out.println("PriorityQuey element() "+queue1.element());

        // return top element and remove it from the queue
        System.out.println("PriorityQuey poll() "+queue1.poll());
        System.out.println("PriorityQuey peek() "+queue1.peek());

        // addAll
        PriorityQueue <Integer> queue2 = new PriorityQueue();
        queue2.addAll(queue1);

        // iterate the queue elements
        Iterator<Integer> itr2=queue1.iterator();  
        while(itr2.hasNext()){  
            System.out.println("PriorityQueue elements after addAll() "+itr2.next());  
        }

        // iterate the queue elements
        Iterator<Integer> itr1=queue1.iterator();  
        while(itr1.hasNext()){  
            System.out.println("PriorityQueue elements "+itr1.next());  
        } 
        
        // contains()
        System.out.println("Contains() "+queue1.contains(1234));
        
        // remove elements
        queue1.remove(3453);
        // clear()
        queue1.clear();
        // removeAll
        queue1.removeAll(queue1);
    }
}