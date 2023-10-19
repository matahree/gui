import static org.junit.jupiter.api.Assertions.*;

import java.io.OutputStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrapeziumTest {

	Trapezium Trapezium;
	
	@BeforeEach
	void setUp() throws Exception {
		Trapezium = new Trapezium(5,7,9,11,13);
	}

	@Test
	public void testArea() {
		  assertEquals(78, Trapezium.area() );
	}
	@Test
	public void testPerimeter() {
		assertEquals(32, Trapezium.perimater());
	}

	@Test
	public void testSerialize(OutputStream outputStream) {
		Trapezium.serialize(outputStream);
		assertEquals("trapezium a=5.0 b=7.0 c=9.0 d=11.0 h=13.0", outputStream.toString().trim());
	}

}
