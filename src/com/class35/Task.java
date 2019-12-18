package com.class35;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Task {

	public static void main(String[] args) {

		Map<Integer, String> bustBuy = new TreeMap<Integer, String>();

		bustBuy.put(789045, "Printer");
		bustBuy.put(123456, "Computer");
		bustBuy.put(146785, "Tv");
		bustBuy.put(178904, "CellPhone");
		System.out.println(bustBuy);

		Set<Entry<Integer, String>> entrySet = bustBuy.entrySet();

		System.out.println(" using each loop to get all key and value objects");
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());

		}
		System.out.println(" using Iterator to get all key and value objects");
		
		Iterator<Entry<Integer, String>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Entry<Integer, String> ent = entryIterator.next();
			//int key=ent.getKey();//Integer
			//String value=ent.getValue();
			///System.out.println(key+"---"+value);
			// 2nd way to use 
			
			String entry = ent.getKey() + "----" + ent.getValue();
			System.out.println(entry);
		}
	}

}
