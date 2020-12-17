class TestEncapsulationClass{
    public static void main(String[] args){
        EncapsulationClass encapObj = new EncapsulationClass();
        // set values for private mmebers 
        encapObj.setConstructionsName("AAA Constructions");
        encapObj.setDailyWages(450);
        encapObj.setExpectedManPower(45);
        // get the or process the private member
        System.out.println("Call getConstructionsName() :"+encapObj.getConstructionsName());
        System.out.println("Call getDailyWages() :"+encapObj.getDailyWages());
        System.out.println("Call getExpectedManPower() :"+encapObj.getExpectedManPower());
    }
}