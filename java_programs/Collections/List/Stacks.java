import java.util.*;
public class Stacks {
    // Implements stack
    // LIFO - Last In First Out
    public static void main(String[] args){
        Stack<String> stack1 = new Stack<String>();  
        //Push()
        stack1.push("One");  
        stack1.push("Two");  
        stack1.push("Three");  
        stack1.push("Four");  
        stack1.push("Five"); 

        for(String i:stack1){
            System.out.println(i);
        } 
        Stack<String> stack2 = new Stack<String>();  
        // throws error because stack is empty
        // stack2.pop(); 

        System.out.println("Stack elements "+stack1);

        // check empty()
        System.out.println("Check Stack is empty or not "+stack1.isEmpty()); // False
        System.out.println("Check Stack is empty or not "+stack2.isEmpty()); // true

        // search
        System.out.println("Search from stack "+stack2.search("Mani")); // -1
        System.out.println("Search from stack "+stack1.search("One")); // return position 5
        System.out.println("Search from stack "+stack1.search("Two")); // return position 4

        // pop() return and remove top(First) element
        System.out.println("Search from stack "+stack1.pop()); // return position 4

        // peek() return top element and without removing top(First) element
        System.out.println("Search from stack "+stack1.peek()); // return position 4

    }
}
