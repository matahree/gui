
public class Main {
	
    public static void main(String[] args) {
        Circle circle = new Circle(0.5);
        circle.serialize(System.out);
        System.out.println("Enter a circle using the \"circle r=radius\" format:");
        GeometricPrimitive.deserialize(System.in).serialize(System.out);
    }

}

// I just wanted to check does it work or not. That's why I created it.
