public class DynamicPolymorphism {
    public double CalculateWages(double ManPower, double DailyWages,double AdditionalWages,double Breakage){
        return ManPower * DailyWages;
    }
}

class Development extends DynamicPolymorphism{
    public double CalculateWages(double ManPower, double DailyWages,double AdditionalWages,double Breakage){
        return ManPower * (DailyWages+AdditionalWages);
    }
}

class UniTesting extends DynamicPolymorphism{
    public double CalculateWages(double ManPower, double DailyWages,double AdditionalWages,double Breakage){
        return ManPower * (DailyWages + AdditionalWages - Breakage);
    }
}