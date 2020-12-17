public class Bus extends Vehicle {
    // define absctract method
    double VehicleManifactoring(double Days, double Wages){
        return  Days * Wages;
    }
    public static void main(String[] args){
        Bus busObj = new Bus();
        System.out.println("Access abstract method: "+busObj.VehicleManifactoring(12,300));
        System.out.println("Access normal method: "+busObj.ServiceCost());
        System.out.println("Access normal method: "+busObj.ServiceNumber());
        System.out.println("Access Member variables in abstract class: "+busObj.VehicleNumber);
        System.out.println("Access Member variables in abstract class: "+busObj.VehicleColour);
        // System.out.println("Trying to access private member variables from abstract class: "+busObj.VehicleName); // throws an error because its declared as private
        // System.out.println("Trying to access private method from abstract class: "+busObj.ServiceIssueNumber()); 
    }
}
