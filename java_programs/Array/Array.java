import java.util.Arrays;
import java.util.ArrayList; 
public class Array {
    public static void main(String[] args){
        String[] array_1 = new String[3]; // allocate memory can accept only 3 data
        String[] array_2; // declare array can hold n number of data
        int[] array_3 = new int[]{1,2,3,4,5}; // initialize array values

        array_1[0] = "Test1";
        array_2 = array_1;
        System.out.println(Arrays.toString(array_1)); // response [Test1, null, null]
        System.out.println(Arrays.toString(array_2)); // response [Test1, null, null]
        System.out.println(Arrays.toString(array_3)); // response [Test1, null, null]

        // Array list class
        ArrayList<String> arrayList = new ArrayList<String>(); 
        arrayList.add("Manimekalai"); 
        System.out.println(arrayList); // response [Test1, null, null]
    }
}
