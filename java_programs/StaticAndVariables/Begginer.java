// package java_programs;
/**
 * This class covers Static keyword,
 * Local/Class/Instance variables
 * Methods with variable argument list
 */
public class Begginer {
    // Class or Static variables
    // salary  variable is a private static variable
    private static double salary = 10000;
    // Department is a constant with final keyword cannot change the values similar to constants
    final static String Department = "Development ";
    public static String Designation = "Software Developer ";
    public static final String SECTION = "Software Developer ";
    private static int Age;

    // Instance variables
    public String Name;
    public Begginer(String empName){
        Name = empName;
    }
    // Static method
    static String staticMethod(String FirstName, String LastName) {
      System.out.println("Static methods can be called without creating objects");
      // Local variable
      String FullName = FirstName+ ' ' + LastName;
      return FullName;
    }
  
    // Public method
    public int publicMethod(int x, int y) {
      System.out.println("Public methods must be called by creating objects");
      return x * y;
    }
  
    // Main method
    public static void main(String[ ] args) {
        System.out.println(staticMethod("Mani","Devaraj"));

        Begginer myObj = new Begginer("Radhika");
        System.out.println(myObj.publicMethod(10,10));

        System.out.println("Access private static variables by using class name: "+Begginer.salary);
        Begginer.salary = 200;
        System.out.println("Access private static variables after update: "+Begginer.salary);

        //Begginer.Department = "ADMINISTRATION"; // This will throw error we cannot update final variable value
        System.out.println("Access constant variables: "+Begginer.Department);

        Begginer.Designation = "Sofware Engineer";
        System.out.println("Access class variables (public static) after update: "+Begginer.Designation);

        Begginer.Age = 24;
        System.out.println("Access class variables and after values updated : "+Begginer.Age);
        System.out.println("Access class variables (public static final) : "+Begginer.SECTION);

        System.out.println("Access instance variable: "+myObj.Name);

        // System.out.println("Trying to access local variable: "+ FullName); // Will throw error

    }
  }