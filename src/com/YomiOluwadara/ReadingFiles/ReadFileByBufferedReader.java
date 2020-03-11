/**
 * 
 */
package com.YomiOluwadara.ReadingFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author OO046152 : Yomi Oluwadara
 * 
 *         We need to provide file path as the parameter: double backquote is to
 *         avoid compiler interpret words like \test as \t (ie. as a escape
 *         sequence)
 * 
 *         File: Create an instance of the File class and use that to specify
 *         the location of the file to be read
 *
 */
public class ReadFileByBufferedReader {

	public void readMyFile() {
		String str;
		File filetoRead = new File("C:\\Users\\oo046152\\mytestfile.txt");
		try {
			BufferedReader brObj = new BufferedReader(new FileReader(filetoRead));
			while ((str = brObj.readLine()) != null)

				;
			System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		ReadFileByBufferedReader classobj = new ReadFileByBufferedReader();
		classobj.readMyFile();

	}

}
