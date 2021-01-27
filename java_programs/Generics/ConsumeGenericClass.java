import java.util.List;

public class ConsumeGenericClass {
    // It can accept any type of array elements
    public <E> void getDetails(E[] arrayElements){
        for(E elements: arrayElements){
            System.out.println(elements);
        }
    }

    public static void main(String[] args){
        // Create object for GenericClasses
        GenericClasses<String> gclass1 = new GenericClasses();
        // add items to the GenericClasses
        gclass1.add("Manimekalai");
        gclass1.add("Sarath");
        gclass1.add("Ahalya");
        // get the items from GenericClasses
        System.out.println(gclass1.get(2));;

        // Call generic method Does not accepts primitive type
        Integer[] intArray = { 10, 20, 30, 40, 50 };  
        Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };  

        ConsumeGenericClass consumeClass = new ConsumeGenericClass();
        System.out.println( "Printing Integer Array" );  
        consumeClass.getDetails(intArray);   
  
        System.out.println( "Printing Character Array" );  
        consumeClass.getDetails(charArray);   

        // Wildcard generics types
        // 1. Upperbound wildcard generics
        // 2. Lower bound wildcard generics
        // 3. unbound wildcard generics
    }
}
