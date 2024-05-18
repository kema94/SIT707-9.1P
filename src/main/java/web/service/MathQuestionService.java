package web.service;

public class MathQuestionService {

	/**
	 * Calculate Q1 result.
	 * @param number1
	 * @param number2
	 * @return
	 */
	 public static double q1Addition(String number1, String number2) {
	        validateInputs(number1, number2);
	        double result = Double.valueOf(number1) + Double.valueOf(number2);
	        return result;
	    }

	    public static double q2Subtraction(String number1, String number2) {
	        validateInputs(number1, number2);
	        double result = Double.valueOf(number1) - Double.valueOf(number2);
	        return result;
	    }

	    public static double q3Multiplication(String number1, String number2) {
	        validateInputs(number1, number2);
	        double result = Double.valueOf(number1) * Double.valueOf(number2);
	        return result;
	    }

	    private static void validateInputs(String number1, String number2) {
	        if (number1 == null || number2 == null || number1.isEmpty() || number2.isEmpty()) {
	            throw new IllegalArgumentException("Input strings must not be null or empty");
	        }

	        if (!isNumeric(number1) || !isNumeric(number2)) {
	            throw new IllegalArgumentException("Input strings must be valid numbers");
	        }
	    }

	    private static boolean isNumeric(String str) {
	        try {
	            Double.parseDouble(str);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }
}