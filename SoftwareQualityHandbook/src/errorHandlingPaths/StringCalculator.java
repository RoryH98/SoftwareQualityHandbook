package errorHandlingPaths;

public class StringCalculator {

	public int add(String numbers) {
		int answer = 0;
		try {
			if (numbers.equals("")) {
				return 0;
			}

			String[] parts = numbers.split(",");
			for (int i = 0; i < parts.length; i++) {
				if (Integer.parseInt(parts[i]) < 0) {
					throw new IllegalArgumentException("Only Positive Numbers " + Integer.parseInt(parts[i]));
				} else {
					answer = answer + Integer.parseInt(parts[i]);
				}
			}
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Only Positive Numbers");
		}

		return answer;

	}
}
