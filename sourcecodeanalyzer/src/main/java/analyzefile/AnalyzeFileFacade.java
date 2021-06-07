package analyzefile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import codeanalyzer.SourceCodeAnalyzer;
import metricsexporter.FileMetricsExporter;
import metricsexporter.FileMetricsExporterFactory;

/**
 * The purpose of this class is to hide the steps of the java file source code
 * analysis process from the client
 * 
 * @author AthinaDavari
 *
 */
public class AnalyzeFileFacade {

	/**
	 * This method reads a Java source code file, calculates the software metrics,
	 * exports these metrics to an output file.
	 * 
	 * @param filepath               The path where you can find the file
	 * @param sourceCodeAnalyzerType The code analyzer type you want to use (for
	 *                               example regex)
	 * @param sourceFileLocation     Where the Java source file is store (for
	 *                               example locally in your machine)
	 * @param outputFilePath         Where you want to store the output file with
	 *                               the name of the file in the end of the path
	 * @param outputFileType         The type of output file we want to export the
	 *                               metrics results
	 * 
	 * @throws IOException
	 */
	public void analyzeFileProcess(String filepath, String sourceCodeAnalyzerType, String sourceFileLocation,
			String outputFilePath, String outputFileType) throws IOException {

		SourceCodeAnalyzer analyzer = new SourceCodeAnalyzer(sourceFileLocation);
		int loc = analyzer.calculateLOC(filepath, sourceCodeAnalyzerType);
		int nom = analyzer.calculateNOM(filepath, sourceCodeAnalyzerType);
		int noc = analyzer.calculateNOC(filepath, sourceCodeAnalyzerType);

		Map<String, Integer> metrics = new HashMap<>();
		metrics.put("loc", loc);
		metrics.put("nom", nom);
		metrics.put("noc", noc);

		FileMetricsExporterFactory exporter = new FileMetricsExporterFactory();
		FileMetricsExporter fileexp = exporter.createFileMetricsExporter(outputFileType);
		fileexp.writeFile(metrics, outputFilePath);

	}
}
