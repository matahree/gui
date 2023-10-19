
public class parallelogram extends GeometricPrimitive {
	
	double a;
	double b;
	double h;
	
	public double perimater() {
		return 2*(a+b);
	}

	public double area() {
	return (a*h);
	}

	public parallelogram(double a, double b, double h) {
		
		this.a = a;
		this.b = b;
		this.h = h;
	}
}
