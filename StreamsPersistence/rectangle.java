import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Rectangle extends GeometricPrimitive{
	
	double a;
	double b;
	private static Scanner in;
	
	public double perimater() {
		return (2 * (a + b));	
	}

	public double area() {
		return (a * b);
	}

	public Rectangle(double a, double b) {
		
		this.a = a;
		this.b = b;
	}

	public void serialize(OutputStream output) {

		String formatted =  " a=" + a + " b=" + b + "\n";
		try {
			output.write(formatted.getBytes());
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static Rectangle deserialize(InputStream input) {

		in = new Scanner(input);

		if (in.hasNext("rectangle")) {
			in.next("rectangle");
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
									return new Rectangle (a, b);
								}
							}
						}
					}
				}
		return null;
	}
}