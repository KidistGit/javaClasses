package com.class34;

import java.util.Iterator;
import java.util.LinkedList;

import com.class33.CreditCard;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		// adding elements
		list.add("Hello");// 0
		list.add("Bye");// 1
		list.add("Hello");// 2
		list.add("Bye");// 3
		list.add(2, "How are you?");
		System.out.println(list);
		
        // replace 1 element
		list.set(1, "Good bye");
		System.out.println(list);
// retieve 1 element
		String element=list.get(2);
		System.out.println(element);
		
		// retriev all elements
		System.out.println("************** 1 way");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println("**************2 way");
			for (String el: list) {
				System.out.println(el);
				System.out.println("--------------3 way");
				Iterator<String> it=list.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
					
			}
		}
		
		
		
	}

}
