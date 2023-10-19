
public class rectangle extends GeometricPrimitive{
	
	double a;
	double b;
	
	public double perimater() {
		return (2 * (a + b));	
	}

	public double area() {
		return (a * b);
	}

	public rectangle(double a, double b) {
		
		this.a = a;
		this.b = b;
	}
	
}
