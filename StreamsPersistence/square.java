import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public  class Square extends GeometricPrimitive {

	double s;
	private static Scanner in;
	public double perimater() {
		return (4 * s);
	}

	public double area() {
		return (s * s);

	}

	public Square(double s) {

		this.s = s;
	}

	public void serialize(OutputStream output) {

		String formatted = "square" + " s=" + s + "\n";
		try {
			output.write(formatted.getBytes());
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static Square deserialize(InputStream input) {

		in = new Scanner(input);

		if (in.hasNext("square")) {
			in.next("square");
			if (in.hasNext()) {

				String sField = in.next();
				String[] sParts = sField.split("=");
				if (sParts.length == 2) {
					double s = Double.parseDouble(sParts[1]);

					return new Square(s);
				}
			}
		}

		return null;
	}
}