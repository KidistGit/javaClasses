package com.class11;

public class ExamplesSum {

	public static void main(String[] args) {
		   int[][] numbers = {
	                { 8, 7, 5, 3 },
	                { 1, 5, 6, 7 },
	                { 3, 6, 8, 1 }
	               };
	        int sum=0;
	        for (int i = 0; i < numbers.length; i++) {
	        for (int k = 0; k < numbers[i].length; k++) {
	         //System.out.print(numbers[i][j] + " ");
	        sum=sum+numbers[i][k];
	            }
	            System.out.println();
	        }
	        System.out.println("The sum of all elements in the array is= "+sum);
	        
	        int sum1=0;
	        for(int nums[]: numbers) {
	            for(int getNum:nums) {
	                sum1=sum1+getNum;
	            }
	        }
	        System.out.println("The sum of all elements in the array is= "+sum1);
	}

}
