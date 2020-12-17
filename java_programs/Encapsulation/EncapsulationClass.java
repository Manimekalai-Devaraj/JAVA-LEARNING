public class EncapsulationClass {
    /** This files covers encapsulation */
    private double ExpectedManPower;
    private String ConstructionsName;
    private Double DailyWages;

    // setter methods
    public void setExpectedManPower(double ManPower){
        ExpectedManPower = ManPower;
    }
    public void setConstructionsName(String Name){
        ConstructionsName = Name;
    }
    public void setDailyWages(double Wages){
        DailyWages = Wages;
    }
    // getter methods
    public double getExpectedManPower(){
        return ExpectedManPower * DailyWages;
    }
    public String getConstructionsName(){
        return ConstructionsName;
    }
    public double getDailyWages(){
        return DailyWages;
    }
}