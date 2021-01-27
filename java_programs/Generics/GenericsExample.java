import java.util.*;

public class GenericsExample{
    // Generics is to deal with type-safe objects
    // Makes code stable by detecting the bugs at compile time.
    // Before generics we store all types (Non generics) in collections
    // But now the generics enforces to store specific type of objects.
    // Advantages
    //  Type-safety : Can store specified object only
    // Type casting is not required
    // Compile time checking: So the error will not occur at runtime

    public static void main(String[] args){
        // <-----   Adavantage: 1 - Allows specified type of objects   ------------->
        // Without generics allows multiple types of objects
        List list = new ArrayList();    
        list.add(10);  
        list.add("10");  

        // With Generics, it is required to specify the type of object we need to store.  
        List<Integer> list1 = new ArrayList<Integer>();    
        list1.add(10);  
        // list1.add("10");// compile-time error  



        // <---- Advantage: 2 - Typecast not required  ------------->
        List list2 = new ArrayList();    
        list2.add("hello");    
        String str1 = (String) list2.get(0); //typecasting    
        System.out.println("With-type casting"+str1);

        // After Generics, we don't need to typecast the object.  
        List<String> list3 = new ArrayList<String>();    
        list3.add("hello");    
        String str2 = list3.get(0);  
        System.out.println("Without-type casting"+str2);



        // <------- Advantage: 3 - Compile time error   -------------->
        List<String> list4 = new ArrayList<String>();    
        list4.add("hello");    
        // list4.add(32);//Compile Time Error    
    }
}