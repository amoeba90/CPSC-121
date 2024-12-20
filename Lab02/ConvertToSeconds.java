import java.util.Scanner;

public class ConvertToSeconds {
    public static void main(String[] args) {
        //Declarations
        Scanner keyboard;
        int hours, minutes, seconds, totalSeconds;
        final int SECONDS_IN_MIN, MIN_IN_HOUR;
        
        //Variables
        SECONDS_IN_MIN = 60;
        MIN_IN_HOUR = 60;
        keyboard = new Scanner(System.in);

        //prompt user to enter number of hours, reminding user number should be greater than or equal to zero 
        System.out.println("Please enter # of hours (at least 0): ");
        hours = keyboard.nextInt();
        //prompt user to enter number of min, reminding them number should be between 0 and 60 
        System.out.println("Please enter # of minutes (0-60): ");
        minutes = keyboard.nextInt();
        //prompt user to enter number of seconds, reminding them number should be between 0 and 60 
        System.out.println("Please enter # of seconds (0-60): ");
        seconds = keyboard.nextInt();
       
        //using values in variables and constants calculate total number of seconds and return result ot totalSeconds
        totalSeconds = (((hours*MIN_IN_HOUR) + minutes) * SECONDS_IN_MIN) + seconds;

        //print out number of hours/min/seconds entered and seconds calculated
        System.out.println("Hours Entered: " + hours);
        System.out.println("Minutes Entered: " + minutes);
        System.out.println("Seconds Entered: " + seconds);
        System.out.println("Total Number of Seconds Calculated: " + totalSeconds);
        
    }
}