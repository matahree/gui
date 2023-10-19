import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class trapeziumTest {

	trapezium Trapezium;
	
	@BeforeEach
	void setUp() throws Exception {
		Trapezium = new trapezium(5,7,9,11,13);
	}

	@Test
	public void testArea() {
		  assertEquals(78, Trapezium.area() );
	}
	@Test
	public void testPerimeter() {
		assertEquals(32, Trapezium.perimater());
	}

}
