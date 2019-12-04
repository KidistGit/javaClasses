package com.class29;

public abstract class File {
	public abstract void open();

	public void edit() {
		System.out.println("Edit the file");
	}

	public void close() {
		System.out.println("Close the file");
}
}
class javaFile extends File {
	public void open() {
		System.out.println(" To open Java file  we need netepad");
	}
}
class wordFile extends  File{
	public void open() {
		System.out.println("To open doc file we need sublime text");
	}
}
class pdfFile extends File{
	public  void open() {
		System.out.println("To open pdffile we need microsoft");
	}
}