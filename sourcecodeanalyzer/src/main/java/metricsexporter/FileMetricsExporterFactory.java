package metricsexporter;

/**
 * The purpose of this class is to create a factory to generate objects of type
 * FileMetricExporter based on given information.
 * 
 * @author AthinaDavari
 *
 */
public class FileMetricsExporterFactory {

	/**
	 * Return the type of FileMetricExporter we want to use to export metrics of a
	 * file.
	 * 
	 * @param outputType String the type of the output file we want to export
	 *                   metrics
	 * 
	 * @return FileMetricsExporter
	 * 
	 */
	public FileMetricsExporter createFileMetricsExporter(String outputType) {

		FileMetricsExporter fileexp;
		if (outputType.equals("csv")) {
			fileexp = new CsvMetricsExporter();
		} else if (outputType.equals("json")) {
			fileexp = new JsonMetricsExporter();
		} else {
			fileexp = new NullMetricsExporter();
		}

		return fileexp;

	}
}
