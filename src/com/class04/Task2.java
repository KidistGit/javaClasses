package com.class04;

public class Task2 {

	public static void main(String[] args) {
		double rate=4.5;
		double price=200000;
		if(rate>=4.5) {
			System.out.println("Users will not buy a house");
			
		}else{
			System.out.println("Users will consider buying");
		
			if(price>200000) {
				System.out.println("I will need a loan to buy house");
			}else{
				System.out.println("I will pay cash for my house");
				
			}	
			
		}

	}

}
