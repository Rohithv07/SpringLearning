/**
 * 
 */
package learn.file;

import java.io.FileInputStream;

/**
 * @author rohithvazhathody
 */
public class ExampleFileInputStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileInputStream fileInputStream = null;
		try {
			// open file
			fileInputStream = new FileInputStream("/Users/rohithvazhathody/Documents/Tryout.txt");
			int byteData;
			while ((byteData = fileInputStream.read()) != -1) {
				System.out.print((char) byteData);
			}

		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
	}

}
