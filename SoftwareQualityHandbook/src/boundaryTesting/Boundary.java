package boundaryTesting;

public class Boundary {
	private int[] numbers_G = new int[5];
	int i=0;
	
	public void addNumber(int testNumber) {
		this.numbers_G[i] = testNumber;
		i++;
	}
	
	
	public int size() {
		return this.numbers_G.length;
	}
	
}
