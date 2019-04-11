package befaster.solutions.FIZ;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzSolution {

	public String fizzBuzz(Integer number) {
		List<String> numberIdentifiers = new ArrayList<>();
		if (isFizz(number)) {
			numberIdentifiers.add("fizz");
		}

		if (isBuzz(number)) {
			numberIdentifiers.add("buzz");
		}

		if (isDeluxe(number)) {
			numberIdentifiers.add("deluxe");
		}

		if (!numberIdentifiers.isEmpty()) {
			return String.join(" ", numberIdentifiers);
		} else {
			return String.valueOf(number);
		}
	}

	public static boolean isFizz(int number) {
		return (number % 3 == 0 || String.valueOf(number).contains("3"));
	}

	public static boolean isBuzz(int number) {
		return (number % 5 == 0 || String.valueOf(number).contains("5"));
	}

	public static boolean isDeluxe(int number) {
		return (number > 10 && containsIdenticalDigits(String.valueOf(number)));
	}

	public static boolean containsIdenticalDigits(String numberStr) {
		for (char c : numberStr.toCharArray()) {
			if (c != numberStr.charAt(0)) {
				return false;
			}
		}
		return true;
	}
}





