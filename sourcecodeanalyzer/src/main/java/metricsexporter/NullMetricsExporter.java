package metricsexporter;

import java.util.Map;

public class NullMetricsExporter implements FileMetricsExporter{

	public void writeFile(Map<String, Integer> metrics, String filepath) {
		
		System.err.println("Operation aborted due to unknown export file.");
		
	}
	
}
