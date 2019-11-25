package com.class24;

public class Test {

	public static void main(String[] args) {
		Child1 ch1 = new Child1();
		System.out.println(Child1.race);// Static way
		System.out.println(ch1.hairColor);
		System.out.println(ch1.eyeColor);
		ch1.Sing();
		ch1.code();

		Parent parent = new Parent();
		System.out.println(parent.hairColor);
		System.out.println(parent.eyeColor);
		System.out.println(Parent.race);
		parent.Sing();
		// parent.code(); compiler will give an error

		Child2 ch2 = new Child2();
		System.out.println(ch2.eyeColor);
		System.out.println(ch2.hairColor);
		System.out.println(Child2.race);
		ch2.Tester();
	}

}
