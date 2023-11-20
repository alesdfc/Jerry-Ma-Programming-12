package Modules.com.Module4;

public class Triangle extends TwoDShape {
        public interface Rotate {
        void rotate90();
        void rotate180();
        void rotate(double degree);
    }
        double angle;
        double side1;
        double side2;
        double side3;
        public Triangle(double width, double height, double angle, Colour colour){
            this.width = width;
            this.height = height;
            this.angle = angle;
            this.colour = colour;
        }
        public Triangle(double side1, double side2, double side3, double angle, Colour colour){

            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.height = this.heronsHeight();
            this.width = side3;
            this.angle = angle;
            this.colour = colour;
        }

        /*
        *@param Triangle Object
        *@return the height of the triangle object given its 3 sides using herons formula
        */
        private double heronsHeight(){
            double s = (side1+side2+side3)/2;
            return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3))/(side3/2);
        }

        /*
        *@param Triangle Object
        *@return area of triangle object
        */
        @Override
        public double getArea(){
        return width*height/2;
         }
        public String toString(){
        return "This is a triangle with a base of " + width + " and a height of " + height;
        }
        public void rotate90(){
        this.angle = angle+90;
    }
        public void rotate180(){
        this.angle = angle+180;
        }
        public void rotate(double degree){
        this.angle = angle+degree;
        }
}
