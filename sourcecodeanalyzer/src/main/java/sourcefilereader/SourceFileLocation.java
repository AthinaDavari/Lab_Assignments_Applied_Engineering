package sourcefilereader;

import java.io.IOException;
import java.util.List;

/**
 * Retrieves (reads) the contents of a file from the given source file location.
 * 
 * @author AthinaDavari
 *
 */
public interface SourceFileLocation {

	/**
	 * Reads a file and returns its content in a single String.
	 * 
	 * @param filepath the url of the file
	 * 
	 * @return a String that contains the contents of the file
	 * 
	 * @throws IOException
	 */
	public String readFileIntoString(String filepath) throws IOException;

	/**
	 * Reads a file and returns its content in a List.
	 * 
	 * @param filepath the url of the file
	 * 
	 * @return a List that contains the contents of the file
	 * 
	 * @throws IOException
	 */
	public List<String> readFileIntoList(String filepath) throws IOException;
	
}
