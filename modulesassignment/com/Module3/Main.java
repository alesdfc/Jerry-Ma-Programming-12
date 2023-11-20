package Modules.com.Module3;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args){
        List<TwoDShape> Shapes = new ArrayList<>();
        Shapes.add(new Triangle(9,11,10));
        Shapes.add(new Triangle(8,8,7));
        Shapes.add(new Circle(8));
        Shapes.add(new Circle(24));
        Shapes.add(new Triangle(2,5,5));

        for(TwoDShape shape:Shapes){
            System.out.println(shape.toString());
            System.out.println(shape.getArea());
        }
    }
}
