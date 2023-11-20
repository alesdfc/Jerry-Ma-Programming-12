package Modules.com.Module4;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args){
        List<TwoDShape> Shapes = new ArrayList<>();
        Shapes.add(new Triangle(9,11,10, TwoDShape.Colour.RED));
        Shapes.add(new Triangle(8,8,7, TwoDShape.Colour.BLUE));
        Shapes.add(new Circle(8, TwoDShape.Colour.GREEN));
        Shapes.add(new Circle(24, TwoDShape.Colour.NONE));
        Shapes.add(new Triangle(2,5,5, 90, TwoDShape.Colour.GREEN));
        for(TwoDShape shape:Shapes){
            System.out.println(shape.toString());
            System.out.println(shape.getArea());
        }
    }
}
