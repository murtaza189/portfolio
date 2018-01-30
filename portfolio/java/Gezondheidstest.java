import java.util.Scanner;

/**
 * 
 */
public class Gezondheidstest {

    // Final values
    public static final int HARTSLAG_LAAG = 50;
    public static final int HARTSLAG_HOOG = 90;
    public static final double TEMP_LAAG = 36.3;
    public static final double TEMP_HOOG = 37.5;
    public static final int DRUK_LAAG = 100;
    public static final int DRUK_HOOG = 140;

    // Colors for the output
    // More colors can be found at: http://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        // Declare variables
        double hartslag;
        double temp;
        int druk;


        // Keep looping untill all input succeeds
        while(true) {
            try {
                Scanner input = new Scanner(System.in);

                System.out.println("Wat is je hartslag?");
                hartslag = input.nextDouble();

                System.out.println("Wat is je temperatuur?");
                temp = input.nextDouble();

                System.out.println("Wat is je bovendruk?");
                druk = input.nextInt();

                // All input has succeeded. Break out of the loop
                break;
            }
            catch(Exception e){
                // User put in an invalid value
                // This message is printed in red!                 Reset the color
                System.out.println(ANSI_RED + "Foutieve invoer!" + ANSI_RESET);
            }
        }

        System.out.println();

        // Try to adjust one of the finals
        // e.g. set HARTSLAAG_HOOG to 40 and see what happens!
        try{
            //                                     |<          This is called the one-line if statement (           >|
            System.out.println("Uw hartslag is " + (isTussen(hartslag, HARTSLAG_LAAG, HARTSLAG_HOOG) ? "" : "*niet* ") + "gezond");
            System.out.println("Uw temperatuur is " + (isTussen(temp, TEMP_LAAG, TEMP_HOOG) ? "" : "*niet* ") + "gezond");
            System.out.println("Uw bovendruk is " + (isTussen(druk, DRUK_LAAG, DRUK_HOOG) ? "" : "*niet* ") + "gezond");

            // One line if statement:
            // (statement ? true : false)
            // ( 4 < 6 ? "yes" : "no")

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    // Method to test if a value is between two other values
    public static boolean isTussen(double value, double min, double max) throws Exception {

        // If max is less then min, throw a new error
        if(max < min) throw new Exception("min can't be more then max");

        // If min is more then the value, it is not between min and max
        if(min > value) return false;

        // If max is less then the value, it is not between min and max
        if(max < value) return false;

        // If the code reaches here, the value is between min and max
        return true;
    }

}
