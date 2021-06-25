package metricsexporter;

import java.util.Map;

/**
 * The purpose of this interface is to give a specific structure to the classes
 * which are responsible for export the result of the metrics in a concrete file
 * type.
 * 
 * @author AthinaDavari
 *
 */
public interface FileMetricsExporter {

	/**
	 * Export the result of the metrics' calculation on a concrete file type.
	 * 
	 * @param metrics  a map object with the names of metrics and its results
	 * @param filepath the file path in which the method will export the file with
	 *                 the results of the metrics calculations
	 */
	void writeFile(Map<String, Integer> metrics, String filepath);

}
