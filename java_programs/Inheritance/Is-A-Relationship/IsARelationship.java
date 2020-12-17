class Creatures {
    /** This file covers Inheritance Is-A-Relationship */
    public String Name;
    public String Colour;
    public final String Type = "Creatures";
    public void DisplayDetails(String name,String colour){
        System.out.println("Name= "+name);
        System.out.println("Colour= "+colour);
    }
}
interface Food{
    public void TypesOfFoodsTaken(String foods);
}

interface LifeStyle{
    public String LifeStyleDetails(String lifeStyle);
}

class Manimekalai extends Creatures implements Food,LifeStyle{
    public void EducationDetails(String Education){
        System.out.println("Education Details= "+Education);
    }
    public void TypesOfFoodsTaken(String foods){
        System.out.println("TypesOfFoodsTaken Details= "+foods);
    }
    public String LifeStyleDetails(String liftStyle){
        return liftStyle;
    }
}

public class IsARelationship{
    public static void main(String[] args){
        Manimekalai obj = new Manimekalai();
        obj.DisplayDetails("Manimekalai", "Black");
        obj.EducationDetails("BE CSE");
        obj.TypesOfFoodsTaken("Meat");
        System.out.println("Types= "+obj.Type);
        System.out.println("LifeStyleDetails= "+obj.LifeStyleDetails("Living in home"));
    }
}
