package sourcecodeanalyzer;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The purpose of this class is to calculate the metrics of a Java source code
 * file with regex (with the use of regular expressions) source code analyzer
 * type.
 * 
 * @author AthinaDavari
 *
 */
public class Regex extends SourceCodeAnalyzerType {

	public Regex(String sourcefileloc) throws IOException {
		super(sourcefileloc);
	}

	/**
	 * Calculate the LOC (Lines Of Code) Metric of a Java source code file with
	 * regex (with the use of regular expressions).
	 * 
	 * @param filepath the file path in which the method will export the file with
	 *                 the results of the metrics calculations
	 * 
	 * @return int, LOC metric result
	 */
	@Override
	public int calculateLOC(String filepath) throws IOException {

		String sourceCode = sourcefileloc.readFileIntoString(filepath);
		Pattern pattern = Pattern.compile("((//.*)|(/\\*.*)|(\\*+.*))");
		Matcher nonCodeLinesMatcher = pattern.matcher(sourceCode);

		int nonCodeLinesCounter = 0;
		while (nonCodeLinesMatcher.find()) {
			nonCodeLinesCounter++;
		}

		int sourceFileLength = sourceCode.split("\n").length;
		int loc = sourceFileLength - nonCodeLinesCounter;

		return loc;

	}

	/**
	 * Calculate the NOC (Number of Classes) Metric of a Java source code file with
	 * regex (with the use of regular expressions).
	 * 
	 * @param filepath The file path in which the method will export the file with
	 *                 the results of the metrics calculations.
	 * 
	 * @return int, NOC metric result
	 */
	@Override
	public int calculateNOC(String filepath) throws IOException {

		String sourceCode = sourcefileloc.readFileIntoString(filepath);
		Pattern pattern = Pattern.compile(".*\\s*class\\s+.*");
		Matcher classSignatures = pattern.matcher(sourceCode);

		int classCounter = 0;
		while (classSignatures.find()) {
			classCounter++;
		}

		return classCounter;

	}

	/**
	 * Calculate the NOM (Number of Methods) Metric of a Java source code file with
	 * regex (with the use of regular expressions).
	 * 
	 * @param filepath The file path in which the method will export the file with
	 *                 the results of the metrics calculations.
	 * 
	 * @return int, NOM metric result
	 */
	@Override
	public int calculateNOM(String filepath) throws IOException {

		String sourceCode = sourcefileloc.readFileIntoString(filepath);
		Pattern pattern = Pattern.compile(
				".*(public |protected |private |static )?[\\w\\<\\>\\[\\]]+\\s+(\\w+) *\\([^\\)]*\\) *(\\{?|[^;]).*");
		Matcher methodSignatures = pattern.matcher(sourceCode);

		int methodCounter = 0;
		while (methodSignatures.find()) {
			methodCounter++;
		}

		return methodCounter;

	}

}
