package sourcecodeanalyzer;

import java.io.IOException;

/**
 * The purpose of this class is to handle the cases when the user gives a source
 * code analyzer type, which is not supported not by the software.
 * 
 * @author AthinaDavari
 *
 */
public class NullSourceCodeAnalyzerType extends SourceCodeAnalyzerType {

	public NullSourceCodeAnalyzerType(String sourcefileloc) {
		super(sourcefileloc);
	}

	/**
	 * Handles the cases when the user asks for an invalid source code analyzer
	 * type, which is not supported and wants to calculate the LOC (Lines of Code).
	 * 
	 * @param filepath The file path in which the method will export the file with
	 *                 the results of the metrics calculations.
	 * 
	 * @return int, LOC metric result
	 */
	@Override
	public int calculateLOC(String filepath) throws IOException {
		throw new IllegalArgumentException("Unknown source code analyzer type.");
	}

	/**
	 * Handles the cases when the user asks for an invalid source code analyzer
	 * type, which is not supported and wants to calculate the NOC (Number of
	 * Classes).
	 * 
	 * @param filepath The file path in which the method will export the file with
	 *                 the results of the metrics calculations.
	 * 
	 * @return int, NOC metric result
	 */
	@Override
	public int calculateNOC(String filepath) throws IOException {
		throw new IllegalArgumentException("Unknown source code analyzer type.");
	}

	/**
	 * Handles the cases when the user asks for an invalid source code analyzer
	 * type, which is not supported and wants to calculate the NOM (Number of
	 * Methods).
	 * 
	 * @param filepath The file path in which the method will export the file with
	 *                 the results of the metrics calculations.
	 * 
	 * @return int, NOM metric result
	 */
	@Override
	public int calculateNOM(String filepath) {
		throw new IllegalArgumentException("Unknown source code analyzer type.");
	}

}
