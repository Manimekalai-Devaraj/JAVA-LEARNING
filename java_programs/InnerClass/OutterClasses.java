public class OutterClasses {
    // Inner classes are nested class which is class inside a class.
    //It can access all members of outside class
    // Can do code optimization
    // Can develop more readable and maintainable code because can we group the class logically inside class and interface
    private String EmployeeId = "IKOJ89";
    public String Name = "Manimekalai";
    private static String Department = "CSE";

    void callOuterClassmethod(){
        System.out.println("Call outer class method from inner class");
        // local inner class
        class localInnerClass{
            void display(){
                System.out.println("Call local inner class method method");
            }
        }
        localInnerClass localObj = new localInnerClass();
        localObj.display();
    }
    class innerClass{
        public void EmployeeDetails(){
            System.out.println("My name is "+Name);
            System.out.println("My EmployeeId is "+EmployeeId);
            callOuterClassmethod();
        }
    }

    private class innerClass2{
        public void EmployeeDetails(){
            System.out.println("My name is "+Name);
            System.out.println("My EmployeeId is "+EmployeeId);
        }
    }

    static class innerClass3{
        public void EmployeeDetails(){
            System.out.println("My department is "+Department);
        }
    }

    public static void main(String[] args){
        OutterClasses outerObj = new OutterClasses();
        OutterClasses.innerClass innerObj = outerObj.new innerClass();
        innerObj.EmployeeDetails();
        
        // access private inner class directly throws an error
        // innerClass2 innerObj2 = new innerClass2();
        // innerObj2.EmployeeDetails();

        // access static inner class
        innerClass3 innerObj3 = new innerClass3();
        innerObj3.EmployeeDetails();
    }
}
