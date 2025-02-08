/**
 * 
 */
package learn.file;

import java.io.FileOutputStream;

/**
 * @author rohithvazhathody
 */
public class ExampleFileOutputStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("/Users/rohithvazhathody/Documents/Tryout.txt");
			int singleByte = 65;
			fileOutputStream.write(singleByte);
			byte[] byteArray = "Adding some strings and sending as bytes".getBytes();
			fileOutputStream.write(byteArray);

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

}
