package metricsexporter;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.doCallRealMethod;

public class JsonMetricsExporterTest {

	@Test
	public void testWriteFile() {
		
		JsonMetricsExporter mockedExporter = mock(JsonMetricsExporter.class);
		
		Map<String, Integer> metrics = new HashMap<>();
		metrics.put("loc",30);
		metrics.put("nom",5);
		metrics.put("noc",2);
		
		// generate and write the output file
		String outputFilepath = "src/test/resources/output_metrics";
		
		//this is a demo of how a mocked object can call a real method (partial mocking)
		doCallRealMethod().when(mockedExporter).writeFile(metrics, outputFilepath);
		mockedExporter.writeFile(metrics, outputFilepath);
		//just verify that the method was executed/called
		verify(mockedExporter).writeFile(metrics, outputFilepath);
	}
	
}
