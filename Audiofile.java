
public class Audiofile {
	String path;
	String file;

	void parsePathname(String pathfile) {
		pathfile.trim();
//		getting the last "file.mp3"
		int fileIndex;
		fileIndex = pathfile.lastIndexOf("file.mp3");

		if (pathfile.charAt(fileIndex + 7) != '\0') {
			file = pathfile.substring(fileIndex);
		} else {
			file = "";
		}
//		testing path	
		path = pathfile;
	}

	String getPathname() {
		return this.path;
	}

	String getFilename() {

		return file;
	}

	Audiofile() {

	}

}
