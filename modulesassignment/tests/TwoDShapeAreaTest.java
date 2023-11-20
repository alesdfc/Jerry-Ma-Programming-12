import Modules.com.Module4.Circle;
import Modules.com.Module4.Triangle;
import Modules.com.Module4.TwoDShape;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TwoDShapeAreaTest {
    // Partition
    /*
    length and width are positive
    length and width are negative
    length is negative and height is positive
    length is positive and height is negative
    three sides are given
     */
    @Test
    public void testTriangleAreas(){
        Assert.assertEquals((34.4*98.8)/2, new Triangle(34.4,98.8, 90, TwoDShape.Colour.RED).getArea(), 0.1);
        Assert.assertEquals((-34.4*98.8)/2, new Triangle(-34.4,98.8, 90, TwoDShape.Colour.RED).getArea(), 0.1);
        Assert.assertEquals((-34.4*-98.8)/2, new Triangle(-34.4,-98.8, 90, TwoDShape.Colour.RED).getArea(), 0.1);
        Assert.assertEquals((3*4)/2, new Triangle(3,4, 5, 10, TwoDShape.Colour.RED).getArea(), 0.1);
    }


    // Partition
    /*
    radius is positive
    radius is negative
     */
    @Test
    public void testCircleAreas(){
        Assert.assertEquals((Math.pow(34.4,2)*3.14159), new Circle(34.4, TwoDShape.Colour.RED).getArea(), 0.1);
        Assert.assertEquals((Math.pow(-34.4,2)*3.14159), new Circle(-34.4, TwoDShape.Colour.RED).getArea(), 0.1);
        Assert.assertEquals((Math.pow(-307.48,2)*3.14159), new Circle(-307.48, TwoDShape.Colour.RED).getArea(), 0.1);
        Assert.assertEquals((Math.pow(0,2)*3.14159), new Circle(0, TwoDShape.Colour.RED).getArea(), 0.1);
    }
}