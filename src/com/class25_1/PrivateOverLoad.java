package com.class25_1;
/*
 * 3. Create 1 class with a private method that has 3 overloaded forms. Then call each
 * overloaded method with specific arguments and observe result.
 * 
 */
public class PrivateOverLoad {
	private  void add(int a, int b) {
		System.out.println(a+b);

	}

	private void add(double a, int b) {
		System.out.println(a+b);

	}

	private void add(int b, int a,int c) {
		System.out.println(a+b+c);

	}

	public static void main(String[] args) {
		PrivateOverLoad obj=new PrivateOverLoad();
		obj.add(3, 2);
		obj.add(2.2, 3);
		obj.add(3, 4, 5);
	}
}
