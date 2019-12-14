package com.class35;

import java.util.HashMap;
import java.util.Map;
/*
 * Create a map of a building. Store floor number and it is associated company name. 
 * (Example: 
 * 1= Google, 
 * 2=Syntax etc..). 
 * Insert 7 entries with duplicate keys and values.
 * Check how many entries you have?
 * Update company on a 4th floor
 * Remove company on the 7th floor
 * Print your map
 * 
 */

public class Building {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Google");
		map.put(2, "Syntax");
		map.put(3, "Java");
		map.put(4, "Selinum");
		map.put(3, "Java");
		map.put(4, "Selinum");
		map.put(7, "JavaScripts");
		map.put(8, "JavaScripts");
		map.put(9, "JavaScripts");

		// Check how many entries you have?
		System.out.println(map.size());

		// Update company on a 4th floor

		map.replace(4, "Apex");
		System.out.println(map.get(4));

		// Remove company on the 7th floor

		map.remove(7);
		System.out.println(map.size());

	}

}
