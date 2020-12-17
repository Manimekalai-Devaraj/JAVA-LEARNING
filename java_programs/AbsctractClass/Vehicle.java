public abstract class Vehicle {
    private String VehicleName = "Car"; // It will not useful because private
    public String VehicleNumber = "TN38 AZ0560";
    protected String VehicleColour ="H-I20";

    public double ServiceCost(){
        return 1112.00;
    }

    protected int ServiceNumber(){
        return 1234;
    }

    private String ServiceIssueNumber(){ // It will not useful because private
        return "SEV1234";
    }
    abstract double VehicleManifactoring(double NoOfDays, double DailyWages);
}
