import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class triangleTest {

	triangle Triangle;
	@BeforeEach
	void setUp() throws Exception {
		Triangle = new triangle(4,6,8,10);
	}

	@Test
	public void testArea() {
		  assertEquals(30, Triangle.area() );
	}
	@Test
	public void testPerimeter() {
		assertEquals(18, Triangle.perimater());
	}
}
