/**
 * 
 */
package com.YomiOluwadara.ReadingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author OO046152 : Yomi Oluwadara
 * 
 *         COMMENTS:
 * 
 *         Read a .txt and write it to console.
 * 
 *         Use an object of the file class to specify the location of the file
 *         to be read. Use an object of the scanner class to invoke the
 *         appropriate scanner class method that read the file line by line
 * 
 *         hasNextLine() :returns true if the next line is not empty nextLine():
 *         prints the next string
 * 
 * 
 */
public class ReadFileByScanner {

	public void readTextFile() {
		File file = new File("C:\\Users\\oo046152\\mytestfile.txt");
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		ReadFileByScanner ReadFileByScannerObj = new ReadFileByScanner();
		ReadFileByScannerObj.readTextFile();

	}

}
