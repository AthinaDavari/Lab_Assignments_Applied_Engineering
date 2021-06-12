package sourcecodeanalyzer;

import java.io.IOException;

import sourcefilereader.SourceFileLocation;
import sourcefilereader.SourceFileLocationFactory;

/**
 * The purpose of this class is to calculate the metrics of a Java source code
 * file with the given source code analyzer type.
 * 
 * @author AthinaDavari
 *
 */
public abstract class SourceCodeAnalyzerType {

	protected SourceFileLocation sourcefileloc;

	public SourceCodeAnalyzerType(String fileReaderType) {
		
		this.sourcefileloc = (new SourceFileLocationFactory()).createSourceFileLocation(fileReaderType);

	}

	/**
	 * Calculate the LOC (Lines Of Code) metric of a Java source code file with the
	 * given source code analyzer type.
	 * 
	 * @param filepath The file path in which the method will export the file with
	 *                 the results of the metrics calculations
	 * 
	 * @return int, metric result
	 */
	public abstract int calculateLOC(String filepath) throws IOException;

	/**
	 * Calculate the NOC (Number of Classes) Metric of a Java source code file with
	 * the given source code analyzer type.
	 * 
	 * @param filepath The file path in which the method will export the file with
	 *                 the results of the metrics calculations.
	 * 
	 * @return int, NOC metric result
	 */
	public abstract int calculateNOC(String filepath) throws IOException;

	/**
	 * Calculate the NOM (Number of Methods) Metric of a Java source code file with
	 * the given source code analyzer type.
	 * 
	 * @param filepath The file path in which the method will export the file with
	 *                 the results of the metrics calculations.
	 * 
	 * @return int, NOM metric result
	 */
	public abstract int calculateNOM(String filepath) throws IOException;

}
