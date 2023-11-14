package io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Simple file IO library.
 * 
 * @author bingol
 *
 */
public class IOFileLib {

	/**
	 * Reads the file into a String
	 * 
	 * @param pathToFile path to file without fileSeparator
	 * @param fileName   file name with extension
	 * @return
	 */
	public static String fileRead(String pathToFile, String fileName) {

		// create file object
		File file = null;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		String line = "";
		String strRead = "";
		try {
//			file = new File(pathToFile);
			file = new File(pathToFile + File.separator + fileName);
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
//				/**/System.out.println(line);
				strRead += line + "\n";
			}
		} catch (FileNotFoundException e) {
			System.out.println("Sorry, " + file.getName() + " not found.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return strRead;

	}

	/**
	 * Creates a new file and writes string into the file.
	 * 
	 * @param pathToFile path to file
	 * @param fileName   file name with extension
	 * @param strWrite
	 */
	public static void fileWriteNew(String pathToFile, String fileName, String strWrite) {
		fileWrite(pathToFile, fileName, strWrite, false);
	}

	/**
	 * Appends the string to already existing file.
	 * 
	 * @param pathToFile path to file
	 * @param fileName   file name with extension
	 * @param strWrite
	 */
	public static void fileWriteAppend(String pathToFile, String fileName, String strWrite) {
		fileWrite(pathToFile, fileName, strWrite, true);
	}

	/**
	 * Write string to the file.
	 * 
	 * @param pathToFile path to file
	 * @param fileName   file name with extension
	 * @param content    to be written into file.
	 * @param append     creates file if false; appends if true.
	 */
	/**
	 * 
	 * @param pathToFile
	 * @param fileName
	 * @param content
	 * @param append
	 */
	private static void fileWrite(String pathToFile, String fileName, String content, boolean append) {

		File file = new File(pathToFile + File.separator + fileName);
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;

		try {
			fileWriter = new FileWriter(file, append);
			printWriter = new PrintWriter(fileWriter);
			printWriter.print(content);
			printWriter.flush();

		} catch (IOException e) {
			System.err.println("** WARNING **  " + "Make sure that the path \"" + pathToFile + "\" exists.");
			System.err.println("System terminates without creating the file.");
//			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
				printWriter.close();
			} catch (IOException e) {
				// TODO what to do here
//				e.printStackTrace();
			} catch (NullPointerException e2) {
				// TODO: handle exception
			}
		}
	}

}
