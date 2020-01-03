import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	void testSub() {
		Demo actual = new Demo();
		int A = actual.sub(12, 34);
		
		assertEquals(A,-22);
	}
	@Test
	void testPSub() {
		Demo actual = new Demo();
		int A = actual.sub(12, 11);
		
		assertEquals(A,1);
	}

}
