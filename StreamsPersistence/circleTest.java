import static org.junit.jupiter.api.Assertions.*;

import java.io.OutputStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CircleTest {

	Circle Circle;
	
	@BeforeEach
	void setUp() throws Exception {
		Circle = new Circle(4);
	}

	@Test
	public void testArea() {
		  assertEquals(50.2654824, Circle.area() );
	}
	@Test
	public void testPerimeter() {
		assertEquals(25.1327412, Circle.perimater());
	}

	@Test
	public void testSerialize(OutputStream OutputStream) {
		Circle.serialize(OutputStream);
		assertEquals("circle r=4.0", OutputStream.toString().trim());
	}

}
