package com.class24;

public class ThisKeyWord {
	int a, b;

	public ThisKeyWord(int a, int b) {
		this.a = a;

		this.b = b;
	}

	public ThisKeyWord() {
		System.out.println("I am non argument constructor");
	}

	public void sum(int a, int b) {
		System.out.println("The sum of local parameters is " + (a + b));
		System.out.println("The sum of instance variables is " + (this.a + this.b));
	}

	public void sayA() {
		System.out.println(a);
	}

	public void sayB() {
		System.out.println(b);
	}

	public void sayAandB() {
		this.sayA();
		sayB();// compiler adds this automatically --- this.sayB();
	}

	public static void main(String[] args) {
		 ThisKeyWord obj=new ThisKeyWord(5, 10);
	        obj.sum(10, 20);
	        obj.sayAandB();
	        obj.sayA();
	        obj.sayB();
	        
	        System.out.println("------------------------");
	        ThisKeyWord obj1=new ThisKeyWord(20, 20);
	        obj1.sum(100, 200);


	}
}
