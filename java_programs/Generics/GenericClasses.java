import java.util.Arrays;
import java.lang.Math; 
public class GenericClasses <T> {
    private Object[] DefinedArray = new Object[10];
    private int CurrentArraySize = 0;
     
    public Object get(int index){
        if(index < CurrentArraySize){
            return DefinedArray[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void add(T obj){
        // Dynamically increase the array size if the array is filled half of its size like if size 8, 
        // if it is filled beyond 4 (5,6,7,8) then increase the size

        // 8 - 5 <= ((8/2) = 4)  
        // so 3 <= 4 increase   the size
        if(DefinedArray.length - CurrentArraySize <= Math.ceil(DefinedArray.length/2)){
            increaseListSize();
        }
        DefinedArray[CurrentArraySize++] = obj;
    }

    private void increaseListSize(){
        // increase by its own length size that is if array allocated size 10 then increase it into 20
        DefinedArray = Arrays.copyOf(DefinedArray, DefinedArray.length);
    }
}
