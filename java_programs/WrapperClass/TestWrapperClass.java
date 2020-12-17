import java.util.ArrayList; 
public class TestWrapperClass {
    public static void main(String[] args){
        /**
         *  This file covers auto boxing
            convert primitive types to wrapper class objects
         */
        char Initial = 'D';
        int MyAge = 24;
        Character TestInitial = Initial;
        Integer TestMyAge = MyAge;
        // printing the values from object 
        System.out.println("Print values from Character wrapper class object: "+TestInitial);
        System.out.println("Print values from Integer wrapper class object: "+TestMyAge);


        /**
         *  This file covers unboxing
            convert wrapper class objects to primitive types
         */
        Character LuckyCharacter = 'S'; 
        // unboxing - Character object to primitive conversion 
        char TestLuckyCharacter = LuckyCharacter;
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
        arrayList.add(1000); 
        // unboxing - Integer object to int primitive conversion
        int number = arrayList.get(0); 
        // printing the values from primitive data types 
        System.out.println("Print values from char primitive data types : "+TestLuckyCharacter);
        System.out.println("Print values from int primitive data types : "+number);

        //Converting int into Integer  
        int a=20;  
        Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
        Integer j=a;//auto boxing, here compiler will write Integer.valueOf(a) internally  
        System.out.println("Actual value: "+a+" Explicit conversion: "+i+" auto boxing: "+j);  
    }
    

}
