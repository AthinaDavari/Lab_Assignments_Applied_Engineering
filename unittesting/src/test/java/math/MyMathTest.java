package math;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MyMathTest {

	MyMath mm = new MyMath();

	@Rule
	public final ExpectedException thrown = ExpectedException.none();

	@Test
	public void test_factorial_nNegative_illegalArgumentException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("n should be >= 0 (and <= 12)");
		mm.factorial(-80);
	}

	@Test
	public void test_factorial_nBiggerThanTwelve_illegalArgumentException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("n should be <= 12 (and >= 0)");
		mm.factorial(500);
	}

	@Test
	public void test_isPrime_nSmallerThanTwo_illegalArgumentException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("n should be >=2");
		mm.isPrime(1);
	}

	@Test
	public void test_isPrime_nBiggerThanTwoAndPrime() {
		Assert.assertTrue(mm.isPrime(5));
		Assert.assertTrue(mm.isPrime(7));
		Assert.assertTrue(mm.isPrime(19));
		Assert.assertTrue(mm.isPrime(11));
	}

	@Test
	public void test_isPrime_nBiggerThanTwoAndNonPrime() {
		Assert.assertFalse(mm.isPrime(6));
		Assert.assertFalse(mm.isPrime(15));
		Assert.assertFalse(mm.isPrime(9));
	}

}
