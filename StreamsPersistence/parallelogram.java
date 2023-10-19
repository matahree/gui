import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Parallelogram extends GeometricPrimitive {
	
	double a;
	double b;
	double h;
	private static Scanner in;
	
	public double perimater() {
		return 2*(a+b);
	}

	public double area() {
	return (a*h);
	}

	public Parallelogram(double a, double b, double h) {
		
		this.a = a;
		this.b = b;
		this.h = h;
	}

	public void serialize(OutputStream output) {

		String formatted =  " a=" + a + " b=" + b + " h=" + h+ "\n";
		try {
			output.write(formatted.getBytes());
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static Parallelogram deserialize(InputStream input) {

		in = new Scanner(input);

		if (in.hasNext("parallelogram")) {
			in.next("parallelogram");
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
								String hField = in.next();
								String[] hParts = hField.split("=");
								if (hParts.length == 2) {
									double h = Double.parseDouble(hParts[1]);
									return new Parallelogram (a, b,h);
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
			