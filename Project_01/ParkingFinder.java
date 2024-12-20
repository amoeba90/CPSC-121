import java.util.Scanner;
import edu.cwi.parking.ParkingSpot;
import java.util.Random;
import java.text.NumberFormat;

public class ParkingFinder {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        long seed;
        int parkingTime, carX, carY;
        int distance1, distance2, distance3, distance4, minDistance;
        ParkingSpot closestSpot;

        System.out.println("Enter your random seed: ");
        seed = keyboard.nextLong();
        System.out.println("Enter the necessaray parking time (minutes): ");
        parkingTime = keyboard.nextInt();

        Random generator = new Random(seed);
        carX = generator.nextInt(100);
        carY = generator.nextInt(100);
        System.out.println("The position of your vehicle is:  X: " + carX + " Y: " + carY);
        
        ParkingSpot spot1 = new ParkingSpot("1st St.", generator.nextInt(100), generator.nextInt(100));
        ParkingSpot spot2 = new ParkingSpot("2nd St.", generator.nextInt(100), generator.nextInt(100));
        ParkingSpot spot3 = new ParkingSpot("3rd St.", generator.nextInt(100), generator.nextInt(100));
        ParkingSpot spot4 = new ParkingSpot("4th St.", generator.nextInt(100), generator.nextInt(100));

        spot3.setCostPerInterval(0.30);
        spot4.setCostPerInterval(0.30);

        distance1 = (Math.abs(carX - spot1.getLocationX()) + Math.abs(carY - spot1.getLocationY()));
        distance2 = (Math.abs(carX - spot2.getLocationX()) + Math.abs(carY - spot2.getLocationY()));
        distance3 = (Math.abs(carX - spot3.getLocationX()) + Math.abs(carY - spot3.getLocationY()));
        distance4 = (Math.abs(carX - spot4.getLocationX()) + Math.abs(carY - spot4.getLocationY()));

        System.out.println("\nSpot 1: " + spot1);
        System.out.println("\tDistance: " + distance1);
        System.out.println("\tTotal Cost: "  + currencyFormat.format(Math.ceil(parkingTime/10.0) * spot1.getCostPerInterval()));

        System.out.println("\nSpot 2: " + spot2);
        System.out.println("\tDistance: " + distance2);
        System.out.println("\tTotal Cost: "  + currencyFormat.format(Math.ceil(parkingTime/10.0) * spot2.getCostPerInterval()));

        System.out.println("\nSpot 3: " + spot3);
        System.out.println("\tDistance: " + distance3);
        System.out.println("\tTotal Cost: "  + currencyFormat.format(Math.ceil(parkingTime/10.0) * spot3.getCostPerInterval()));

        System.out.println("\nSpot 4: " + spot4);
        System.out.println("\tDistance: " + distance4);
        System.out.println("\tTotal Cost: "  + currencyFormat.format(Math.ceil(parkingTime/10.0) * spot4.getCostPerInterval()));

        minDistance = (Math.min(distance1, Math.min(distance2, Math.min(distance3, distance4))));
        System.out.println("\nThe distance to the closest spot is: " + minDistance);

        if (distance1 == minDistance) {
            closestSpot = spot1;
        } else if (distance2 == minDistance) {
            closestSpot = spot2;
        } else if (distance3 == minDistance) {
            closestSpot = spot3;
        } else {
            closestSpot = spot4;
        }
        System.out.println("The closest spot is: " + closestSpot + "\n");

    }   
}