import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class squareTest {
	
	square Square;
	
	@BeforeEach
	void setUp() throws Exception {
		Square = new square(7);
	}

	@Test
	public void testArea() {
		  assertEquals(49, Square.area() );
	}
	@Test
	public void testPerimeter() {
		assertEquals(28, Square.perimater());
	}

}
