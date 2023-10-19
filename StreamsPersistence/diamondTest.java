import static org.junit.jupiter.api.Assertions.*;

import java.io.OutputStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class diamondTest {

Diamond Diamond;
	
	@BeforeEach
	void setUp() throws Exception {
		Diamond = new Diamond(13,15,18);
	}

	@Test
	public void testArea() {
		  assertEquals(135, Diamond.area() );
	}
	@Test
	public void testPerimeter() {
		assertEquals(52, Diamond.perimater());
	}

	@Test
	public void testSerialize(OutputStream outputStream) {
		Diamond.serialize(outputStream);
		assertEquals("diamond a=13.0 d1=15.0 d2=18.0", outputStream.toString().trim());
	}

}
