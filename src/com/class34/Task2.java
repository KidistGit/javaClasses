package com.class34;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Task2 {

	public static void main(String[] args) {
		LinkedHashSet<String> Cities = new LinkedHashSet<>();

		Cities.add("Usa");
		Cities.add("Addis");
		Cities.add("Lendon");
		Cities.add("Japan");

		Iterator<String> Cities1 = Cities.iterator();
		String out = " ";
		while (Cities1.hasNext()) {
			out = (String) Cities1.next();
			if (out.startsWith("A")) {
				Cities1.remove();
			} else
				System.out.println(out);
		}

	}

}
