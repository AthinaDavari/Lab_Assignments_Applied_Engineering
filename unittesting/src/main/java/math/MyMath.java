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
	 * @param n the given number we want to calculate its factorial
	 * @return the result of the calculation for the numbers' factorial
	 * @exception IllegalArgumentException when the given number is smaller than
	 *                                     zero or bigger than 12
	 */
	public int factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n should be >= 0 (and <= 12)");
		} else if (n > 12) {
			throw new IllegalArgumentException("n should be <= 12 (and >= 0)");
		} else {
			return IntStream.rangeClosed(1, n).reduce(1, (x, y) -> x * y);
		}

	}

	/**
	 * Performs an operation to see if a number is prime or not and returns the
	 * result.
	 * 
	 * @param n the given number we want to see if it is prime or not
	 * @return if the number is prime or not
	 */
	public boolean isPrime(int n) {
		if (n < 2) {
			throw new IllegalArgumentException("n should be >=2");
		}
		for (int i = 2; i <= n / 2; i++) {
			if ((n % i) == 0) {
				return false;
			}
		}
		return true;
	}

}
