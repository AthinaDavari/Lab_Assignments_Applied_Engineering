package math;

import java.util.stream.IntStream;

/**
 * MyMath provides simple arithmetic operation for a numbers' factorial.
 * 
 * @author AthinaDavari
 * 
 */
public class MyMath {

	/**
	 * Performs the calculation of the factorial of a given number.
	 * 
	 * @param the given number we want to calculate its factorial
	 * @return the result of the calculation for the numbers' factorial
	 * @exception IllegalArgumentException when the given number is smaller than
	 *                                     zero or bigger than 12
	 */
	public int factorial(int n) {
		if (n < 0 || n > 12) {
			throw new IllegalArgumentException("n should be >= 0 and <= 12");
		} else {
			return IntStream.rangeClosed(1, n).reduce(1, (x, y) -> x * y);
		}

	}

}
