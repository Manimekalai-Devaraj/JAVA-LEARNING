import java.util.Arrays;
import java.lang.Math;

public class TreeSetExample{
    private Object[] DefinedArray;
    private int CurrentArraySize = 0;

    public TreeSetExample(){
        DefinedArray = new Object[10];
    }

    public void pollFirst(){
        for(int j =0;j< CurrentArraySize;j++){
            // Shifting elements
            DefinedArray[j] = DefinedArray[j+1];
        }
        CurrentArraySize --;
    }

    public void pollLast(){
        DefinedArray[CurrentArraySize] = null;
        CurrentArraySize --;
    }

    public Object first(){
        return DefinedArray[0];
    }
    public Object last(){
        return DefinedArray[CurrentArraySize-1];
    }

    public void add(Object obj){
        // Dynamically increase the array size if the array is filled half of its size like if size 8, 
        // if it is filled beyond 4 (5,6,7,8) then increase the size

        // 8 - 5 <= ((8/2) = 4)  
        // so 3 <= 4 increase   the size
        if(DefinedArray.length - CurrentArraySize <= Math.ceil(DefinedArray.length/2)){
            increaseListSize(DefinedArray.length);
        }
        if(CurrentArraySize != 0){
            for(int i=0; i <= CurrentArraySize;i++){
                if(DefinedArray[i] == obj){
                    // Do not add if already exists
                    break;
                }
            }
            if(obj != null){ // Should not allow null
                DefinedArray[CurrentArraySize++] = obj;
            }
        }else{
            if(obj != null){  // Should not allow null
                DefinedArray[CurrentArraySize++] = obj;
            }
        }
    }

    public void remove(Object obj){
        for(int i=0; i< CurrentArraySize ; i++){
            if(DefinedArray[i] == obj){
                for(int j =i;j< CurrentArraySize;j++){
                    // Shifting elements
                    DefinedArray[j] = DefinedArray[j+1];
                }
            }
        }
        CurrentArraySize --;
    }
    public void clear(){
        DefinedArray = new Object[DefinedArray.length];
        CurrentArraySize = 0;
    }

    public boolean isEmpty(){
        return CurrentArraySize == 0 ? true : false;
    }

    public boolean contains(Object obj){
        for(int i=0; i< CurrentArraySize ; i++){
            if(DefinedArray[i] == obj){
                return true;
            }
        }
        return false;
    }

    private void increaseListSize(int size){
        // increase by its own length size that is if array allocated size 10 then increase it into 20
        DefinedArray = Arrays.copyOf(DefinedArray, size);
    }
    public static void main(String[] args){
        TreeSetExample treeSet1 = new TreeSetExample();
        // add()
        treeSet1.add("Bus");
        treeSet1.add("Bus");
        treeSet1.add("Skype");
        treeSet1.add("Zoom");
        treeSet1.add("GMeet");
        treeSet1.add("Skype");

        // get
        System.out.println("First element "+treeSet1.first());
        System.out.println("Last element "+treeSet1.last());

        // contains()
        System.out.println("contains() "+treeSet1.contains("Skype"));
        System.out.println("contains() "+treeSet1.contains("Hi"));

        // remove
        treeSet1.remove("Skype");
        treeSet1.pollFirst();
        treeSet1.pollLast();
        treeSet1.clear();

        // isEmpty()
        System.out.println("Check isEmpty() "+treeSet1.isEmpty());
    }
}
