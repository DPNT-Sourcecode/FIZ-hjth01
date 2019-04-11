package befaster.solutions.FIZ;

public class FizzBuzzSolution {

	public String fizzBuzz(Integer number) {
    	String numberStr = String.valueOf(number);
    	if (number > 10 && containsIdenticalDigits(numberStr)) {
    		return "deluxe";
    	} else if ((number % 3 == 0 || numberStr.contains("3")) && (number % 5 == 0  || numberStr.contains("5"))) {
    		return "fizz buzz";
    	} else if (number % 3 == 0 || numberStr.contains("3")) {
    		return "fizz";
    	} else if (number % 5 == 0 || numberStr.contains("5")) {
    		return "buzz";
    	} else {
    		return String.valueOf(number);
    	}
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

