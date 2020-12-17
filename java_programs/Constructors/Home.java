/**
 * This file will cover constructors,
 * constructors overloading
 * Call constructors inside constructors
 * No arg, arg and default constructors
 */
public class Home {
    private String HomeAddress ="";
    private String HomePaintColor = "";
    public Home(){
        System.out.println("Inside default constructor: ");
    }
    public Home(String Address){
        this.HomeAddress = Address;
        System.out.println("Inside one argument constructor: "+HomeAddress);
    }
    public Home(String PaintColor,String Address){
        this("112/3 Gandhi Nagar"); // Call a constructor inside a constructor
        this.HomePaintColor = PaintColor;
        this.HomeAddress = Address;
        System.out.println("Inside two argument constructor: "+HomeAddress+" "+HomePaintColor);
    }
    public static void main(String[] args){

        class Kitchan extends Home{
            private String KitchanType = "";
            public Kitchan(String Type){
                super("Pink with Green colour","West Covai saibaba Colony"); // Call super class constructor
                this.KitchanType = Type;
                System.out.println("Inside child class constructor: "+KitchanType);
            }
        }

        
        Home homeObj = new Home(); // If no constructor defined then java complier itself default constructor will be created
        Home addressObj = new Home("4 42 Nehru Street"); // If no constructor defined then java complier itself default constructor will be created
        Home addressAndColourObj = new Home("While with yellow","4 42 Nehru Street"); // If no constructor defined then java complier itself default constructor will be created
        Kitchan kitchanObj = new Kitchan("Remote Kitchan");
    }
}

