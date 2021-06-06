package metricsexporter;

import java.util.Map;

public interface FileMetricsExporter {
	
	void writeFile(Map<String, Integer> metrics, String filepath);
	
}
