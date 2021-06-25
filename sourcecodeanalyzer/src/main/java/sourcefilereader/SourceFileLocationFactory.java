package sourcefilereader;

/**
 * The purpose of this class is to create a factory to generate objects of type
 * SourceFileLocation based on given information.
 * 
 * @author AthinaDavari
 *
 */
public class SourceFileLocationFactory {

	/**
	 * Return the type of SourceFileLocation of the given source file location.
	 * 
	 * @param sourceFileLocation String, the type of the given source file location.
	 * 
	 * @return SourceFileLocation
	 * 
	 */
	public SourceFileLocation createSourceFileLocation(String sourceFileLocation) {

		if (sourceFileLocation.equals("web")) {
			return new WebFile();
		} else if (sourceFileLocation.equals("local")) {
			return new LocalDiviceFile();
		} else {
			return new NullFileLocation();
		}

	}
}
