package Modules.Module4;

abstract public class TwoDShape {
    public enum Colour {
        RED, GREEN, BLUE, NONE
    }
    double width;
    double height;
    Colour colour;

    public TwoDShape(double width, double height, Colour colour){
        this.width = width;
        this.height = height;
        this.colour = colour;
    }
    public TwoDShape(){
        this.width = 1;
        this.height = 1;
    }
    abstract public double getArea();
    public void setHeight(double height){
            this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
}
