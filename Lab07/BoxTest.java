// +main(args: String[]): void // public, static
import java.util.ArrayList;
import java.util.Random;
import java.text.DecimalFormat;

public class BoxTest {
    public static void main(String[] args) {
        Box smallBox = new Box(4,5,2);

        System.out.println(smallBox);
        System.out.println("Small box's width: " + smallBox.getWidth());
        System.out.println("Small box's height: " + smallBox.getHeight());
        System.out.println("Small box's depth: " + smallBox.getDepth());
        System.out.println("Small box's volume: " + smallBox.volume());
        System.out.println("Small box's surface area: " + smallBox.surfaceArea());
        System.out.println("Small box's full status: " + smallBox.getFull());
        
        System.out.println("\n========Change smallbox using it's setters========...\n");

        smallBox.setFull(true);
        smallBox.setWidth(2);
        smallBox.setHeight(3);
        smallBox.setDepth(1);

        System.out.println(smallBox);
        System.out.println("Small box's width: " + smallBox.getWidth());
        System.out.println("Small box's height: " + smallBox.getHeight());
        System.out.println("Small box's depth: " + smallBox.getDepth());
        System.out.println("Small box's volume: " + smallBox.volume());
        System.out.println("Small box's surface area: " + smallBox.surfaceArea());
        System.out.println("Small box's full status: " + smallBox.getFull());

        System.out.println("\n========Create 5 boxes========...\n");

        Random generator = new Random();
        ArrayList<Box> boxes = new ArrayList<Box>();

        for (int i = 1; i < 6; i++) {
            Box box = new Box(generator.nextInt(100) + 1, generator.nextInt(100) + 1, generator.nextInt(100) + 1); // random number 1-100 inclusive
            box.setFull(generator.nextBoolean());
            boxes.add(box);
            System.out.println("Box " + i + ": " + box);
        }

        System.out.println("\n========Find the largest box========...\n");
        
        Box largestBox = new Box(0,0,0);
        for(Box box : boxes) { //for each box (type Box) in boxes (arraylist)
            if (box.volume() > largestBox.volume()) {
                largestBox = box;
            }
        }
        DecimalFormat formatter = new DecimalFormat("#,###.00");

        System.out.println("Largest Box\n" + largestBox);
        System.out.println("Volume: " + formatter.format(largestBox.volume()));
        System.out.println("Surface Area: " + formatter.format(largestBox.surfaceArea()));
    }
}