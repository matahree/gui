import java.io.InputStream;
import java.io.OutputStream;

public abstract class GeometricPrimitive {


    public abstract double  perimater();
    public abstract double  area();
    public abstract void serialize(OutputStream output);


    public static GeometricPrimitive deserialize(InputStream input) {
  
        Circle circle = Circle.deserialize(input);
        if (circle != null) return circle;

        Diamond diamond = Diamond.deserialize(input);
        if (diamond != null) return diamond;

        Parallelogram parallelogram = Parallelogram.deserialize(input);
        if (parallelogram != null) return parallelogram;

        Rectangle rectangle = Rectangle.deserialize(input);
        if (rectangle != null) return rectangle;

        Square square = Square.deserialize(input);
        if (square != null) return square;

        Trapezium trapezium = Trapezium.deserialize(input);
        if (trapezium != null) return trapezium;

        Triangle triangle = Triangle.deserialize(input);
        if (triangle != null) return triangle;

        return null;
    }

}