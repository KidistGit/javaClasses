package com.class32;

public class WrapperClasses {

	public static void main(String[] args) {
		int num = 10;
		// Autoboxing ___ converting permitive type into an Object type
		Integer integer = 100000;
		System.out.println(integer.MIN_VALUE);
		String str = integer.toString();
		System.out.println(str);
		// Converting Boolean permitive type into Boolean Object type
		Boolean bool = true;
		Byte $b = 20;
		System.out.println($b.MAX_VALUE);

		// AutoUnboxing ___ Converting Object type into a permitive type
		int num1 = new Integer(10);
		System.out.println(num1);
	}

}
