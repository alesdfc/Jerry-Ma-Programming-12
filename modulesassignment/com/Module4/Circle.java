package Modules.com.Module4;

public class Circle extends TwoDShape {
    public final double PI = 3.14159;
    private double radius;

    public Circle(double radius, Colour colour){
        this.radius = radius;
        this.colour = colour;
    }

    /*
     *@param Circle object
     *@return area of circle
     */
    @Override
    public double getArea(){
        return PI*radius*radius;
    }
    public String toString(){
        return "This is a circle with a radius of " + radius;
    }

}
