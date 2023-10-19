
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class rectangleTest {

	rectangle Rectangle;
	
	@BeforeEach
	void setUp() throws Exception {
		Rectangle = new rectangle(2,4);
	}

	@Test
	public void testArea() {
		  assertEquals(8, Rectangle.area() );
	}
	@Test
	public void testPerimeter() {
		assertEquals(12, Rectangle.perimater());
	}
    
}
