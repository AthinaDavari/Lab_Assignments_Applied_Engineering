package sourcecodeanalyzer;

import java.io.IOException;
import java.util.List;

/**
 * The purpose of this class is to calculate the metrics of a Java source code
 * file with strcomp (with the use of string comparison) source code analyzer
 * type.
 * 
 * @author AthinaDavari
 *
 */
public class Strcomp extends SourceCodeAnalyzerType {

	public Strcomp(String sourcefileloc) throws IOException {
		super(sourcefileloc);
	}

	/**
	 * Calculate the LOC (Lines Of Code) Metric of a Java source code file with
	 * strcomp (with the use of string comparison).
	 * 
	 * @param filepath the file path in which the method will export the file with
	 *                 the results of the metrics calculations
	 * 
	 * @return int, LOC metric result
	 */
	@Override
	public int calculateLOC(String filepath) throws IOException {

		List<String> sourceCodeList = sourcefileloc.readFileIntoList(filepath);
		int nonCodeLinesCounter = 0;
		for (String line : sourceCodeList) {
			line = line.trim(); // clear all leading and trailing white spaces
			if (line.startsWith("//") || line.startsWith("/*") || line.startsWith("*") || line.equals("{")
					|| line.equals("}") || line.equals(""))
				nonCodeLinesCounter++;
		}
		int loc = sourceCodeList.size() - nonCodeLinesCounter;
		return loc;
	}

	/**
	 * Calculate the NOC (Number of Classes) Metric of a Java source code file with
	 * strcomp (with the use of string comparison).
	 * 
	 * @param filepath The file path in which the method will export the file with
	 *                 the results of the metrics calculations.
	 * 
	 * @return int, NOC metric result
	 */
	@Override
	public int calculateNOC(String filepath) throws IOException {

		List<String> sourceCodeList = sourcefileloc.readFileIntoList(filepath);
		int classCounter = 0;
		for (String line : sourceCodeList) {
			line = line.trim(); // remove leading and trailing white spaces
			if ((line.startsWith("class ") || line.contains(" class ")) && line.contains("{")) {
				classCounter++;
			}
		}

		return classCounter;

	}

	/**
	 * Calculate the NOM (Number of Methods) Metric of a Java source code file with
	 * strcomp (with the use of string comparison).
	 * 
	 * @param filepath The file path in which the method will export the file with
	 *                 the results of the metrics calculations.
	 * 
	 * @return int, NOM metric result
	 */
	@Override
	public int calculateNOM(String filepath) throws IOException {

		List<String> sourceCodeList = sourcefileloc.readFileIntoList(filepath);
		int methodCounter = 0;
		for (String line : sourceCodeList) {
			line = line.trim(); // clear all leading and trailing white spaces
			if (((line.contains("public") || line.contains("private") || line.contains("protected"))
					|| line.contains("void") || line.contains("int") || line.contains("String")) && line.contains("(")
					&& line.contains(")") && line.contains("{"))
				methodCounter++;
		}
		return methodCounter;

	}

}
