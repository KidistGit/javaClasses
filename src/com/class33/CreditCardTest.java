package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CreditCardTest {

	public static void main(String[] args) {
		LinkedList<CreditCard> cards = new LinkedList<>();

		CreditCard visa = new Visa("Visa Platinum");
		CreditCard ax = new AX("AX Rewards");
		CreditCard mc = new MasterCard("MC basic");

		ArrayList<CreditCard> alist = new ArrayList<>();
		alist.add(visa);
		alist.add(ax);
		alist.add(mc);

		// using each for loop
		for (CreditCard card : alist) {
			System.out.println("--------");
			card.annualFee();
			card.interestRate();

		}
		System.out.println("**************");

		// using iterator
		Iterator<CreditCard> myIterator = alist.iterator();
		while (myIterator.hasNext()) {
			CreditCard obj = myIterator.next();
			obj.interestRate();
			obj.annualFee();
			obj.interestRate();

		}
		System.out.println("--------");
		// using for loop
		for (int i = 0; i < alist.size(); i++) {
			CreditCard obj = alist.get(i);
			obj.annualFee();
			obj.interestRate();

		}
	}

}
