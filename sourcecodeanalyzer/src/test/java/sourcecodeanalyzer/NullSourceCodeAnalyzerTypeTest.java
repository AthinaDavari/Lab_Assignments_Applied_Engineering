package sourcecodeanalyzer;

import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NullSourceCodeAnalyzerTypeTest {

	private final static String TEST_CLASS = "src/test/resources/TestClass.java";
	private NullSourceCodeAnalyzerType nullanalyzertypelocal = new NullSourceCodeAnalyzerType("local");
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();

	@Test
	public void testCalculateLOC_LocalSourceFileLocation_illegalArgumentException() throws IOException {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Unknown source code analyzer type.");
		nullanalyzertypelocal.calculateLOC(TEST_CLASS);
	}
	
	@Test
	public void testCalculateNOC_LocalSourceFileLocation() throws IOException {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Unknown source code analyzer type.");
		nullanalyzertypelocal.calculateNOC(TEST_CLASS);
	}
	
	@Test
	public void testCalculateNOM_LocalSourceFileLocation() throws IOException {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Unknown source code analyzer type.");
		nullanalyzertypelocal.calculateNOM(TEST_CLASS);
	}
}
