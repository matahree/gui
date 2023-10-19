import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class diamondTest {

diamond Diamond;
	
	@BeforeEach
	void setUp() throws Exception {
		Diamond = new diamond(13,15,18);
	}

	@Test
	public void testArea() {
		  assertEquals(135, Diamond.area() );
	}
	@Test
	public void testPerimeter() {
		assertEquals(52, Diamond.perimater());
	}

}
