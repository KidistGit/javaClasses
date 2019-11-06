package com.InterviewQuestion;

public class Swip2Numbers {

	public static void main(String[] args) {
		// 1. Write a program to swap 2 strings without a temporary variableClassA?
		// using .substring()
		String s1 = "Java";// 4
		String s2 = "Training";// 8
		s1 = s1 + s2;// JavaTraining------>12
		s2 = s1.substring(0, (s1.length() - s2.length())); // Java
		s1 = s1.substring(s2.length());
		System.out.println("s1 == " + s1);
		System.out.println("s2 == " + s2);

		System.out.println("------------------------------------");
		// using .replace()
		String a = "Syntax";
		String b = "School";
		a = b + a;
		b = a.replace(b, "");
		a = a.replace(b, "");
		System.out.println("a : " + a);
		System.out.println("b : " + b);

	}

}
