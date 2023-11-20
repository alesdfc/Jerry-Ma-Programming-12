package Modules.com.Module1;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List<TwoDShape> Shapes = new ArrayList<>();
        Shapes.add(new Triangle(9, 11, 10));
        Shapes.add(new Triangle(8, 8));
        Shapes.add(new Triangle(2, 5));
        Shapes.add(new TwoDShape(10, 10));
        for (TwoDShape shape : Shapes) {
            System.out.println("the area of this shape is: " + shape.getArea());
        }
    }
}