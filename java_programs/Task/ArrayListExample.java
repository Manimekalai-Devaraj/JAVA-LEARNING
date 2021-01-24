import java.util.Arrays;
import java.lang.Math; 
public class ArrayListExample {
    private Object[] DefinedArray;
    private int CurrentArraySize = 0;
     
    public ArrayListExample(int arrayLength){
        DefinedArray = new Object[arrayLength];
    }
     
    public Object get(int index){
        if(index < CurrentArraySize){
            return DefinedArray[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
     
    public void add(Object obj){
        // Dynamically increase the array size if the array is filled half of its size like if size 8, 
        // if it is filled beyond 4 (5,6,7,8) then increase the size

        // 8 - 5 <= ((8/2) = 4)  
        // so 3 <= 4 increase   the size
        if(DefinedArray.length - CurrentArraySize <= Math.ceil(DefinedArray.length/2)){
            increaseListSize();
        }
        DefinedArray[CurrentArraySize++] = obj;
    }

    public void update(int index,Object obj){
        if(index < CurrentArraySize){
            DefinedArray[index] = obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
     
    public int size(){
        return CurrentArraySize;
    }
    public void deleteAll(){
        DefinedArray = new Object[DefinedArray.length];
        CurrentArraySize = 0;
    }
    private void increaseListSize(){
        // increase by its own length size that is if array allocated size 10 then increase it into 20
        DefinedArray = Arrays.copyOf(DefinedArray, DefinedArray.length);
    }
    
    public void delete(int index){
        if(index < CurrentArraySize){
            for(int i=index; i< CurrentArraySize ; i++){
                // Shifting elements
                DefinedArray[i] = DefinedArray[i+1];
            }
            CurrentArraySize --;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int indexOf(Object obj){
        int index = -1;
        for(int i=0; i< CurrentArraySize ; i++){
            if(DefinedArray[i].equals(obj)){
                index = i;
            }
        }
        return index;
    }
    public boolean isEmpty(){
        return (DefinedArray.length != 0) ? false : true;
    }
    public static void main(String a[]){
        ArrayListExample ArrayListObj = new ArrayListExample(9);
        // add
        ArrayListObj.add(2);
        ArrayListObj.add(5);
        ArrayListObj.add(1);
        ArrayListObj.add(23);
        ArrayListObj.add(14);
        ArrayListObj.add(39);
        ArrayListObj.add(89);

        for(int i=0;i<ArrayListObj.size();i++){
            System.out.print(ArrayListObj.get(i)+" ");
        }

        // get 
        System.out.println("Element at Index 5:"+ArrayListObj.get(5));

        // update 
        ArrayListObj.update(4,100);
        System.out.println("update element at Index 3:"+ArrayListObj);

        // gte total length
        System.out.println("List size: "+ArrayListObj.size());

        // indexOf()
        System.out.println("indexOf() "+ ArrayListObj.indexOf(89));

        // isEmpty()
        System.out.println("isEmpty() "+ ArrayListObj.isEmpty());

        // delete
        ArrayListObj.delete(1);

        // list all
        for(int i=0;i<ArrayListObj.size();i++){
            System.out.print(ArrayListObj.get(i)+"\n");
        }
        // deleteAll
        ArrayListObj.deleteAll();

        // after delete all
        for(int i=0;i<ArrayListObj.size();i++){
            System.out.print(ArrayListObj.get(i)+"\n");
        }
    }
}