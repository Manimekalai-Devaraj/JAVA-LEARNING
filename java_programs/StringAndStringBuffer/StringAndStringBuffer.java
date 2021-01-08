import java.util.jar.Attributes.Name;

public class StringAndStringBuffer {
        // Performance test string and string buffer
        public static String concatWithString()    {  
            String t = "Java";  
            for (int i=0; i<1000; i++){  
                t = t + "Tpoint";  
            }  
            return t;  
        }  
        public static String concatWithStringBuffer(){  
            StringBuffer sb = new StringBuffer("Java");  
            for (int i=0; i<1000; i++){  
                sb.append("Tpoint");  
            }  
            return sb.toString();  
        }  
        public static void main(String[] args){  
            long startTime = System.currentTimeMillis();  
            concatWithString();  
            System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
            startTime = System.currentTimeMillis();  
            concatWithStringBuffer();  
            System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  

            String TestString1 = "Manimekalai Devaraj";
            StringBuffer TestString2 = new StringBuffer("Manimekalai Devaraj");
            System.out.println(TestString1);
            System.out.println(TestString2);

            // StringBuffer methods
            TestString2.append(" is from Erode.");
            System.out.println("SBR append() method "+TestString2);

            TestString2.insert(10," Java ");//now original string is changed from 10 th position 
            System.out.println("SBR insert() method "+TestString2);

            TestString2.replace(1,3,"Java");  
            System.out.println("SBR replace() method "+TestString2);

            StringBuffer TestString3 = new StringBuffer("ABCDEFGH");  
            TestString3.delete(1,4);  
            System.out.println("SBR delete() method "+TestString3);//prints EFGH  

            TestString3.reverse();  
            System.out.println("SBR reverse() method "+TestString3);//prints HGFE
            
            
            // String methods
            String Name = "D.Manimekalai";
            char Initial = Name.charAt(0); //returns the char value at the 0th index  
            System.out.println("String charAt() "+Initial); 
            
            String Name2 = "D.Manimekalai";
            System.out.println("String compareTo() "+Name2.compareTo(Name)); //0 because both are equal  

            String About = Name2.concat("is new to Java Programming language");  
            String About2 = Name2.join("-","Java is new to Java Programming language","for Me");  
            System.out.println("String concat() "+About); 
            System.out.println("String join() "+About2); 

            String name="what do you know about java";  
            System.out.println("String contains() "+name.contains("jadfdfdfva"));  // return either true or false

            System.out.println("String isEmpty() "+name.isEmpty());  // return either true or false 

            String s2 = " java";  
            String s3 = "JAVA";  
            System.out.println("String equalsIgnoreCase() "+s2.equalsIgnoreCase(s3));//true because case is ignored  
            
            String s1="  hello string   ";  
            System.out.println(s1+"javatpoint");//without trim()  
            System.out.println("String trim()"+s1.trim()+"javatpoint");//with trim()  

            
            String s4 = "hello";  
            char[] ch=s4.toCharArray();  
            for(int i=0;i<ch.length;i++){  
                System.out.print("String toCharArray() "+ch[i]);  
            } 

            System.out.println("\nString substring() "+name.substring(2,9));//returns va  

            System.out.println("\nString startsWith() "+s3.startsWith("JAVA"));
            // toUpperCase(), toLowerCase(), trim(), split(),replace(), replaceAll()

            String s5="java string split method by javatpoint";  
            String[] words=s5.split(" ");
            for(String w:words){  
                System.out.println("\nString split() "+w);
            } 

            System.out.println("\n String replaceAll "+s5.replaceAll("a","e")); // for characters
            System.out.println("\n String replaceAll "+s5.replaceAll("string","STRING")); // for string
            System.out.println("\n String replaceFirst "+s5.replaceFirst("a","STRING")); // for string
            System.out.println("\n String length "+s5.length()); // for string
            System.out.println("\n String lastIndexOf "+s5.lastIndexOf('t')); // for string
        }  
}
