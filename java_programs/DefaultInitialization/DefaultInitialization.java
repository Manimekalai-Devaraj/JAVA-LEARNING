public class DefaultInitialization {
    int number;         // number will have default value: 0
    float ratio;        // default value: 0.0
    boolean success;    // default value: false
    double percentage;  // default value: 0.0
    String name;        // default: null
    Object obj;         // default: null
    String[] names;     // default is null
    char initial;     // u0000 - min value of char

    private String FirstName;
    public int Age;
    public void print() {
        int methodVariable;
        System.out.println("number = " + number);
        System.out.println("ratio = " + ratio);
        System.out.println("success = " + success);
        System.out.println("name = " + name);
        System.out.println("obj = " + obj);
        System.out.println("percentage = " + percentage);
        System.out.println("FirstName = " + FirstName);
        System.out.println("names = " + names);
        System.out.println("Age = " + Age);
        System.out.println("initial = " + initial);

        // throws error because not initialized
        // System.out.println("methodVariable = " + methodVariable);
    }
 
    public static void main(String[] args) {
        new DefaultInitialization().print();

        DefaultInitialization obj = new DefaultInitialization();  // both are same
        obj.print();
    }
}
