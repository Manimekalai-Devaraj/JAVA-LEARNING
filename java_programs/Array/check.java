import java.util.Arrays;
public class check {
    // Java program to illustrate copyof method 
        public static void main(String[] args) {
        // initializing an array original 
        int[] org = new int[] {1, 2 ,3}; 
  
        System.out.println("Original Array "+org.length); 
        for (int i = 0; i < org.length; i++) 
            System.out.print(org[i] + " "); 
  
        // copying array org to org 
        org = Arrays.copyOf(org, 5); 
  
        // Changing some elements of org 
        org[3] = 11; 
        org[4] = 55; 
  
        System.out.println("\nNew array org after modifications: "+org.length); 
        for (int i = 0; i < org.length; i++) 
            System.out.print(org[i] + " "); 
    } 
}
