package com.InterviewQuestion;

import java.util.Arrays;

public class MaiumumAndMinimum {

	public static void main(String[] args) {

		// 2.Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?

		int[] arr = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		int min = arr[0];
		int largest = arr[0];
		int secondLargest = arr[0];

		for (int k = 0; k < arr.length; k++) {

			if (arr[k] > largest) {
				secondLargest = largest;
				largest = arr[k];

			} else if (arr[k] > secondLargest) {
				secondLargest = arr[k];
			}
		}

		System.out.println(" Second largest number is:" + secondLargest);

		// 2. Maximum and minimum number in the array?
		Arrays.sort(arr);
		System.out.println("Minimum = " + arr[0]);
		System.out.println("Maximum = " + arr[arr.length - 1]);

	}

}
