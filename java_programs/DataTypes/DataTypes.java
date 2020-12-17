import javax.print.DocFlavor.STRING;
public class DataTypes {
    public static void main(String[] args){
        // Primitive data types
        byte myByteNumber = -100; // -128 and 127
        short myShortNumber = -5000; // -32768 to 32767
        int myIntNumber = 100000; // 2147483648 to 2147483647
        boolean myBoolean = true; // either true or false
        boolean myBooleanValue = false;
        char myCharValue = 'B'; // single character with single quotes
        long myLongNumber = 9000000000000000000L; // -9223372036854775808 to 9223372036854775807
        double myDoubleValue = 12.90d; // precision 6-7 after decimal point
        float myFloatValue = 12.100000000000000f; // precision upto 15 digits

        // will throw error
        byte myByteErrNumber = -1000; 
        short myShortErrNumber = -50000; 
        int myIntErrNumber = 10000000000; 
        boolean myBooleanErrValue = "falses";
        char myCharErrValue = 'Bs';
    }
}
