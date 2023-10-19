import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Diamond extends GeometricPrimitive{

	double a;
	double d1;
	double d2;
	private static Scanner in;
	public double perimater() {
		return (4 * a);
	}

	public double area() {
		return (d1 * d2 / 2);
	}

	public Diamond(double a, double d1, double d2) {
		
		this.a = a;
		this.d1 = d1;
		this.d2 = d2;
	}

	public void serialize(OutputStream output) {

		String formatted =  " d1=" + d1 + " d2=" + d2 + " a=" + a+ "\n";
		try {
			output.write(formatted.getBytes());
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static Diamond deserialize(InputStream input) {

		in = new Scanner(input);

		if (in.hasNext("diamond")) {
			in.next("diamond");
			if (in.hasNext()) {
				String d1Field = in.next();
				String[] d1Parts = d1Field.split("=");
				if (d1Parts.length == 2) {
					double d1 = Double.parseDouble(d1Parts[1]);
					if (in.hasNext()) {
						String d2Field = in.next();
						String[] d2Parts = d2Field.split("=");
						if (d2Parts.length == 2) {
							double d2 = Double.parseDouble(d2Parts[1]);
							if (in.hasNext()) {
								String aField = in.next();
								String[] aParts = aField.split("=");
								if (aParts.length == 2) {
									double a = Double.parseDouble(aParts[1]);
							return new Diamond (d1, d2,a);
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