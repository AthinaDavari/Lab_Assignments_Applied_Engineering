package math;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ArithmeticOperationsTest {
	ArithmeticOperations arop = new ArithmeticOperations();

	@Test(expected = ArithmeticException.class)
	public void test_divide_zeroDenominator_arithmeticException() {
		arop.divide(134499, 0);
	}

	@Test
	public void test_divide_nonZeroDenominator() {
		Assert.assertEquals(1, arop.divide(1, 1), 0.01);
		Assert.assertEquals(1.5, arop.divide(3, 2), 0.01);
		Assert.assertEquals(1.5, arop.divide(-3, -2), 0.01);
		Assert.assertEquals(-1.5, arop.divide(3, -2), 0.01);
		Assert.assertEquals(-1, arop.divide(2, -2), 0.01);
		Assert.assertEquals(-2, arop.divide(2, -1), 0.01);
		Assert.assertEquals(2, arop.divide(2, 1), 0.01);
		Assert.assertEquals(0, arop.divide(0, 1), 0.01);
	}

	@Rule
	public final ExpectedException thrown = ExpectedException.none();

	@Test
	public void test_multiply_xNegative_illegalArgumentException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x & y should be >= 0");
		arop.multiply(-18, 8);
	}

	@Test
	public void test_multiply_yNegative_illegalArgumentException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x & y should be >= 0");
		arop.multiply(5, -1894789);
	}

	@Test
	public void test_multiply_xAndYNegative_illegalArgumentException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x & y should be >= 0");
		arop.multiply(-4, -1);
	}

	@Test
	public void test_multiply_xNonNegativeAndYZero_arithmeticException() {
		Assert.assertEquals(0, arop.multiply(22222222, 0));
		Assert.assertEquals(0, arop.multiply(0, 0));
		Assert.assertEquals(0, arop.multiply(7629, 0));
	}

	@Test
	public void test_multiply_xNonNegativeYPositiveAndXYMultiplyBiggerThanMaxInteger_illegalArgumentException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The product does not fit in an Integer variable");
		// the multiply here == 2147483648 > Integer.MAX_VALUE (= 2147483647)
		arop.multiply(1073741824, 2);

	}

	@Test
	public void test_multiply_xNonNegativeYPositiveAndXYMultiplyEqualOrSmallerThanMaxInteger() {
		Assert.assertEquals(15, arop.multiply(5, 3));
		Assert.assertEquals(1796704, arop.multiply(1456, 1234));
		Assert.assertEquals(0, arop.multiply(0, 1234));
		// Integer.MAX_VALUE == 2147483647
		Assert.assertEquals(2147483647, arop.multiply(1, 2147483647));
	}

}
