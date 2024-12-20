// Box
// -width: double
// -height: double
// -depth: double
// -full: boolean
// +box(width: double, height: double, depth: double)
// +getWidth(): double
// +getHeight(): double
// +getDepth(): double
// +getFull(): boolean
// +setWidth(width: double): void
// +setHeight(height: double): void
// +setDepth(depth: double): void
// +setFull(full: boolean): void
// +volume(): double
// +surfaceArea(): double
// +toString(): String

import java.text.DecimalFormat;
public class Box {
    private double width;
    private double height;
    private double depth;
    private boolean full;
    
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.full = false;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public boolean getFull() {
        return full;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public double volume() {
        return (width*height*depth);
    }

    public double surfaceArea() {
        return ((2*width*height)+(2*depth*height)+(2*width*depth));
    }

    public String toString() {
        DecimalFormat formatter = new DecimalFormat("#.00");
        String result = full ? "A full " : "An empty " ;
        result += formatter.format(width) + " x ";
        result += formatter.format(height) + " x ";
        result += formatter.format(depth) + " box.";
        return result;
    }
    
}
