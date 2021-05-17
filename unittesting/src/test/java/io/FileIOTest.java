package io;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FileIOTest {
	FileIO fileio = new FileIO();
	public static String resourcesPath = "src/test/resources/";

	@Test
	public void test_readFile_validInput() {
		int[] expectedNumbers = new int[] { 1, 2, 5, 6, 7, 8, 19 };
		String validInputFilepath = resourcesPath.concat("numbers_valid.txt");

		Assert.assertArrayEquals(expectedNumbers, fileio.readFile(validInputFilepath));
	}

	@Rule
	public final ExpectedException thrown = ExpectedException.none();

	@Test
	public void test_readFile_invalidInput_illegalArgumentException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Input file does not exist");
		String validInputFilepath = resourcesPath.concat("abc.txt");
		fileio.readFile(validInputFilepath);
	}

	@Test
	public void test_readFile_emptyFile_illegalArgumentException() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Given file is empty");
		String validInputFilepath = resourcesPath.concat("empty_file_invalid.txt");
		fileio.readFile(validInputFilepath);
	}

	@Test
	public void testReadFileContainsInvalidEntries() {
		int[] expectedNumbers = new int[] { 1, 2, 3, 6, 9, 7786, 589539, -18, 9, 0, 4 };
		String validInputFilepath = resourcesPath.concat("invalid_input.txt");

		Assert.assertArrayEquals(expectedNumbers, fileio.readFile(validInputFilepath));
	}
}
