package metricsexporter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The purpose of this call is to export (writes) the metrics to a given output,
 * csv format.
 * 
 * @author AthinaDavari
 *
 */
public class CsvMetricsExporter implements FileMetricsExporter {

	/**
	 * Export the result of the metrics' calculation on a csv file.
	 * 
	 * @param metrics  a map object with the names of metrics and its results
	 * @param filepath the file path in which the method will export the .csv file with
	 *                 the results of the metrics calculations
	 * 
	 */
	@Override
	public void writeFile(Map<String, Integer> metrics, String filepath) {
		File outputFile = new File(filepath + ".csv");
		StringBuilder metricsNames = new StringBuilder();
		StringBuilder metricsValues = new StringBuilder();

		for (Map.Entry<String, Integer> entry : metrics.entrySet()) {
			metricsNames.append(entry.getKey() + ",");
			metricsValues.append(entry.getValue() + ",");
		}

		try {
			FileWriter writer = new FileWriter(outputFile);
			writer.append(metricsNames + "\n");
			writer.append(metricsValues + "\n");
			writer.close();
			System.out.println("Metrics saved in " + outputFile.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
