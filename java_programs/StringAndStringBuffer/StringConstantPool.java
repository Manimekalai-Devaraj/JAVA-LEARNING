public class StringConstantPool {
    public static void main(String[] args){
        // This file covers SCP - String Constant Pool
        // In the heap memory SCP same instance will be used for these variables
        String TestString1 = "Mani";
        String TestString2 = "Mani";

        // Note that this == compares whether 
        // TestString1 and TestString2 refer to same object or not 
        if(TestString1 == TestString2){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
        // For the above case use equalsIgnoreCase() or compareTo()
        System.out.println("String compareTo() "+TestString1.compareTo(TestString2)); //0 because both are equal  


        System.out.println("---- Using New keyword ----");
        // new key word used so new memory will be allocated in heap but outside SCP
        String TestString3 = new String("Mani");

        // Note that this == compares whether 
        // TestString1 and TestString3 refer to same object or not 
        if(TestString1 == TestString3){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
        // For the above case use equalsIgnoreCase() or compareTo()
        System.out.println("String compareTo() "+TestString1.compareTo(TestString3)); //0 because both are equal  
    }
}
