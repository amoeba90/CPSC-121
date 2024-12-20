public class MilesToKilometers {
    
    public static void main(String[] args) {
        // Constant Declarations
        final double CONVERSION_FACTOR;
        // Variables Declarations
        double miles, kilometers;

        // Assignments
        CONVERSION_FACTOR = 1.60935;
        miles = 30;
        kilometers = miles * CONVERSION_FACTOR;

        System.out.println("Distance in Miles: " + miles);
        System.out.println("Distance in Kilometers: " + kilometers);
    }
}
