import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeometricPrimitiveTest {
    
    GeometricPrimitive arr[] = new GeometricPrimitive[7];
    Circle cir;
    Diamond dia;
    Parallelogram par;
    Rectangle rec;
    Square sq;
    Triangle tri;
    Trapezium tra;
    
    @BeforeEach
    void setup(){
        cir = new Circle(4);
        dia = new Diamond(13,15,18);
        par = new Parallelogram(6,7,8);
        rec = new Rectangle(2,4);
        sq = new Square(7);
        tri = new Triangle(4,6,8,10);
        tra = new Trapezium(5,7,9,11,13);

        arr[0] = cir;
        arr[1] = dia;
        arr[2] = par;
        arr[3] = rec;
        arr[4] = sq;
        arr[5] = tri;
        arr[6] = tra;
    }

    @Test
    void testArea(){
        double result =0;
        for(int k=0; k<arr.length; k++){
            result += arr[k].area();
        }

        Assert.assertEquals(Double.doubleToLongBits(398.2654824), Double.doubleToLongBits(result));
        
    }

    @Test
    void testPerimeter(){
        double result=0;
        for(int t=0; t<arr.length; t++){
            result += arr[t].perimater();
        }

        Assert.assertEquals(Double.doubleToLongBits(193.1327412), Double.doubleToLongBits(result));

    }

    @Test
    void testDeserialize() {
        InputStream cir = new ByteArrayInputStream("circle r=5.0".getBytes(StandardCharsets.UTF_8));
        Circle circle = (Circle) GeometricPrimitive.deserialize(cir);
        assertEquals(5.0, circle.r);

        InputStream dia = new ByteArrayInputStream("diamond a=13.0 d1=15.0 d2=18.0".getBytes(StandardCharsets.UTF_8));
        Diamond diamond = (Diamond) GeometricPrimitive.deserialize(dia);
        assertEquals(13.0, diamond.a);
        assertEquals(15.0, diamond.d1);
        assertEquals(18.0, diamond.d2);

        InputStream par = new ByteArrayInputStream("parallelogram a=6.0 b=7.0 h=8.0".getBytes(StandardCharsets.UTF_8));
        Parallelogram parallelogram = (Parallelogram) GeometricPrimitive.deserialize(par);
        assertEquals(6.0, parallelogram.a);
        assertEquals(7.0, parallelogram.b);
        assertEquals(8.0, parallelogram.h);

        InputStream rec = new ByteArrayInputStream("rectangle a=2.0 b=4.0".getBytes(StandardCharsets.UTF_8));
        Rectangle rectangle = (Rectangle) GeometricPrimitive.deserialize(rec);
        assertEquals(2.0, rectangle.a);
        assertEquals(4.0, rectangle.b);

        InputStream sq = new ByteArrayInputStream("square s=7.0".getBytes(StandardCharsets.UTF_8));
        Square square = (Square) GeometricPrimitive.deserialize(sq);
        assertEquals(7.0, square.s);

        InputStream tra = new ByteArrayInputStream("trapezium a=5.0 b=7.0 c=9.0 d=11.0 h=13.0".getBytes(StandardCharsets.UTF_8));
        Trapezium trapezium = (Trapezium) GeometricPrimitive.deserialize(tra);
        assertEquals(5.0, trapezium.a);
        assertEquals(7.0, trapezium.b);
        assertEquals(9.0, trapezium.c);
        assertEquals(11.0, trapezium.d);
        assertEquals(13.0, trapezium.h);

        InputStream tri = new ByteArrayInputStream("triangle a=4.0 b=6.0 c=8.0 h=10.0".getBytes(StandardCharsets.UTF_8));
        Triangle triangle = (Triangle) GeometricPrimitive.deserialize(tri);
        assertEquals(4.0, triangle.a);
        assertEquals(6.0, triangle.b);
        assertEquals(8.0, triangle.c);
        assertEquals(10.0, triangle.h);

    }

}

