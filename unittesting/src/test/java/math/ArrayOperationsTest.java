package math;

import org.junit.Assert;
import org.junit.Test;

import io.FileIO;

import static org.mockito.Mockito.*;

public class ArrayOperationsTest {
	ArrayOperations ao = new ArrayOperations();
	public static String resourcesPath = "src/test/resources/";

	@Test
	public void test_findPrimesInFile_allFileDataValid() {
		MyMath mm = mock(MyMath.class);
		FileIO fileio = mock(FileIO.class);

		String filepath = resourcesPath.concat("numbers_valid.txt");

		when(fileio.readFile(filepath)).thenReturn(new int[] { 5, 7, 9, 19, 6, 15, 11 });

		when(mm.isPrime(5)).thenReturn(true);
		when(mm.isPrime(7)).thenReturn(true);
		when(mm.isPrime(9)).thenReturn(false);
		when(mm.isPrime(19)).thenReturn(true);
		when(mm.isPrime(6)).thenReturn(false);
		when(mm.isPrime(15)).thenReturn(false);
		when(mm.isPrime(11)).thenReturn(true);

		int[] expectedNumbers = new int[] { 5, 7, 19, 11 };
		Assert.assertArrayEquals(expectedNumbers, ao.findPrimesInFile(fileio, filepath, mm));

	}

	@Test
	public void test_findPrimesInFile_NotallFileDataValid() {
		MyMath mm = mock(MyMath.class);
		FileIO fileio = mock(FileIO.class);

		String filepath = resourcesPath.concat("invalid_input.txt");

		when(fileio.readFile(filepath)).thenReturn(new int[] { 1, 2, 3, 6, 9, 7786, 589539, -18, 9, 0, 4 });

		when(mm.isPrime(1)).thenThrow(IllegalArgumentException.class);
		when(mm.isPrime(2)).thenReturn(true);
		when(mm.isPrime(3)).thenReturn(true);
		when(mm.isPrime(6)).thenReturn(false);
		when(mm.isPrime(7786)).thenReturn(false);
		when(mm.isPrime(589539)).thenReturn(false);
		when(mm.isPrime(-18)).thenThrow(IllegalArgumentException.class);
		when(mm.isPrime(9)).thenReturn(false);
		when(mm.isPrime(0)).thenThrow(IllegalArgumentException.class);
		when(mm.isPrime(4)).thenReturn(false);

		int[] expectedNumbers = new int[] { 2, 3 };
		Assert.assertArrayEquals(expectedNumbers, ao.findPrimesInFile(fileio, filepath, mm));
	}

}
