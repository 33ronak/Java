public class Main {
    public static void main(String[] args) {

        // Integer data type is generally used for numeric value
        // The most common ones are:
        // byte     1 byte
        // short    2 byte
        // int      4 byte
        // long     8 byte
        byte byteNum = 50;
        short smallNum = 32750;
        int num = 83500;
        long largeNum = 959497505 ;


        // Floating point number //
        // float    4 bytes: for float use 'f' as suffix as standard
        // double   8 bytes: by default fraction value by default fraction value
        float floatNum = 4.7333434f;
        double decNum = 4.355453532;


        // Creating and initializing custom character
        char firstInitial = 'A';


        // string stores a series of characters
        String name = "Arnab" ;


        // boolean represents only 1 bit of information either as true or false
        boolean TrueOrFalse = true ;


        System.out.println("integer:" + num);
        System.out.println("byte:   " + byteNum);
        System.out.println("short:  " + smallNum);
        System.out.println("long:   " + largeNum);
        System.out.println("float:  " + floatNum);
        System.out.println("double: " + decNum);
        System.out.println("char:   " + firstInitial);
        System.out.println("string: " + name);
        System.out.println(TrueOrFalse);


    }
}