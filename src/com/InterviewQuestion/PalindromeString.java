package com.InterviewQuestion;
import java.util.Scanner;
public class PalindromeString {

	public static void main(String[] args) {
		/*        
		 * 6. Write a Java Program to find whether a String is palindrome or not?         
		 *  Palindrome is a word, phrase, or sequence that reads the same backward as        
		 * forward, e.g., madam or nurses run        
		 */
		
		String str1, rev = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		str1 = sc.nextLine();

		int length = str1.length();

		for (int n = length - 1; n >= 0; n--) {
			rev = rev + str1.charAt(n);

			if (str1.equals(rev)) {
				System.out.println(str1 + " is a palindrome");
			} else {
				System.out.println(str1 + " is not a palindrome");
			}
			}
	
		System.out.println("-------------------------------------");
		
	     /*7. Write a java program to check whether a given number is prime or not?       
	      *   Prime number is a number that is greater than 1 and is only divisible by 1 or itself        
	      *   0 and 1 are not prime numbers  
	      *   2 is the only even prime number.        
	      *   
	      */           
		  
		int num = 0;           
		
		Scanner input = new Scanner(System.in);            
		System.out.println("Please enter a number to check");           
		    num = input.nextInt();                       
		
		    if (num%2!=0 || num>=2) {                
			System.out.println("This is a prime number");                          
			
		    }else {                
				
		    	System.out.println("This is not a prime number");           
		}  
		    System.out.println("-------------------------------"); 
			   
			   /*
			    *  8.Write a Java Program to print first 10 numbers of Fibonacci series. 
			    *  Fibonacci series means :-a series of numbers in which each number ( Fibonacci number ) 
			    *  is the sum of the two preceding numbers.
			    *  The simplest is the series 1, 1, 2, 3, 5, 8, etc.
			    */
			   
			     int n = 10, t1 = 0, t2 = 1;
		       
			     System.out.print("First " + n + " terms: ");

		        for (int m = 1; m <= n; ++m)
		        {
		            System.out.print(t1 + " + ");

		            int sum = t1 + t2;
		           
		            t1 = t2;
		            t2 = sum;
		        }

	       }
		
	
	


}
