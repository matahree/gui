import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Trapezium extends GeometricPrimitive {
	
	double a;
	double b;
	double c;
	double d;
	double h;
	private static Scanner in;
	
	public double perimater() {
		return (a + b + c + d);
	}

	public double area() {
		return (0.5 * (a + b)* h);
	}

	public Trapezium(double a, double b, double c, double d, double h) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.h = h;
	}

	public void serialize(OutputStream output) {

		String formatted =  " a=" + a + " b=" + b + " c=" + c + " d=" + d + " h=" + h+  "\n";
		try {
			output.write(formatted.getBytes());
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static Trapezium deserialize(InputStream input) {

		in = new Scanner(input);

		if (in.hasNext("trapezium")) {
			in.next("trapezium");
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
										String dField = in.next();
										String[] dParts = dField.split("=");
										if (dParts.length == 2) {
											double d = Double.parseDouble(dParts[1]);

											if (in.hasNext()) {
												String hField = in.next();
												String[] hParts = hField.split("=");
												if (hParts.length == 2) {
													double h = Double.parseDouble(hParts[1]);


									return new Trapezium (a, b, c, d, h);
												}
											}
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
					

