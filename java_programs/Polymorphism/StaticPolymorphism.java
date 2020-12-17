import java.time.Year;

public class StaticPolymorphism {
    // This file covers static polymorphism that is method overloading
    // Same method will do different actions
    public int CalculateNoOfDaysInYear(int Year){
        System.out.println("Inside function: 1");
        boolean IsLeapYear = false;
        if(Year%4 == 0){
            if(Year%100 == 0){
                if(Year%400 == 0){
                    IsLeapYear = true;
                }
            }else{
                IsLeapYear = true;
            }
        }else{
            IsLeapYear = false;
        }
        return (IsLeapYear ? 366 : 365);
    }

    public double CalculateNoOfDaysInYear(int Year,boolean IsLeapYear){
        System.out.println("Inside function: 2");
        return (IsLeapYear ? 366.00 : 365.00);
    }
    public static void main(String[] args){
        StaticPolymorphism obj = new StaticPolymorphism();
        System.out.println("Call 1st method: "+obj.CalculateNoOfDaysInYear(2020));
        System.out.println("Call 2nd method: "+obj.CalculateNoOfDaysInYear(2002,false));
    }
}
