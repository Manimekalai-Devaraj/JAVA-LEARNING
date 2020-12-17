public class TypeCasting {
    // Type casting
    public int testInt = 9;
    public double testDouble = testInt; // Automatic type casting
    
    public static void main(String[] args){
        TypeCasting obj = new TypeCasting();
        System.out.println("Type casting "+obj.testInt); 
        System.out.println("After automatic Type casting "+obj.testDouble); 
        System.out.println("Force Type casting "+(int)obj.testDouble); // Manual or force type casting
    }
     
}
