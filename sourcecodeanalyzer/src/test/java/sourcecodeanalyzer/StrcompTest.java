package sourcecodeanalyzer;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class StrcompTest {

	private final static String TEST_CLASS = "src/test/resources/TestClass.java";
	private Strcomp strcomplocal = new Strcomp("local");
	
	@Test
	public void testCalculateLOC_LocalSourceFileLocation() throws IOException {
		assertEquals(7, strcomplocal.calculateLOC(TEST_CLASS));
	}
	
	@Test
	public void testCalculateNOC_LocalSourceFileLocation() throws IOException {
		assertEquals(3, strcomplocal.calculateNOC(TEST_CLASS));
	}
	
	@Test
	public void testCalculateNOM_LocalSourceFileLocation() throws IOException {
		assertEquals(3, strcomplocal.calculateNOM(TEST_CLASS));
	}

}
