import java.util.Scanner;

public class ConvertToHours {
    public static void main(String[] args) {
        //Declarations
        Scanner keyboard;
        int hours, minutes, seconds, totalSeconds, remainingSeconds;
        double fractionalHours;
        final int SECONDS_IN_MINUTE, SECONDS_IN_HOUR;

        //Variables
        
        SECONDS_IN_MINUTE = 60;
        SECONDS_IN_HOUR = 3600;

        keyboard = new Scanner(System.in);
        
        System.out.println("Enter Total Seconds (x > 0): ");
        totalSeconds = keyboard.nextInt();

        fractionalHours = (double)totalSeconds / SECONDS_IN_HOUR;
        
        hours = totalSeconds / SECONDS_IN_HOUR;
        remainingSeconds = totalSeconds % SECONDS_IN_HOUR;
        minutes = remainingSeconds / SECONDS_IN_MINUTE;
        seconds = remainingSeconds % SECONDS_IN_MINUTE;

        System.out.println("Total Seconds Entered: " + totalSeconds);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
        System.out.println("Fractional Hours: " + fractionalHours);
    }   
}
