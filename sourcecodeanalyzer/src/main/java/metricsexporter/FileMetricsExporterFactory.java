package metricsexporter;

import java.util.Map;

public class FileMetricsExporterFactory {

	public void createFileMetricsExporter(String outputType, Map<String, Integer> metrics, String filepath) {
	
		if (outputType.equals("csv")) {
			new CsvMetricsExporter();
		} else if (outputType.equals("json")) {
			new JsonMetricsExporter();
		} else {
			new NullMetricsExporter();
		}
		
	}
}
