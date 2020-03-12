package com.YomiOluwadara.ReadingTXTFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*Notes:
 *  @author OO046152 : Yomi Oluwadara
 * 
 * read file from one location and save it to a different location
 * 
 * 
 *         Use an object of the file class to specify the location of the file
 *         to be read. Use an object of the scanner class to invoke the
 *         appropriate scanner class method that read the file line by line
 *         
 *         Declare a String variable to hold the new file
 *        	use the  concat() to concat each line of the file together + "\n", then use
 *        		each line is read using the hasNextLine()
 *         use an Object of the FileWritter class to write to a specified location to save file
 *         use an Object of the FileWritter class to invoke the write()
 *         use an Object of the FileWritter class to invoke the close()
 *          
 */

public class ReadFileByScannerAndSaveFileToAlocation {

	public void readFileAndWriteIt() {
		// specifies location of file to read and using scanner obj to read file
		File file = new File("C:\\Users\\oo046152\\mytestfile.txt");
		try {
			Scanner scanner = new Scanner(file);
			// variable to hold new file
			String newFile = "";
			while (scanner.hasNextLine()) {
				// storing the content of input file to a file that will be exported
				newFile = newFile.concat(scanner.nextLine() + "\n");
				// Using the FileWriter object to specify location,write and close file
				FileWriter fileWriter = new FileWriter("C:\\Users\\oo046152\\Desktop\\fileFromJava.txt");
				fileWriter.write(newFile);
				fileWriter.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File to be read cannot be found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Could you not to file");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		ReadFileByScannerAndSaveFileToAlocation obj = new ReadFileByScannerAndSaveFileToAlocation();
		obj.readFileAndWriteIt();
	}

}
