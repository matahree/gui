import static org.junit.jupiter.api.Assertions.*;

import java.io.OutputStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParallelogramTest {

	Parallelogram Parallelogram;
	
	@BeforeEach
	void setUp() throws Exception {
		Parallelogram = new Parallelogram(6,7,8);
	}

	@Test
	public void testArea() {
		  assertEquals(48, Parallelogram.area() );
	}
	@Test
	public void testPerimeter() {
		assertEquals(26, Parallelogram.perimater());
	}

	@Test
	public void testSerialize(OutputStream outputStream) {
		Parallelogram.serialize(outputStream);
		assertEquals("parallelogram a=6.0 b=7.0 h=8.0", outputStream.toString().trim());
	}

}
