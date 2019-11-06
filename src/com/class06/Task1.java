package com.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*ask user to enter boolean  valve for sale
		 * if no sale I am not shopping
		 * if sale check the price of the item
		 * based on the amount we will have to calculate the price after discount
		 * if price <20 apply 10% 
		 * if price between 20-100 20% 
		 * if between 100-500 30%
		 * anything else 50%
		 * After discount the price of the item reduce from ____ to _____
		 */

		boolean sale=true;
		double price;
		double discount;
		double finalPrice;
		
Scanner inp=new Scanner(System.in);
System.out.println("Please enter the valve of sale");
sale=inp.nextBoolean();
System.out.println("Please enter the price");
price=inp.nextDouble();


if (!sale) {
	System.out.println("I am not shopping");
} else {
	System.out.println("What is the actual price?");
price = inp.nextDouble();
if (price < 20) {
	discount = price
* 0.10;// finalPrice = price - discount;
} else if (price >= 20 && price < 100) {
	discount = price * 0.20;// finalPrice = price - discount;
	} else if (price >= 100 && price < 500) {
	discount = price * 0.30;// finalPrice = price - discount;
	} else {
		discount = price * 0.50;
		}
finalPrice = price - discount;
System.out.println("After discount " + discount + " the price of the item reduce from " + price + " to " + finalPrice);
	}
}



	}


