package com.class29;

public class FileTest {

	public static void main(String[] args) {
		File file = new javaFile();
		file.open();
		file.close();
		file.edit();

		File file2 = new wordFile();
		file2.open();
		file2.close();
		file2.edit();

		File file3 = new pdfFile();
		file3.open();
		file3.close();
		file3.edit();

	}

}
