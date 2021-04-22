package math;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ArithmeticOperationsTest {
	ArithmeticOperations arop = new ArithmeticOperations();

	@Test(expected = ArithmeticException.class)
	public void testDivide_zeroDenominator_arithmeticException() {
		arop.divide(1, 0);
		arop.divide(8, 0);
		arop.divide(-550, 0);
	}

	@Test
	public void testDivide_nonZeroDenominator() {
		Assert.assertEquals(1, arop.divide(1, 1), 0.01);
		Assert.assertEquals(1.5, arop.divide(3, 2), 0.01);
		Assert.assertEquals(1.5, arop.divide(-3, -2), 0.01);
		Assert.assertEquals(-1.5, arop.divide(3, -2), 0.01);
		Assert.assertEquals(-1, arop.divide(2, -2), 0.01);
	}

	@Rule
	public final ExpectedException thrown = ExpectedException.none();

	@Test
	public void testMultiply_xNegative_illegalArgumentException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x & y should be >= 0");
		arop.multiply(-4, 1);
		arop.multiply(-18, 8);
	}

	@Test
	public void testMultiply_yNegative_illegalArgumentException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x & y should be >= 0");
		arop.multiply(4, -1);
		arop.multiply(5, -1894789);
	}

	@Test
	public void testMultiply_xAndYNegative_illegalArgumentException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("x & y should be >= 0");
		arop.multiply(-4, -1);
		arop.multiply(-18, -8);
	}

	@Test
	public void testMultiply_xYNonNegativeAndXYMultiplyBiggerThanMaxInteger_illegalArgumentException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("The product does not fit in an Integer variable");
		arop.multiply(22222222, 88888888);
		arop.multiply(7890269, 930487279);
	}

	@Test
	public void testMultiply_xYNonNegativeAndXYMultiplyEqualOrSmallerThanMaxInteger() {
		Assert.assertEquals(15, arop.multiply(5, 3));
		Assert.assertEquals(1796704, arop.multiply(1456, 1234));
	}

}
