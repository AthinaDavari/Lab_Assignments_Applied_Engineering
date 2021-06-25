package metricsexporter;

import static org.junit.Assert.*;
import org.junit.Test;

public class FileMetricsExporterFactoryTest {

	FileMetricsExporterFactory factory = new FileMetricsExporterFactory();

	@Test
	public void testCreateFileMetricsExporter_csvStringInput() {
		FileMetricsExporter fileexp = factory.createFileMetricsExporter("csv");
		assertTrue(fileexp instanceof CsvMetricsExporter);
	}

	@Test
	public void testCreateFileMetricsExporter_jsonStringInput() {
		FileMetricsExporter fileexp = factory.createFileMetricsExporter("json");
		assertTrue(fileexp instanceof JsonMetricsExporter);
	}

	@Test
	public void testCreateFileMetricsExporter_invalidInput() {
		FileMetricsExporter fileexp = factory.createFileMetricsExporter("foo");
		assertTrue(fileexp instanceof NullMetricsExporter);
	}

}
