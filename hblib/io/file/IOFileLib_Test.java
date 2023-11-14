package io.file;

import java.io.File;

public class IOFileLib_Test {

	static String path = "src" //
			+ File.separator + "hblib" //
			+ File.separator + "io" //
			+ File.separator + "file";
	static String fileName = "test3.txt";

	public static void main(String[] args) {

		String strRead;
		String pathToFile;

		// name of file to read
//		pathToFile = path + File.separator + fileName;
		pathToFile = path;
		System.out.println("pathToFile: " + pathToFile);
		//
		IOFileLib.fileWriteNew(pathToFile, fileName, "hi :");
		strRead = IOFileLib.fileRead(pathToFile, fileName);
		System.out.println("strFile-B:");
		System.out.println(strRead);
		//
		IOFileLib.fileWriteAppend(pathToFile, fileName, "\nMe Be");
		strRead = IOFileLib.fileRead(pathToFile, fileName);
		System.out.println("strFile-B:");
		System.out.println(strRead);

	}

}
