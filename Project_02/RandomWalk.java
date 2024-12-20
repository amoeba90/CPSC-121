import edu.cwi.randomwalk.RandomWalkInterface;
import java.awt.Point;
import java.util.Random;
import java.util.ArrayList;

public class RandomWalk implements RandomWalkInterface {
    
    private int size;
    private boolean done;
    private ArrayList<Point> path;
    private Point start;
    private Point end;
    private Point current;
    private Random generator;
    
    public RandomWalk(int gridSize) {
        size = gridSize;
        done = false;
        path = new ArrayList<Point>();
        start = new Point(0,gridSize-1); // bottom left
        end = new Point(gridSize-1,0); // top right
        current = new Point(0,gridSize-1); // bottom left
        generator = new Random();
        path.add(new Point(start.x,start.y));
    }

    public RandomWalk(int gridSize, long seed) {
        size = gridSize;
        done = false;
        path = new ArrayList<Point>();
        start = new Point(0,gridSize-1); // bottom left
        end = new Point(gridSize-1,0); // top right
        current = new Point(0,gridSize-1); // bottom left
        generator = new Random(seed);
        path.add(new Point(start.x,start.y));
    }

    public void step() {
        if (done == false) {
            if (current.y > 0 && current.x < size-1) { 
                boolean moveNorth = generator.nextBoolean();
                Point newStep = (moveNorth) ? new Point(current.x,current.y-=1) : new Point(current.x+=1,current.y);
                path.add(new Point(newStep.x,newStep.y));
                current = newStep;
                
            } else if (current.y > 0 && current.x >= size-1) { 
                Point newStep = new Point(current.x,current.y-=1);
                path.add(new Point(newStep.x,newStep.y));
                current = newStep;
                
            } else if (current.y <= 0 && current.x < size-1) { 
                Point newStep = new Point(current.x+=1,current.y);
                path.add(new Point(newStep.x,newStep.y));
                current = newStep;
                
            } else { 
                done = true;
            }
            
        } else {

        }
    }

    public void createWalk() {
        while (done == false) {
            step();
        }
    }

    public boolean isDone() {
        return done;
    }

    public int getGridSize() {
        return size;
    }

    public Point getStartPoint() {
        return start;
    }

    public Point getEndPoint() {
        return end;
    }

    public Point getCurrentPoint() {
        return current;
    }

    public ArrayList<Point> getPath() {
        return new ArrayList<>(path);
        
        // ArrayList<Point> result = new ArrayList<Point>();
        // for (i = 0;;)result.add
        // return result;
    }

    public String toString() {
        String result = "";
        for (Point step : path) {
            result += ("[" +  step.x + "," + step.y + "] ");
        }
        return result;
    }


}