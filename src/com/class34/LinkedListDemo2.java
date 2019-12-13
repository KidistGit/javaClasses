package com.class34;

import java.util.LinkedList;
import java.util.List;

class Sweets {

	String name;

	public Sweets(String name) {
		this.name = name;

	}

	public void iLove() {
		System.out.println("I love " + name);
	}

}

public class LinkedListDemo2 {

	public static void main(String[] args) {

// Create a list of Sweets Objects
		List<Sweets> sweetList = new LinkedList<>();
		sweetList.add(new Sweets("Chocolate"));
		sweetList.add(new Sweets("Cake"));
		sweetList.add(new Sweets("Cookies"));
		sweetList.add(new Sweets("Macaroons"));

		// lets display name of each sweet object
		for (Sweets element : sweetList) {
			System.out.println(element.name);
			element.iLove();
			// retrieving l element and accessing method (2 Steps)
			Sweets mySweet = sweetList.get(2);
			mySweet.iLove();
			// retrieving 1 element and accessing method (2 steps)
			sweetList.get(2).iLove();
			String nameOfTheSweet = sweetList.get(2).name;
			System.out.println(nameOfTheSweet);

			String str = "Hello 1233";
			//"Hello 123 "--> "Hello 456 " --> "Hello 456"
			str.replaceAll("123", "456").intern();

			Integer num = 100;
			//100--> "100"----> "200" ------>        3
			int newNumber = num.toString().replaceAll("100", "200").length();
			System.out.println(newNumber);

		}

	}

}
