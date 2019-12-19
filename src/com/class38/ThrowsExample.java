package com.class38;

public class ThrowsExample {
	static String name = "John";

	public static void main(String[] args) throws InterruptedException {
		callingMore();
	}

	public static void studentSleeping() throws InterruptedException {

		System.out.println("Students is " + name + " is sleeping");
		Thread.sleep(300);
	}

	public static void callingSleepingStudent() throws InterruptedException {
		studentSleeping();

	}

	public static void callingMore() throws InterruptedException {
		try {
			callingSleepingStudent();
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception");
		}
	}
}