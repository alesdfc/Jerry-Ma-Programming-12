package Modules.com.Module3;

abstract public class TwoDShape {

    double width;
    double height;

    public TwoDShape(double width, double height){
        this.width = width;
        this.height = height;
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
