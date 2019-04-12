package errorHandlingPaths;

/*                                                               
* This is a class which has a method 
* which takes a string of numbers
* splits the numbers and adds them together
*
*/

public class StringCalculator {

	public int add(String numbers) {
		int answer_L = 0;
		try {
			if (numbers.equals("")) {
				return 0;
			}

			String[] parts = numbers.split(",");
			for (int i = 0; i < parts.length; i++) {
				if (Integer.parseInt(parts[i]) < 0) {
					throw new IllegalArgumentException("Only Positive Numbers " + Integer.parseInt(parts[i]));
				} else {
					answer_L = answer_L + Integer.parseInt(parts[i]);
				}
			}
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Only Positive Numbers");
		}

		return answer_L;

	}
}
