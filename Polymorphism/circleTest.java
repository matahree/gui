import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class circleTest {

circle Circle;
	
	@BeforeEach
	void setUp() throws Exception {
		Circle = new circle(4);
	}

	@Test
	public void testArea() {
		  assertEquals(50.2654824, Circle.area() );
	}
	@Test
	public void testPerimeter() {
		assertEquals(25.1327412, Circle.perimater());
	}
}
