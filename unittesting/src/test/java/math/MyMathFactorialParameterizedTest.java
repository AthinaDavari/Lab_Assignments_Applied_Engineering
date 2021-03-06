package math;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MyMathFactorialParameterizedTest {

	@Parameter(value = 0)
	public int number;
	@Parameter(value = 1)
	public int result;

	MyMath mm = new MyMath();

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, 1 }, { 1, 1 }, { 2, 2 }, { 12, 479001600 } });
	}

	@Test
	public void test_factorial() {
		Assert.assertEquals(result, mm.factorial(number));
	}

}
