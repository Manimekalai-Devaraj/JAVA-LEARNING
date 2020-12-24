interface ManPower{
    // member variables (By default it will be public static final)
    int EmployeeId =1000042;
    String EmployeeName = "Manimekalai";
    String Designation = "Software Engineer";
    // member functions (by default it will be public abstract method)
    double CalculateManPower(int Worker, double Wages);
    void  BuildingType();


    // we can have the default method in  the interface // from java8 onwards
    default String ManagerName(){
        return EmployeeName;
    }

    /* This is a static method. Static method in interface is
     * similar to default method except that we cannot override 
     * them in the implementation classes.
     * Similar to default methods, we no need to implement these methods
     * in implementation classes so we can safely add them to the 
     * existing interfaces.
     */
    static String DesignationDetails(){
        return Designation;
    }
    // throws error because no method definition allowed
    // public int hours(){}
}

interface Management extends ManPower{ // interface extends another interface
    public double AllocatedManPower(int Worker, double Wages);
}

public class interfaceMainClass implements Management{ // Called multiple inheritance
    public double CalculateManPower(int Worker, double Wages) {
        System.out.println("Some text..");
        return Worker*Wages;
    }
    public double AllocatedManPower(int Worker, double Wages) {
        System.out.println("Some other text...");
        return Worker*Wages;
    }
    public void BuildingType(){
        System.out.println("The building type is duplex");;
    }

    public static void main(String[] args){
        // this will throw compilation error because its an interface cannot able to create object
        // ManPower MP = new ManPower();
        // MP.CalculateManPower(12, 1200);


        interfaceMainClass EMObj = new interfaceMainClass();
        System.out.println("Calling ManPower interface methods: "+EMObj.CalculateManPower(15,350));
        System.out.println("Calling Management interface methods: "+EMObj.AllocatedManPower(12,400));
        EMObj.BuildingType();
        System.out.println("Access interface member variable: "+EMObj.EmployeeId);

        // call static and default methods
        System.out.println("Access interface default methods ManagerName(): "+EMObj.ManagerName());
        System.out.println("Access interface static methods DesignationDetails(): "+ManPower.DesignationDetails());
        // throw an error because cannot able to update final variable values
        // EMObj.EmployeeId = 1000043;
    }
}