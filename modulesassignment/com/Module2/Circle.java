package Modules.com.Module2;

public class Circle extends TwoDShape {
    public final double PI = 3.14159;
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return PI*radius*radius;
    }
    public String toString(){
        return "This is a circle with a radius of " + radius;
    }

}
