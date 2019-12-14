package com.class35;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Recap {

	public static void main(String[] args) {
		Set<Double> set = new LinkedHashSet<>();

		set.add(99.99);
		set.add(90.99);
		set.add(9.99);
		Iterator<Double> iterator = set.iterator();
		while (iterator.hasNext()) {
			double d = iterator.next();

			if (d < 50) {
				iterator.remove();
			}
		}
		for (Double d1 : set)
			System.out.println(d1);
	}

}
