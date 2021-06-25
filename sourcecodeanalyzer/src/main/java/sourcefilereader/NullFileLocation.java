package sourcefilereader;

import java.io.IOException;
import java.util.List;

/**
 * The purpose of this class is to handle the cases when the user give source
 * file location type, which is not supported not by the software.
 * 
 * @author AthinaDavari
 *
 */
public class NullFileLocation implements SourceFileLocation {

	/**
	 * Handles the cases when the user asks for an invalid source file location type
	 * not supported.
	 * 
	 * @param filepath The url of the file
	 * 
	 */
	@Override
	public String readFileIntoString(String filepath) throws IOException {
		throw new IllegalArgumentException("Unknown source location type");
	}

	/**
	 * Handles the cases when the user asks for an invalid source file location type
	 * not supported.
	 * 
	 * @param filepath The url of the file
	 * 
	 */
	@Override
	public List<String> readFileIntoList(String filepath) throws IOException {
		throw new IllegalArgumentException("Unknown source location type");
	}

}
