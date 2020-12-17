public class TestDynamicPolymorphism {
    public static void main(String[] args) 
    { 
        DynamicPolymorphism MainObj = new DynamicPolymorphism();  // Create a Animal object
        DynamicPolymorphism DevObj = new Development();  // Create a Pig object
        DynamicPolymorphism TestObj = new UniTesting();  // Create a Dog object
        
        System.out.println("call base class method definition: "+MainObj.CalculateWages(10.00,400.00,0.0,0.0));
        System.out.println("call development class method definition: "+DevObj.CalculateWages(20.00,350.00,100.00,0.0));
        System.out.println("call unit testing class method definition: "+TestObj.CalculateWages(30.00,300.00,170.00,40.00));
    }
}
