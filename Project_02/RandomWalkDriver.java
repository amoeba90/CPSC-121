import java.util.Scanner;
public class RandomWalkDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean validGrid = false;
        boolean validSeed = false;
        int gridSize = 0;
        long seed = 0;
        RandomWalk trial1;
        

        while (validGrid == false) {
            System.out.print("Enter grid size: ");
            gridSize = keyboard.nextInt();
            if (gridSize > 0) {
                validGrid = true;
            } else {
                System.out.println("Error: grid size must be positive!");
            }
        }

        while (validSeed == false) {
            System.out.print("Enter random seed (0 for no seed): ");
            seed = keyboard.nextLong();
            if (seed >= 0) {
                validSeed = true;
            } else {
                System.out.println("Error: random seed must be >= 0!");
            }
        }

        if (seed == 0) {
            trial1 = new RandomWalk(gridSize);
        } else {
            trial1 = new RandomWalk(gridSize, seed);
        }
        
        trial1.createWalk();
        System.out.println(trial1);

    }
}
