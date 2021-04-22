package math;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MyMathTest {

	MyMath mm = new MyMath();

	@Rule
	public final ExpectedException thrown = ExpectedException.none();

	@Test
	public void testFactorial_nNegative_illegalArgumentException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("n should be >= 0 and <= 12");
		mm.factorial(-1);
		mm.factorial(-80);

	}

	@Test
	public void testFactorial_nBiggerThanTwelve_illegalArgumentException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("n should be >= 0 and <= 12");
		mm.factorial(13);
		mm.factorial(500);
	}
}
