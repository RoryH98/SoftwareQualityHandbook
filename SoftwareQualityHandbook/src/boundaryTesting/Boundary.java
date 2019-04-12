package boundaryTesting;

public class Boundary {
	int[] numbers = new int[5];
	int i=0;
	
	public void addNumber(int testNumber) {
		numbers[i] = testNumber;
		i++;
	}
	
	
	public int size() {
		return numbers.length;
	}
	
}
