package sourcefilereader;

import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NullFileLocationTest {

	private NullFileLocation nullloc = new NullFileLocation();

	@Rule
	public final ExpectedException thrown = ExpectedException.none();

	@Test
	public void testReadFileIntoList_illegalArgumentException() throws IOException {
		// give a none existing type to cause a null List return
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Unknown source location type");
		nullloc.readFileIntoList("any-filepath");

	}

	@Test
	public void testReadFileIntoString_illegalArgumentException() throws IOException {
		// give a none existing type to cause a null String return
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Unknown source location type");
		nullloc.readFileIntoString("any-filepath");

	}

}
