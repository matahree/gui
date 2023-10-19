import static org.junit.jupiter.api.Assertions.*;

import java.io.OutputStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriangleTest {

	Triangle Triangle;
	@BeforeEach
	void setUp() throws Exception {
		Triangle = new Triangle(4,6,8,10);
	}

	@Test
	public void testArea() {
		  assertEquals(30, Triangle.area() );
	}
	@Test
	public void testPerimeter() {
		assertEquals(18, Triangle.perimater());
	}

	@Test
	public void testSerialize(OutputStream outputStream) {
		Triangle.serialize(outputStream);
		assertEquals("triangle a=4.0 b=6.0 c=8.0 h=10.0", outputStream.toString().trim());
	}
}
