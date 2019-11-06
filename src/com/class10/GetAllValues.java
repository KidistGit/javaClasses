package com.class10;

public class GetAllValues {

	public static void main(String[] args) {
		String[] animals = { "Cat", "Dog", "Cow", "Snake", "Elephant" };
		// I want to print all values from an array
		// when is Dog I love dogs
		for (int i = 0; i < animals.length; i++) {
			if (animals[i].equals("Dog")) {
				System.out.println("I love dogs");
			} else {
				System.out.println(animals[i]);
			}
		}
		/// Create an array of countries.
		// While retrieving all values from an array print capital for each country.//
		String[] countries = { "USA", "Ethiopia", "Chana", "Sudan" };
		for (int i = 0; i < countries.length; i++) {
			if (countries[i].equals("USA")) {
				System.out.println("Washngton DC");
			} else if (countries[i].equals("Ethiopia")) {
				System.out.println("AddisAbaba");
			} else if (countries[i].equals("Chana")) {
				System.out.println("Bailljam");
			} else if (countries[i].equals("Sudan")) {
				System.out.println("Kartum");
			}
		}
		// Another way 
		String[] countries2 = { "Afghanistan", "Colombia", "USA", "Russia", "Turkey" };
for (int i = 0; i < countries.length; i++) {
switch (countries[i]) {
					case "Afghanistan":
						System.out.println("Kabul");
						break;
					case "Colombia":
						System.out.println("Bogota");
						break;
					case "USA":
						System.out.println("Washington DC");
						break;
					case "Turkey":
						System.out.println("Ankara");
						break;
					case "Russia":
						System.out.println("Moscow");
						break;
}
}		
		}
	}
	
