package math;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import io.FileIO;

/**
 * ArrayOperations provides simple operation that return the prime numbers of a
 * file.
 * 
 * @author AthinaDavari
 *
 */
public class ArrayOperations {

	/**
	 * This function generates an array of numbers from a file, and returns a new
	 * array that contains only its prime numbers of the array with the file inputs.
	 * 
	 * @param fileIo   object of the FileIO class
	 * @param filepath the file that contains the numbers
	 * @param myMath   object of the MyMath class
	 * @return an array that contains only prime numbers of the file
	 */
	int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
		int[] inputData = fileIo.readFile(filepath);
		List<Integer> data = Arrays.stream(inputData).boxed().collect(Collectors.toList());
		return data.stream().filter(x -> {
			try {
				return myMath.isPrime(x);
			} catch (IllegalArgumentException e) {
				return false;
			}
		}).mapToInt(i -> i).toArray();
	}
}
