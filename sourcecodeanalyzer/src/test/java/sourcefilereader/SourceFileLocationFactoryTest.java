package sourcefilereader;

import static org.junit.Assert.*;

import org.junit.Test;

public class SourceFileLocationFactoryTest {

	private SourceFileLocationFactory factory = new SourceFileLocationFactory();
	
	@Test
	public void testCreateSourceCodeAnalyzerType_inputWeb() {
		SourceFileLocation loc = factory.createSourceFileLocation("web");
		assertTrue(loc instanceof WebFile);
	}

	@Test
	public void testCreateSourceCodeAnalyzerType_inputLocal() {
		SourceFileLocation loc = factory.createSourceFileLocation("local");
		assertTrue(loc instanceof LocalDiviceFile);
	}
	
	@Test
	public void testCreateSourceCodeAnalyzerType_invalidInput() {
		SourceFileLocation loc = factory.createSourceFileLocation("foo");
		assertTrue(loc instanceof NullFileLocation);
	}

}
