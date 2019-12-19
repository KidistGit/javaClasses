package com.class38;

public class ThrowsKeyWord {

	public static void main(String[] args) {
		System.out.println("Begining");
		callingExceptionMethod();
		System.out.println("End");
	}

	public static void throwingException() {
		System.out.println("Creating an exception");
		ArithmeticException ae = new ArithmeticException();
		throw (ae);

	}

	public static void callingExceptionMethod() {
		try {
			throwingException();
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic E got caught");
		}
	}
}
