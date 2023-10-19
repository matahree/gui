
public class circle extends GeometricPrimitive {
	
	double r;
	
	public double perimater() {
		return (2 * 3.14159265 * r);
	}

	public double area() {
		return (3.14159265 * r * r);
	}

	public circle(double r) {
		
		this.r = r;
		
	}
}
