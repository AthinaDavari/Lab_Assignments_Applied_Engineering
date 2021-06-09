package sourcefilereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Retrieves (reads) the contents of a given file on web. location.
 * 
 * @author AthinaDavari
 *
 */
public class WebFile implements SourceFileLocation {

	/**
	 * Reads a file on web and returns its content in a single String.
	 * 
	 * @param filepath The url of the file
	 * 
	 * @return a String that contains the contents of the file
	 * 
	 * @throws IOException
	 */
	@Override
	public String readFileIntoString(String filepath) throws IOException {

		StringBuilder sb = new StringBuilder();
		URL url = new URL(filepath);
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		String line = null;
		while ((line = reader.readLine()) != null) {
			sb.append(line + "\n");
		}
		reader.close();
		return sb.toString();
	}

	/**
	 * Reads a file on web and returns its content in a List.
	 * 
	 * @param filepath The url of the file
	 * 
	 * @return a List that contains the contents of the file
	 * 
	 * @throws IOException
	 */
	@Override
	public List<String> readFileIntoList(String filepath) throws IOException {

		List<String> lines = new ArrayList<>();
		URL url = new URL(filepath);
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		String line = null;
		while ((line = reader.readLine()) != null) {
			lines.add(line);
		}
		reader.close();
		return lines;

	}

}
