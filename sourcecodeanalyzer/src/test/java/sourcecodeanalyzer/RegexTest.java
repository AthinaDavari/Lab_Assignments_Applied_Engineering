package sourcecodeanalyzer;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class RegexTest {

	private final static String TEST_CLASS = "src/test/resources/TestClass.java";
	private Regex regexlocal = new Regex("local");
	
	@Test
	public void testCalculateLOC_LocalSourceFileLocation() throws IOException {
		assertEquals(21, regexlocal.calculateLOC(TEST_CLASS));
	}
	
	@Test
	public void testCalculateNOC_LocalSourceFileLocation() throws IOException {
		assertEquals(3, regexlocal.calculateNOC(TEST_CLASS));
	}
	
	@Test
	public void testCalculateNOM_LocalSourceFileLocation() throws IOException {
		assertEquals(3, regexlocal.calculateNOM(TEST_CLASS));
	}
	
	
}
