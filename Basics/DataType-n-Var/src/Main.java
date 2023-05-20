public class Main {
    public static void main(String[] args) {

        //Printing "Hello world..!"
        System.out.println("Hello world..!");

        // Data Types in Java
        // Most common & basic data types in Java are
        // For integers representation
        // byte     1-byte
        // short    2-byte
        // int      4-byte
        // long     8-byte
        byte ageInYears = 25;
        short ageInDays = 9000;
        int ageInMin = 216000;
        long ageInSec = 777600000;

        // For decimal representation
        // float     4-byte
        // double    8-byte
        float bmi = 24.6F;
        double wgt = 70.85;
        double ht = 170.183;

        // For character & string representation
        // char     2-byte
        // String   non-primitive data type
        String name = "Arnab Choudhury";
        char firstInitials ='A';
        char lastInitials = 'C';

        // boolean data type
        // Stores boolean data
        // boolean      1-bit
        boolean areYouCB = false;

        //Concatenation in scope
        System.out.println("My name is " + name);
        System.out.println("My initials are " + firstInitials + " " + lastInitials + ".");
        System.out.println("I am " + ageInYears + " years or " + ageInDays + " days or " + ageInMin + " minutes or " +
                ageInSec + " seconds old." );
        System.out.println("My weight is " + wgt + " kg, height is " + ht + " cm and bmi is " + bmi + ".");
        System.out.println("Are you colorblind ? " + areYouCB);

    }
}