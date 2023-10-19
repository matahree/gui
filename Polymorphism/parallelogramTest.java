import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class parallelogramTest {

	parallelogram Parallelogram;
	
	@BeforeEach
	void setUp() throws Exception {
		Parallelogram = new parallelogram(6,7,8);
	}

	@Test
	public void testArea() {
		  assertEquals(48, Parallelogram.area() );
	}
	@Test
	public void testPerimeter() {
		assertEquals(26, Parallelogram.perimater());
	}

}
