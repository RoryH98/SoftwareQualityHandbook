package boundaryTesting;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BoundaryTest {

	@Test
	void test() {
	 testMaximum();
	 testMinimum();
	}

	private void testMinimum() {
		Boundary boundary = new Boundary();
		assertEquals(5,boundary.size());
	}

	void testMaximum() {
		Boundary boundary = new Boundary();
		boundary.addNumber(5);
		boundary.addNumber(6);
		boundary.addNumber(3);
		boundary.addNumber(11);
		boundary.addNumber(34);
		
		assertEquals(5,boundary.size());
	}
	
	
}
