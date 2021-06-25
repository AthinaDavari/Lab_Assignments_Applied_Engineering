package metricsexporter;

import java.util.Map;

/**
 * The purpose of this call is to export (writes) the metrics to a given output,
 * json format.
 * 
 * @author AthinaDavari
 *
 */
public class JsonMetricsExporter implements FileMetricsExporter {

	/**
	 * Export the result of the metrics' calculation on a json file.
	 * 
	 * @param metrics  a map object with the names of metrics and its results
	 * @param filepath the file path in which the method will export the .json file
	 *                 with the results of the metrics calculations
	 * 
	 */
	@Override
	public void writeFile(Map<String, Integer> metrics, String filepath) {
		// Functionality not implemented yet
		// No need to implement it for the assignment
	}
}
