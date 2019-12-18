package com.class11;

public class Task1 {

	public static void main(String[] args) {
		
		String[]cars= {"Honda", "DMW", "Toyota","Jeep", "Tesla","Marchdes"};
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]+" ");
	}
		//Task2
		int[] numbers= {10,20,30,40};
		int sum=0;
		for (int j=0; j<numbers.length;j++) {
			sum=sum+numbers[j];
		}
		//Task1
		String[] countries = { "USA", "Ethiopia", "Chana", "Sudan" };
		for (String getCountry: countries) {
			if (getCountry.equals("USA")) {
				System.out.println("Washngton DC");
			} else if (getCountry.equals("Ethiopia")) {
				System.out.println("AddisAbaba");
			} else if (getCountry.equals("Chana")) {
				System.out.println("Bailljam");
			} else if (getCountry.equals("Sudan")) {
				System.out.println("Kartum");
			}
		
			String[] countries2 = { "Afghanistan", "Colombia", "USA", "Russia", "Turkey" };
			for (int k = 0; k < countries.length; k++) {
			switch (countries[k]) {
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
}
