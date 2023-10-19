import static org.junit.jupiter.api.Assertions.*;

import java.io.OutputStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquareTest {
	
	Square Square;
	
	@BeforeEach
	void setUp() throws Exception {
		Square = new Square(7);
	}

	@Test
	public void testArea() {
		  assertEquals(49, Square.area() );
	}
	@Test
	public void testPerimeter() {
		assertEquals(28, Square.perimater());
	}

	@Test
	public void testSerialize(OutputStream outputStream) {
		Square.serialize(outputStream);
		assertEquals("square s=7.0", outputStream.toString().trim());
	}

}
