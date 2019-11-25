package com.class25_1;
/*
 * 2. Create 1 class with a static method that has 3 overloaded forms. Then call
 * each overloaded method with specific arguments and observe result. 
 *
 */
public class StaticOverLoad {
	

		static void num() {
			System.out.println(0);
		}

		static void num(int a) {
			System.out.println(a);
		}

	  static void num(int b, int a) {       
		System.out.println(a+b);
	  }
	  
		public static void main(String[] args) {
			StaticOverLoad.num();
			StaticOverLoad.num(10);
			StaticOverLoad.num(5,4);
		}
}
