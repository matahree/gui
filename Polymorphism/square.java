
public  class square extends GeometricPrimitive {
	
	double s;
	public double perimater() {
		return (4 * s);
	}

	public double area() {
		return (s * s);

	}

	public square(double s) {
		
		this.s = s;
	}
}
