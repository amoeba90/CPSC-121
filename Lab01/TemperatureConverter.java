public class TemperatureConverter {
	
	public static void main(String[] args) {
		// Constant Declarations
		final int BASE;
		final double CONVERSION_FACTOR;
		// Variable Declarations
		double fahrenheitTemp;
		double celsiusTemp;

		// Assignments
		BASE = 32;
		CONVERSION_FACTOR = 5.0 / 9.0;
		fahrenheitTemp = 98.6;

		celsiusTemp = (fahrenheitTemp - BASE) * CONVERSION_FACTOR;

		System.out.println("Fahrenheit Temperature: " + fahrenheitTemp);
		System.out.println("Celsius Equivalent: " + celsiusTemp);

	}

}
