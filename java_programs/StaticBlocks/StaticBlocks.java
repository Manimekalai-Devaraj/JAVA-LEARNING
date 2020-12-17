public class StaticBlocks {
    /** This file cover static block */
    static String Name;
    static int Age;
    static String Designation;

    public char Intial = 'D';
    static{
        Name = "Manimekalai Devraj";
        Age = 24;
        Designation = "Software Engineer";

        // throws an error because non static variables
        // Intial = 'D';
    }

    //Can have multiple static block
    static{
        Age = 25;
    }

    // Static variables can be accessed directly in static method
    static void displayValues(){
        System.out.println("Inside static method Value of Name: "+Name);
        System.out.println("Inside static method Value of Age: "+Age);
    }
    // Access static methods directly in non static method
    public void displayDetails(){
        System.out.println("Call static method directly from non-static method: ");
        displayValues();
    }
    public static void main(String args[])
   {
       
        // can access static variables without creating the objects
      System.out.println("Value of Name: "+Name);
      System.out.println("Value of Age: "+Age);
      System.out.println("Value of Designation: "+Designation);
      
      // Access static methods directly in non static method and static method
      displayValues();

      // Static variable can have only one references if we create more than 1 object for a class
      StaticBlocks obj1 = new StaticBlocks();
      StaticBlocks obj2 = new StaticBlocks();

      // try to set values more than one time using multiple objects
      obj1.Intial = 'S';
      obj1.Name = "Mekala";

      obj2.Intial = 'M';
      obj2.Name = "Rajuuu";

      System.out.println("Value of Initial by using obj1 : "+obj1.Intial);
      System.out.println("Value of Initial by using obj2 : "+obj2.Intial);

      // static variable will have only one references if we create more objects for the class
      System.out.println("Value of Name using obj2: "+obj2.Name); // prints same
      System.out.println("Value of Name using obj1: "+obj1.Name);// prints same

      obj2.displayDetails();
   }

}
