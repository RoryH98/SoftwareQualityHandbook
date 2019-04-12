package independentPathsTest;

public class PrimeNumberTester {
	public String primeNumberChecker(int number) {
		if (number >= 2) {
			if (number % 2 == 0) {
				if (number == 2) {
					return "Congradulations this is a prime number!";
				} else {
					return "Sorry this number isnt a prime number!";
				}
			} else {
				for (int i = 0; i < number; i++) {
					if (i != 0 & i != 1) {
						if (number % i == 0) {
							return "Sorry this number isnt a prime number!";
						}
					}
				}
			}

		} else {
			return "Sorry this number isnt a prime number!";
		}
		return "Congradulations this is a prime number!";
	}

}
