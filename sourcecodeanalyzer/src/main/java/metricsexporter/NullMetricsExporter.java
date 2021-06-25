package metricsexporter;

import java.util.Map;

/**
 * The purpose of this class is to handle the cases when the user give file type
 * to export the metrics, which is not supported not by the software.
 * 
 * @author AthinaDavari
 *
 */
public class NullMetricsExporter implements FileMetricsExporter {

	/**
	 * Handles the cases when the user asks for an invalid file type or a file type
	 * not supported to export the result of the metrics' calculations.
	 * 
	 * @param metrics  a map object with the names of metrics and its results.
	 * @param filepath the file path in which the method the user wants to export
	 *                 with the results of the metrics calculations.
	 * 
	 */
	@Override
	public void writeFile(Map<String, Integer> metrics, String filepath) {

		System.err.println("Operation aborted due to unknown export file.");

	}

}
