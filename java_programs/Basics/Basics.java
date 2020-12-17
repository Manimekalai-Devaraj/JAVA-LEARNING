import java.util.Arrays;
public class Basics {
    public static void main(String[] args){
      System.out.println("Execution started..");

      // Variable types
      String Name = "Manimekalai";
      int Age = 24;
      float Salary = 100;
      char Initial = 'D';
      Boolean IsRegularEmployee = true;
      System.out.println(Name);
      System.out.println(Initial);
      System.out.println(Age);
      System.out.println(Salary);
      System.out.println(IsRegularEmployee);

      // array
      String[] test = {"Test1", "Test2", "Test3", "Test3"};
      System.out.println("Array "+Arrays.toString(test));

      int[][] twoDimension = { {1, 2, 3, 4}, {5, 6, 7} };
      for (int i = 0; i < twoDimension.length; ++i) {
        for(int j = 0; j < twoDimension[i].length; ++j) {
          System.out.println("twoDimension: "+twoDimension[i][j]);
        }
      }

      // Type casting
      int testInt = 9;
      double testDouble = testInt;
      System.out.println("Type casting "+testInt); 
      System.out.println("Type casting "+testDouble); 
      System.out.println("Type casting "+(int)testDouble);

      // Operators
      int Test1 = 40;
      int Test2 = 20;
      System.out.println("Operators "+(Test1+Test2));
      System.out.println("Operators "+(Test1/Test2));
      System.out.println("Operators "+(Test1-Test2));

      // Strings
      String str = "QWERTYUIOPASDFGHJKLZXCVBNM";
      System.out.println("The length of the string: " + str.length());
      System.out.println("The length of the string: " + str.indexOf("H"));
      System.out.println("The length of the string: " + str.toUpperCase());
      System.out.println("The length of the string: " + str.toLowerCase());

      // Math functionalities
      System.out.println("Min is " + Math.min(Test1,Test2));
      System.out.println("Max is " + Math.max(Test1,Test2));
      System.out.println("Square root is"  + Math.sqrt(Test1));
      System.out.println("Positive values is " + Math.abs(-10.9));
      System.out.println("Random"+Math.random());

      //Booleans
      System.out.println("Booleans "+(Test1 > Test2));
      System.out.println("Booleans "+(Test2 > Test1));

      // loops
      String loopType = "for";
      switch(loopType){
        case "for":
          for(int i = 0;i<10;++i){
            if(i==9){
              System.out.println("break: "+i);
              break;
            }else{
              System.out.println("continue: "+i);
              continue;
            }
          }
          break;
        case "for=each":
          for (String i : test) {
            System.out.println(i);
          }
          break;
        case "while":
          int i = 0;
          while(i < Test2){
            System.out.println("While loop: "+i);
            i++;
          }
          break;
        case "do=while":
          int j = 0;
          do{
            j++;
            System.out.println("Execution of do while: "+j);
          }
          while(j < Test2);{
            System.out.println("End of do while: "+j);
          }
          break;
        default:
          System.out.println("Default statement: ");
          break;
      };
      Basics BasicsObj = new Basics();
      // methods overloading
      System.out.println(BasicsObj.firstCheck("Mani"));
      System.out.println(firstCheck(24));
      System.out.println(firstCheck(1000.90));
      // Method with variable arguments
      int result = Add(10);
      System.out.println(result);
    }
    // method overloading
     String firstCheck(String Name) {
      System.out.println("Just try!"+Name);
      return Name;
    }
    static int firstCheck(int Age) {
      System.out.println("Just try! "+Age);
      return Age;
    }
    static double firstCheck(Double Salary) {
      System.out.println("Just try! "+Salary);
      return Salary;
    }
    public static int Add(int k) {
      if (k > 0) {
        return k + Add(k - 1);
      } else {
        return 0;
      }
    }
  }
  