package math;

import org.junit.Assert;
import org.junit.Test;

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

}
