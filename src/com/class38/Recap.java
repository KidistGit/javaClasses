package com.class38;

public class Recap {

	public static void main(String[] args) throws InterruptedException {
		int num = 1;

		// Runtime-Unchecked Exception
		int[] nums = { 12, 13 };
		try {
			System.out.println(nums[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Trying to access elemetn outside of the boundary");
		}
		// Compile time -Checked Exception
		Thread.sleep(10000);
		System.out.println("End of the code");

	}
}
