
public class trapezium extends GeometricPrimitive {
	
	double a;
	double b;
	double c;
	double d;
	double h;
	
	public double perimater() {
		return (a + b + c + d);
	}

	public double area() {
		return (0.5 * (a + b)* h);
	}

	public trapezium(double a, double b, double c, double d, double h) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.h = h;
	}
}
