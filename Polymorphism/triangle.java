
public class triangle extends GeometricPrimitive {

	
	double a;
	double b;
	double c;
	double h;
	
	public double perimater() {
		return(a+b+c);
	}

	public double area() {
		return(b*h/2);
	}

	public triangle(double a, double b, double c, double h) {
	
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
	}
}
