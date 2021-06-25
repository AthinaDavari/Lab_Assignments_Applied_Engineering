package sourcecodeanalyzer;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


import static org.mockito.Mockito.mock;

public class SourceCodeAnalyzerFacadeTest {

	private final static String TEST_CLASS_LOCAL = "src/test/resources/TestClass.java";
	private final static String TEST_CLASS_WEB = "https://drive.google.com/uc?export=download&id=1z51FZXqPyun4oeB7ERFlOgfcoDfLLLhg";
	private SourceCodeAnalyzerFacade facade = new SourceCodeAnalyzerFacade();

	@Test
	public void testCalculateMetrics_regexAnalyzerandLocalFileLocation() throws IOException {
		String location = "local";
		String analyzerType = "regex";

		Map<String, Integer> actualMetrics = facade.calculateMetrics(location, TEST_CLASS_LOCAL, analyzerType);

		Map<String, Integer> expectedMetrics = new HashMap<>();
		expectedMetrics.put("loc", 21);
		expectedMetrics.put("nom", 3);
		expectedMetrics.put("noc", 3);

		assertEquals(expectedMetrics, actualMetrics);

	}

	@Test
	public void testCalculateMetrics_strcompAnalyzerandLocalFileLocation() throws IOException {
		String location = "local";
		String analyzerType = "strcomp";

		Map<String, Integer> actualMetrics = facade.calculateMetrics(location, TEST_CLASS_LOCAL, analyzerType);
		
		Map<String, Integer> expectedMetrics = new HashMap<>();
		expectedMetrics.put("loc", 7);
		expectedMetrics.put("nom", 3);
		expectedMetrics.put("noc", 3);
		
		assertEquals(expectedMetrics, actualMetrics);
	}
	
	@Test
	public void testCalculateMetrics_regexAnalyzerandWebFileLocation() throws IOException {
		String location = "web";
		String analyzerType = "regex";

		SourceCodeAnalyzerType type = mock(Regex.class);
		

		Map<String, Integer> actualMetrics = facade.calculateMetrics(location, TEST_CLASS_WEB, analyzerType);

		Map<String, Integer> expectedMetrics = new HashMap<>();
		expectedMetrics.put("loc", 21);
		expectedMetrics.put("nom", 3);
		expectedMetrics.put("noc", 3);

		assertEquals(expectedMetrics, actualMetrics);

	}
	
	@Test
	public void testCalculateMetrics_strcompAnalyzerandWebFileLocation() throws IOException {
		String location = "web";
		String analyzerType = "strcomp";

		Map<String, Integer> actualMetrics = facade.calculateMetrics(location, TEST_CLASS_WEB, analyzerType);
		
		Map<String, Integer> expectedMetrics = new HashMap<>();
		expectedMetrics.put("loc", 7);
		expectedMetrics.put("nom", 3);
		expectedMetrics.put("noc", 3);
		
		assertEquals(expectedMetrics, actualMetrics);
	}

}
