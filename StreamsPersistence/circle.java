import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Circle extends GeometricPrimitive {

    double r;
	private static Scanner in;

    public Circle(double r) {
        this.r = r;
    }

    public double perimater() {
        return (2 * 3.14159265 * r);
    }

    public double area() {
        return (3.14159265 * r * r);
    }

    public void serialize(OutputStream output) {
       
        String formatted = "circle" + " r=" + r + "\n";
        try {
            output.write(formatted.getBytes());
        } catch (IOException e) {
           
            e.printStackTrace();
        }

    }

    public static Circle deserialize(InputStream input) {
    
        in = new Scanner(input);
      
        if (in.hasNext("circle")) {
            in.next("circle");
            if (in.hasNext()) {
          
                String rField = in.next();
                String[] rParts = rField.split("=");
                if (rParts.length == 2) {
                    double r = Double.parseDouble(rParts[1]);
                
                    return new Circle(r);
                }
            }
        }
     
        return null;
    }
}