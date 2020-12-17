public class Methods {
    // In this file we covers method pass by values and pass by reference
    double data = 50;  
    double percentage = 10;
    void changeValues(double Number){  
        data = Number + 100; //changes will be in the local variable only  
    }  
    void changeValuesByRefrences(Methods obj){
        data = obj.data * obj.percentage; // changes will be happen globally
    } 
    public static void main(String args[]){  
        Methods op = new Methods();  

        System.out.println("before change "+op.data);  
        op.changeValues(500.0);  
        System.out.println("after change "+op.data);  


        System.out.println("before change "+op.data);  
        op.changeValuesByRefrences(op);  
        System.out.println("after change "+op.data);  
    }  
}
