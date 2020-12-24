import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class
public class Array {
    static int minValue(int testArray[]){
        return testArray[0];
    }
    // return array from function
    static int[] returnArray(int testArray[]){
        return (testArray);
    }
    public static void main(String[] args){
        // // Array list class
        // ArrayList<String> arrayList = new ArrayList<String>(); 
        // arrayList.add("Manimekalai"); 
        // System.out.println(arrayList); // response [Test1, null, null]

        // Array types of declarations
        int[] arr1;  
        int []arr2; 
        int arr3[];
        String[] array_1 = new String[3]; // allocate memory can accept only 3 data
        String[] array_2; // declare array can hold n number of data

        // types of instantiation of array
        arr1 = new int[20]; 
        int[] arr4 = new int[20]; 

        //initialization  
        array_1[0] = "Test1";
        array_1[1] = "Test2";
        array_1[2] = "Test3";
        //array_1[3] = "Test4"; // will throw java.lang.ArrayIndexOutOfBoundsException
        int[] array_3 = new int[]{100,201,334,467,589}; // initialize array values
        array_2 = array_1;

        System.out.println(Arrays.toString(array_1)); // response [Test1, null, null]
        System.out.println(Arrays.toString(array_2)); // response [Test1, null, null]

        //traversing array  
        for(int i = 0; i < array_3.length; i ++){ //length is the property of array  
            System.out.println("Traversing array: "+array_3[i]);  
        }
        for(int j: array_3){
            System.out.println("Traversing array using foreach: "+j);
        }

        // Passing Array to a Method in Java
        System.out.println("Passing Array to a Method: "+minValue(array_3));

        //passing anonymous array to method  (Without defining the array straightly send it as in params)
        System.out.println("Passing anonymous array to method: "+minValue(new int[]{40,50,78}));

        System.out.println("Get function response as array: "+returnArray(new int[]{40,50,78}));


        // Multidimensional Array declaration in Java
        int[][] TestArray1;
        int [][]TestArray2;
        int TestArray3[][];  
        int []TestArray4[];

        int[][] TestArray5 = new int[3][3];//3 row and 3 column  
        int TestArray6[][]={{1,2,3},{2,4,5},{4,4,5}};  
        //printing 2D array  
        for(int i=0;i<3;i++){  
            for(int j=0;j<3;j++){
                System.out.print(TestArray6[i][j]+" ");
            }  
            System.out.println();  
        }  

        // Array list
        ArrayList<String> subjects = new ArrayList<String>(); // can be used for wrapper class not primitive types
        subjects.add("Tamil");
        subjects.add("English");
        subjects.add("Maths");
        subjects.add("Science");
        subjects.add("Social Science");
        System.out.println("Before: "+subjects);
        
        // remove item
        subjects.remove("English");
        subjects.remove(1);
        System.out.println("After remove the elements: "+subjects);

        // add item
        subjects.add("Hindi");
        System.out.println("After adding the elements: "+subjects);

        // get elements
        System.out.println("Getting the element before update: "+subjects.get(3));

        // update elements
        subjects.set(3,"Arabic");
        System.out.println("After updating the elements: "+subjects.get(3));

        // loop the array list elements
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println("loop the array-list "+subjects.get(i));
        }
        for (String i:subjects) {
            System.out.println("loop the array-list using for-each "+i);
        }
        // sort array list
        Collections.sort(subjects);
        System.out.println("After sorting the array list: "+subjects);
        // clear all the elements
        subjects.clear();
        System.out.println("After clearing the array list: "+subjects);
    }
}
