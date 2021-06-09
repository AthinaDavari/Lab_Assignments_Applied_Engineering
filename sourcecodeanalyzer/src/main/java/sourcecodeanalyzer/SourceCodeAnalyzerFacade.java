package sourcecodeanalyzer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * The purpose of this class is to hide the steps of calculating all analysis' metrics.
 * 
 * @author AthinaDavari
 *
 */
public class SourceCodeAnalyzerFacade {

	/**
	 * Calculate all source code metrics values based on given source code analyzer
	 * type.
	 * 
	 * @param sourceFileLocation     Where the Java source file is store
	 * @param filepath               The url of the file
	 * @param sourceCodeAnalyzerType The code analyzer type you want to use
	 * 
	 * @return Map<String, Integer> The names and the values of the calculated
	 *         metrics
	 * 
	 * @throws IOException
	 */
	public Map<String, Integer> calculateMetrics(String sourceFileLocation, String filepath,
			String sourceCodeAnalyzerType) throws IOException {

		int loc = -1;
		int nom = -1;
		int noc = -1;

		SourceCodeAnalyzerFactory factory = new SourceCodeAnalyzerFactory();
		SourceCodeAnalyzerType type = factory.createSourceCodeAnalyzerType(sourceCodeAnalyzerType, sourceFileLocation);

		loc = type.calculateLOC(filepath);
		nom = type.calculateNOM(filepath);
		noc = type.calculateNOC(filepath);

		Map<String, Integer> metrics = new HashMap<>();
		metrics.put("loc", loc);
		metrics.put("nom", nom);
		metrics.put("noc", noc);

		return metrics;
	}
}
