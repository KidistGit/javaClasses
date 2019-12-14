package com.class34;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 * How can you remove all duplicates from ArrayList?
 * 
 * List<String> aList=new ArrayList<String>(); 
 *  
 *  aList.add(“John”);      
 *  aList.add(“Jane”);      
 *  aList.add(“James”);      
 *  aList.add(“Jasmine”);       
 *  aList.add(“Jane”);       
 *  aList.add(“James”);
 * 
 */
public class TaskIQ {
	public static void main(String[] args) {

		List<String> aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");

		Set<String> set = new HashSet<>(aList);
		set.addAll(aList);
		System.out.println(set);

		set.clear();
		System.out.println(aList);
		aList.addAll(set);
		System.out.println(aList);
		////////////////////////////////////
		// How can I remove just 1 values from the Set Collection

		Set<String> lset = new LinkedHashSet<>();// keep the order
		lset.add("Morning");
		lset.add("Noon");
		lset.add("Evenining");
		lset.add("Night");
		// Converts to the ArrayList
		List<String> myList = new ArrayList<>();
		myList.addAll(lset);
		String element = myList.get(2);
		System.out.println(element);
		//Another way to create ean object of ArrayListby passing values to the constructor
		List<String>myList1= new ArrayList<>(lset);

	}
}
