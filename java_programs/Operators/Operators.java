public class Operators {
    public static void main(String[] args){
        
        /** Assignment operator **/
        int variable1 = 4;
        int variable2;
        System.out.println("------ Assignment operator ---------");
        // assign value using =
        variable2 = variable1;
        System.out.println("variable2 value using =: " + variable2);

        // assign value using +=
        variable2 += variable1;
        System.out.println("variable2 value using +=: " + variable2);

        // assign value using *=
        variable2 *= variable1;
        System.out.println("variable2 value using *=: " + variable2);

        // assign value using -=
        variable2 -= variable1;
        System.out.println("variable2 value using -=: " + variable2);

        // assign value using /=
        variable2 /= variable1;
        System.out.println("variable2 value using /=: " + variable2);


        /** Relational operator */
        System.out.println("------ Relational operator ---------");
        int Test1 = 10;
        int Test2 = 12;
        System.out.println("Is Equal To ==: " + (Test1 == Test2));
        System.out.println("Not Equal To !=: " + (Test1 != Test2));
        System.out.println("Greater Than >: " + (Test1 > Test2));
        System.out.println("Less Than <: " + (Test1 < Test2));
        System.out.println("Less Than or equal to <=: " + (Test1 <= Test2));
        System.out.println("Greater Than or equal to >=: " + (Test1 >= Test2));


        /** Logical Operator */
        System.out.println("------ Logical Operator ---------");
        int value1 = 5;
        int value2 = 3;
        int value3 = 8;

        // && operator
        System.out.println("AND operator "+((value1 > value2) && (value3 > value1)));  // true
        System.out.println("AND operator "+((value1 > value2) && (value3 < value1)));  // false

        // || operator
        System.out.println("OR operator "+((value1 < value2) || (value3 > value1)));  // true
        System.out.println("OR operator "+((value1 > value2) || (value3 < value1)));  // true
        System.out.println("OR operator "+((value1 < value2) || (value3 < value1)));  // false

        // ! operator
        System.out.println("NOT operator "+(!(value1 == value2)));  // true
        System.out.println("NOT operator "+(!(value1 > value2)));  // false


        System.out.println("------ Arithmetic Operator ---------");
        double a = 100;
        int b = 15;
        double c = 10.3;
        // addition operator
        System.out.println("a + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modulo operator
        System.out.println("a % b = " + (a % c));

        System.out.println("------ Increment/Decrement Operator ---------");

        int var1 = 5;
        int var2 = 6;
        System.out.println("Increment operator prefix: "+ (++var1)); // value will be 5 and 1 will be incremented so now its 6
        System.out.println("Increment operator postfix: "+ (var2++)); // value will be 6 after that 1 will be incremented 
        System.out.println("Increment After postfix value will be: "+ var2); // value will be 7
        System.out.println("Decrement operator prefix: "+ (--var1)); // value will be 6 and 1 will be decremented so now its 5
        System.out.println("Decrement operator postfix: "+ (var2--)); // value will be 7 after that 1 will be decremented
        System.out.println("Decrement After postfix value will be: "+ var2); // value will be 6 

        System.out.println("------ Conditional Operator ---------");

        int val1 = 100;
        int val2 = 55;
        int val3 = 160;
        // nested conditional operators
        String result = val1 > val2 ? ((val1 > val3) ? "Success" : "Failure") : "Failure";
        System.out.println("Conditional operator response: "+ result);
    }
}
