package com.class34;

import java.util.Iterator;
import java.util.TreeSet;

public class Task1 {

	public static void main(String[] args) {
		TreeSet<String> Countries = new TreeSet<>();
		Countries.add("USA");
		Countries.add("Engliand");
		Countries.add("Ethiopia");
	
		System.out.println("*** for each loop");
		
		for (String set : Countries) {
			System.out.println(set);
		}
		
			System.out.println("**** Iterator");
			Iterator<String> it = Countries.iterator();
			while (it.hasNext()) {
				System.out.println(it.next()+" ");
			
			}
			
		}

	}

