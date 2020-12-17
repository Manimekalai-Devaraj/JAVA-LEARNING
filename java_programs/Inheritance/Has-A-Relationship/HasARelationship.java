class Home{
    private int NoOfDoors;
    private int NoOfWindows;
    public void setDoorsWindows(int door,int windows){
        this.NoOfDoors = door;
        this.NoOfWindows = windows;
    }
    public void getHomeDetails(){
        System.out.println("homeDetails");
        System.out.println("DoorDetails:= "+NoOfDoors);
        System.out.println("WindowDetails:= "+NoOfWindows);
    }
}

class HomeProperties{
    public double BuildingCost(double amount){
        return amount;
    }
}
class RoofHouse extends Home{
    private String Type;
    public void setHomeType(String type){
        this.Type = type;
    }
    public void getHomeType(){
        System.out.println("Building type: "+ Type);
        // here we can achieve composition (Has-A-relationship)
        HomeProperties hObj = new HomeProperties();
        System.out.println("Building cost: "+hObj.BuildingCost(2000000));
    }
}
public class HasARelationship {
    public static void main(String[] args){
        RoofHouse rObj = new RoofHouse();
        rObj.setDoorsWindows(2,7);
        rObj.setHomeType("Duplex");
        rObj.getHomeDetails();
        rObj.getHomeType();
    }   
}
