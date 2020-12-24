import java.util.List;
public class FlowControls {
    public static void main(String[] args){
        System.out.println("------ If/else statement ---------");
        String Name = "Manimekalai";
        double AnnualIncome = 6000000;
        if(AnnualIncome <= 250000){
            System.out.println(Name + " is not eligible for tax.");
        }else if(AnnualIncome <= 500000){
            System.out.println(Name + " have to pay 5% tax also tax rebate applicable.");
        }else if(AnnualIncome <= 750000){
            System.out.println(Name + " have to pay 10% tax.");
        } else if(AnnualIncome > 1500000){
            System.out.println(Name + " have to pay 30% tax");
            if(AnnualIncome > 5000000){
                System.out.println(Name + " is applicable for 10% Surcharge");
            } else if(AnnualIncome > 1000000){
                System.out.println(Name + " is applicable for 15% Surcharge");
            }
        }

        System.out.println("------ Switch statement ---------");
        String controlStatement = "while";
        switch(controlStatement){
            case "for":
                System.out.println("Inside for block: ");
                break;
            case "for-each":
                System.out.println("Inside for-each block: ");
                break;
            case "while":
                System.out.println("Inside while block: ");
                break;
            case "do=while":
                System.out.println("Inside do-while block: ");
                break;
            default:
                System.out.println("Inside default statement: ");
                break;
        };

        System.out.println("------ While loop ---------");
        int i = 0; int j = 20;
        while(i < j){
            // execute when condition returns truee
            System.out.println("While loop: "+i);
            i++;
        }

        System.out.println("------ Do While loop ---------");
        int k = 0;
        do {
            // executes at-least once
          System.out.println("Do while loop: "+k);
          k++;
        }
        while (k < 5);

        System.out.println("------ Break/continue ---------");
        for(int l = 0;l<10;++l){
            if(l==9){
              System.out.println("break the loop: "+l);
              break;
            }else{
              System.out.println("continue the loop: "+l);
              continue;
            }
        }

        System.out.println("------ For loop ---------");

        String[] testArray = {"Test1", "Test2", "Test3", "Test3"};

        int a[]=new int[5];//declaration and instantiation
        a[0] = 10;

        // types of array declarations
        // String []testArray = {"Test1", "Test2", "Test3", "Test3"};
        // String testArray[] = {"Test1", "Test2", "Test3", "Test3"};

        for(int l = 0; l<testArray.length; ++l){
            // iterate with index
            System.out.println("Traditional for : "+l+" "+testArray[l]);
        }

        for(String s: testArray){
            // iterate with each statement cannot start with intermediate always 1st to last
            System.out.println("Enhanced for loop: "+s);
        }
    }
}
