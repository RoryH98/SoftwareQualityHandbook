package errorHandlingPaths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	void test() {

		testBlank();
		stringAdd();
		negativeNumbers();
		letterAdd();

	}

	void testBlank() {
		StringCalculator stringCal = new StringCalculator();
		assertEquals(0, stringCal.add(""));
	}

	void stringAdd() {
		StringCalculator stringCal = new StringCalculator();
		assertEquals(32, stringCal.add("1,2,3,4,6,7,9"));
	}

	void negativeNumbers() {

		Exception ex = assertThrows(IllegalArgumentException.class, () -> {
			StringCalculator stringCal = new StringCalculator();
			assertEquals(32, stringCal.add("1,2,3,4,6,-7,9"));
		});
		assertEquals("Only Positive Numbers -7", ex.getMessage());

	}

	void letterAdd() {
		Exception ex = assertThrows(IllegalArgumentException.class, () -> {
			StringCalculator stringCal = new StringCalculator();
			assertEquals(32, stringCal.add("1,2,3,4,6,7l,9"));
		});
		assertEquals("Only Positive Numbers", ex.getMessage());

	}
}
