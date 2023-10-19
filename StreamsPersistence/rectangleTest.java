
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.OutputStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectangleTest {

	Rectangle Rectangle;
	
	@BeforeEach
	void setUp() throws Exception {
		Rectangle = new Rectangle(2,4);
	}

	@Test
	public void testArea() {
		  assertEquals(8, Rectangle.area() );
	}
	@Test
	public void testPerimeter() {
		assertEquals(12, Rectangle.perimater());
	}

	@Test
	public void testSerialize(OutputStream outputStream) {
		Rectangle.serialize(outputStream);
		assertEquals("rectangle a=2.0 b=4.0", outputStream.toString().trim());
	}
    
}
