
public class diamond extends GeometricPrimitive{

	double a;
	double d1;
	double d2;
	public double perimater() {
		return (4 * a);
	}

	public double area() {
		return (d1 * d2 / 2);
	}

	public diamond(double a, double d1, double d2) {
		
		this.a = a;
		this.d1 = d1;
		this.d2 = d2;
	}	
}
