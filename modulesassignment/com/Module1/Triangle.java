package Modules.com.Module1;

public class Triangle extends TwoDShape {
    double side1;
    double side2;
    double side3;

    Triangle(double width , double height){
        this.width = width;
        this.height = height;
    }
    Triangle(double side1 , double side2, double side3){

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = this.heronsHeight();
        this.width = side3;
    }
    private double heronsHeight(){
        double s = (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3))/(side3/2);
    }
    @Override
    public double getArea(){
        return width*height/2;
    }
}
