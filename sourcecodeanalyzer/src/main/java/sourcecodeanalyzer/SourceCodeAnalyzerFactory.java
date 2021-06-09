package sourcecodeanalyzer;

import java.io.IOException;

/**
 * The purpose of this class is to create a factory to to generate objects of
 * type SourceCodeAnalyzerType based on given information.
 * 
 * @author AthinaDavari
 *
 */
public class SourceCodeAnalyzerFactory {

	/**
	 * Return the type of SourceCodeAnalyzerType of the given source code analyzer
	 * type.
	 * 
	 * @param sourceCodeAnalyzerType String, the source code analyzer type you want to use
	 * @param sourceFileLocation String, the type of the given source file location.
	 * 
	 * @return SourceCodeAnalyzerType
	 * 
	 * @throws IOException
	 */
	public SourceCodeAnalyzerType createSourceCodeAnalyzerType(String sourceCodeAnalyzerType, String sourceFileLocation) throws IOException {

		if (sourceCodeAnalyzerType.equals("regex")) {
			return new Regex(sourceFileLocation);
		} else if (sourceCodeAnalyzerType.equals("strcomp")) {
			return new Strcomp(sourceFileLocation);
		} else {
			return new NullSourceCodeAnalyzerType(sourceFileLocation);
		}

	}
}
