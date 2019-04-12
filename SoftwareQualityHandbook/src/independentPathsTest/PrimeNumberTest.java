package independentPathsTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PrimeNumberTest {

	@Test
	void test() {
	  lessThanTwo();
	  numberTwo();
	  evenNumber();
	  oddNumberThatIsntPrime();
	  oddNumberThatIsPrime();
	}
	
	void lessThanTwo() {
		PrimeNumberTester prime = new PrimeNumberTester();
		assertEquals("Sorry this number isnt a prime number!", prime.primeNumberChecker(1));
	}


	void numberTwo() {
		PrimeNumberTester prime = new PrimeNumberTester();
		assertEquals("Congradulations this is a prime number!", prime.primeNumberChecker(2));
	}
	
	void evenNumber(){
		PrimeNumberTester prime = new PrimeNumberTester();
		assertEquals("Sorry this number isnt a prime number!", prime.primeNumberChecker(4));
	}
	
	void oddNumberThatIsntPrime() {
		PrimeNumberTester prime = new PrimeNumberTester();
		assertEquals("Sorry this number isnt a prime number!", prime.primeNumberChecker(15));
	}
	
	void oddNumberThatIsPrime() {
		PrimeNumberTester prime = new PrimeNumberTester();
		assertEquals("Congradulations this is a prime number!", prime.primeNumberChecker(3));
	}	
}
