package com.class35;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
/*
* Create a map of countries with its capital. 
* Print all keys and values from a country map using for each loop and iterator.
* Print all values from a country map using for each loop and iterator.
*/


public class TaskCountries {

	public static void main(String[] args) {
		
		HashMap<String, String> countryCapitalMap = new HashMap<String, String>();

		countryCapitalMap.put("united States", "Washington Dc");
		countryCapitalMap.put("Ethiopia", "Addis Abeba");
		countryCapitalMap.put("Japan", "Tokyo");
		countryCapitalMap.put("France", "Paris");
		countryCapitalMap.put("Russia", "Moscow");
		countryCapitalMap.put("England", "Londen");
		countryCapitalMap.put("German", "Berlin");

		System.out.println("PRINTING ALL KEYS AND VALUES");

		System.out.println("Using for each loop------");

		Set<String> country = countryCapitalMap.keySet();

		for (String s : country) {

	System.out.println("Country " + s + " has capital city " + countryCapitalMap.get(s));

			

			System.out.println("Using iterator--------------");

			Iterator<String> itCountry = country.iterator();
			while (itCountry.hasNext()) {
				String c = itCountry.next();
	System.out.println("Country " + c + " has capital city " + countryCapitalMap.get(c));
			}
			
			
			System.out.println("PRINTING ONLY key");
			
			Collection<String> capitals = countryCapitalMap.keySet();

			System.out.println("Using for each loop------");

			for (String s2 : capitals) {
				System.out.println("Capital city " + s2);
		}

	}
  }
		
	}


