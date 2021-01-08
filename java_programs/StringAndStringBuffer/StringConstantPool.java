public class StringConstantPool {
    public static void main(String[] args){
        // This file covers SCP - String Constant Pool
        // SCP is in the heap memory - If values are same the same instance will be used for these two variables
        String TestString1 = "Mani";
        String TestString2 = "Mani";

        // Note that this == compares whether 
        // TestString1 and TestString2 refer to same object or not 
        // Result will be Equal
        if(TestString1 == TestString2){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }

        System.out.println("---- Using New keyword ----");
        // new key word used so new memory will be allocated in heap but outside SCP
        String TestString3 = new String("Mani");

        // Note that this == compares whether 
        // TestString1 and TestString3 refer to same object or not 
        // Result will be Not equal
        if(TestString1 == TestString3){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
        // For the above case use equalsIgnoreCase() or compareTo()
        System.out.println("String compareTo() "+TestString1.compareTo(TestString3)); //0 because both are equal  
    }
}
