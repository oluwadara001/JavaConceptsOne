/**
 * 
 */
package com.YomiOluwadara.ReadingTXTFiles;

import java.io.File;
import java.io.FileNotFoundException;
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
		// using the setter methid to set user choce
		setUserChoice(new Scanner(System.in).nextInt());

		switch (getUserChoice()) {
		case 1:
			validateContent();
		case 2:
			exitSystem();
		}

	}

	void exitSystem() {
		System.out.println(" You have decided to exi the system, exiting.......");
	}

//ingests the file and do some checks
	public void validateContent() {
		File file = new File("C:\\Users\\oo046152\\mytestfile.txt");
		try {
			Scanner scanner = new Scanner(file);
			// variable to hold a sentence read from the i/p file
			String hasNextLine;
			while (scanner.nextLine().contains("obafemi")) {
				readOAU();
				System.out.println("test-printing from validat content");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void readOAU() {

	}

	public static void main(String[] args) {
		ReadValidateAndWrite ReadValidateAndWriteObj = new ReadValidateAndWrite();
		ReadValidateAndWriteObj.checkFile();

	}

}
