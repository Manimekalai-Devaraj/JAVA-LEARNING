// by defult one public class should be there 
// the file name should be a public class name
public class FirstClass {
    /**
     * This file will cover class, methods , member variables and
     * access modifiers
     */
    protected int addTwoNumbers(int a, int b){ // can access only in their sub class
        return a+b;
    }
    public int multiplyTwoNumbers(int a, int b){ // can access in any class
        return a*b;
    }
    private int subtractTwoNumbers(int a, int b){ 
        return a-b;
    }
    double divideTwoNumbers(int a, int b){
        return a/b;
    }
    public static void main(String args[]){  
        // throw error because the class is private
        // PrivateClass obj = new PrivateClass();  

        // Will throw compile error we tried to access private variables and methods
        // DefaultClass DefaultClassObj = new DefaultClass();  
        // System.out.println(DefaultClassObj.number); 
        // System.out.println(DefaultClassObj.square(10));

        // Call protected method with in the class
        FirstClass FSObject = new FirstClass();
        System.out.println("Access protected member function: "+FSObject.addTwoNumbers(12, 34));
        System.out.println("Access public member function: "+FSObject.multiplyTwoNumbers(12, 34));
        System.out.println("Access private member function: "+FSObject.subtractTwoNumbers(120, 34));
        System.out.println("Access default member function: "+FSObject.divideTwoNumbers(120, 37));
    }
}

// private class PrivateClass{ // Cannot be declared we cannot able to create object
//     private double num = 100;
//     private int square(int length){
//      return length*length;
//     }
// }

// class DefaultClass{
//     private double number = 100;
//     private int square(int length){
//      return length*length;
//     }
// }

class SecondClass extends FirstClass {
    public static void main(String args[]){
        SecondClass obj = new SecondClass();
        System.out.println("Access protected member function: "+obj.addTwoNumbers(12, 34));
        System.out.println("Access public member function: "+obj.multiplyTwoNumbers(12, 34));

        // throw error because not visible (Private and default)
        // System.out.println("Access private member function: "+obj.subtractTwoNumbers(120, 34));
        // System.out.println("Access default member function: "+obj.divideTwoNumbers(120, 37));
       }
}