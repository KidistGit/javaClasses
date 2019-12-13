package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {
	public static void main(String[] args) {

		CarInsurance car = new CarInsurance("Geico", "Toyota");
		PetInsurance pet = new PetInsurance("Allstate", "Cat");
		HealthInsurance health = new HealthInsurance("Aetna");

		ArrayList<Insurance> alist = new ArrayList<>();
		alist.add(car);
		alist.add(pet);
		alist.add(health);
		System.out.println("******using for loop to iterator");
		for (int i = 0; i < alist.size(); i++) {
			// System.out.println(aList.get(i).insuranceName);

			Insurance obj = alist.get(i);
			obj.getQuote();
		}
		System.out.println("******using Iterator");

		Iterator<Insurance> it = alist.iterator();
		while (it.hasNext()) {
			Insurance obj = it.next();
			obj.cancelInsurance();
		}
		System.out.println(".....using for each loop/enhanced loop");
		for (Insurance obj : alist) {
			obj.getQuote();
		}
	}
}
