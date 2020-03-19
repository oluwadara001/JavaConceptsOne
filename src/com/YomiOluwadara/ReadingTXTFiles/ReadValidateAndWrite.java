/**
 * 
 */
package com.YomiOluwadara.ReadingTXTFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author OO046152 : Yomi Oluwadara
 * 
 *         Actions:
 * 
 *         1. checkFile() : If file exists, call validateContent() else call
 *         customeMessage():
 * 
 *         userChoice()
 * 
 *         2. validateContent(): if word "obafemi" is file,call readOAU() else
 *         call readAllUniversities() (either of them then calls witeFile(),
 * 
 */
public class ReadValidateAndWrite {
	private int userChoice;

	public int getUserChoice() {
		return userChoice;
	}

	public void setUserChoice(int userChoice) {
		this.userChoice = userChoice;
	}

	public ReadValidateAndWrite() {

	}

	// checks if the file to be read exists in the file structure
	public void checkFile() {
		File file = new File("C:\\Users\\oo046152\\mytestfile.txt");
		try {
			Scanner scanner = new Scanner(file);
			if (scanner.hasNextLine()) {
				System.out.println("File to be read has been found, data ingestion begins.....");
				userChoice();

			} else {
				System.out.println("File not found");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	void userChoice() {
		System.out.println("What would you like to do ? ");
		System.out.println("Enter '1' to validate the content of the file ");
		System.out.println("Enter '2' to exit the service");
		// using the setter method to set user choice
		setUserChoice(new Scanner(System.in).nextInt());

		switch (getUserChoice()) {

		case 1:
			validateFileAndWriteIt();
			break;
		case 2:
			exitSystem();
			break;
		}

	}

	void exitSystem() {
		System.out.println(" You have decided to exit the system, exiting.......");
	}

//ingests the file and do some checks
	public void validateFileAndWriteIt() {
		System.out.println("test-printing from validate content");
		File file = new File("C:\\Users\\oo046152\\mytestfile.txt");
		try {
			Scanner scanner = new Scanner(file);
			// variable to hold a sentence read from the i/p file
			final String wordToFind = "NIGERIA";
			String newFile = "";
			while (scanner.nextLine().contains(wordToFind) && scanner.hasNextLine()) {
				newFile = newFile.concat(scanner.nextLine() + "/n");
				System.out.println("test-printing from validate and write file method");

			}
			try {
				FileWriter outPutFile = new FileWriter("C:\\Users\\oo046152\\mytestfile2.txt");
				outPutFile.write(newFile);
				outPutFile.flush();
				outPutFile.close();

			} catch (IOException e) {
				System.out.println("file written succesfully");
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	/*
	 * public void readOAU() { System.out.println("from read oau"); String newfile =
	 * ""; File file = new File("C:\\Users\\oo046152\\mytestfile.txt"); try {
	 * Scanner scanner = new Scanner(file); while (scanner.hasNextLine()) { newfile
	 * = newfile.concat(scanner.nextLine() + "/n"); try { FileWriter outputFile =
	 * new FileWriter("C:\\Users\\oo046152\\Desktop\\fileFromJava2.txt");
	 * outputFile.write(newfile); outputFile.flush(); outputFile.close();
	 * System.out.println(
	 * "File has been writen to  'C:\\\\Users\\\\oo046152\\\\Desktop\\\\fileFromJava2.txt' "
	 * );
	 * 
	 * } catch (IOException e) {
	 * System.out.println("Error writing file to specified location");
	 * e.printStackTrace(); }
	 * 
	 * } } catch (FileNotFoundException e) { System.out.println("File not found");
	 * e.printStackTrace();
	 * 
	 * }
	 * 
	 * }
	 */

	public static void main(String[] args) {
		ReadValidateAndWrite ReadValidateAndWriteObj = new ReadValidateAndWrite();
		ReadValidateAndWriteObj.checkFile();

	}

}
