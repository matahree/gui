import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Triangle extends GeometricPrimitive {

	
	double a;
	double b;
	double c;
	double h;
	private static Scanner in;
	
	public double perimater() {
		return(a+b+c);
	}

	public double area() {
		return(b*h/2);
	}

	public Triangle(double a, double b, double c, double h) {
	
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
	}

	public void serialize(OutputStream output) {

		String formatted =" a=" + a + " b=" + b + " c=" + c + " h=" + h+  "\n";
		try {
			output.write(formatted.getBytes());
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static Triangle deserialize(InputStream input) {

		in = new Scanner(input);

		if (in.hasNext("triangle")) {
			in.next("triangle");
			if (in.hasNext()) {
				String aField = in.next();
				String[] aParts = aField.split("=");
				if (aParts.length == 2) {
					double a = Double.parseDouble(aParts[1]);

					if (in.hasNext()) {
						String bField = in.next();
						String[] bParts = bField.split("=");
						if (bParts.length == 2) {
							double b = Double.parseDouble(bParts[1]);

							if (in.hasNext()) {
								String cField = in.next();
								String[] cParts = cField.split("=");
								if (cParts.length == 2) {
									double c = Double.parseDouble(cParts[1]);

											if (in.hasNext()) {
												String hField = in.next();
												String[] hParts = hField.split("=");
												if (hParts.length == 2) {
													double h = Double.parseDouble(hParts[1]);


													return new Triangle (a, b, c, h);
												}
											}
									}
								}
							}
					}
				}
			}
		}
		return null;
	}
}
