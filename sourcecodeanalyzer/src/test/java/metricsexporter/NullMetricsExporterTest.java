package metricsexporter;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class NullMetricsExporterTest {

	NullMetricsExporter nullexp = new NullMetricsExporter();
	
	@Test
	public void testWriteFile() {
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	    System.setErr(new PrintStream(errContent));
	    
	    Map<String, Integer> metrics = new HashMap<>();
		metrics.put("loc",30);
		metrics.put("nom",5);
		metrics.put("noc",2);
		
		String outputFilepath = "src/test/resources/output_metrics";
	    nullexp.writeFile(metrics, outputFilepath);

	    String expectedOutput  = "Operation aborted due to unknown export file.";

	     assertEquals(expectedOutput, errContent.toString().trim());
	}

}
