package sourcecodeanalyzer;

import static org.junit.Assert.*;

import org.junit.Test;

public class SourceCodeAnalyzerFactoryTest {

	private final static String TEST_CLASS = "src/test/resources/TestClass.java";
	private SourceCodeAnalyzerFactory factory = new SourceCodeAnalyzerFactory();
	
	@Test
	public void testCreateSourceCodeAnalyzerType_inputRegex() {
		SourceCodeAnalyzerType analyzer = factory.createSourceCodeAnalyzerType("regex", TEST_CLASS);
		assertTrue(analyzer instanceof Regex);
	}

	@Test
	public void testCreateSourceCodeAnalyzerType_inputStrcomp() {
		SourceCodeAnalyzerType analyzer = factory.createSourceCodeAnalyzerType("strcomp", TEST_CLASS);
		assertTrue(analyzer instanceof Strcomp);
	}
	
	@Test
	public void testCreateSourceCodeAnalyzerType_invalidInput() {
		SourceCodeAnalyzerType analyzer = factory.createSourceCodeAnalyzerType("foo", TEST_CLASS);
		assertTrue(analyzer instanceof NullSourceCodeAnalyzerType);
	}
}
