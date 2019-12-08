package com.class31;

public class ShapeTest {

	public static void main(String[] args) {
		Shape obj = new Circle(5, 5);
		double num = obj.calculateParameter();
		double num1 = obj.calculateArea();
		Shape obj1 = new Square(5);
		double num2 = obj1.calculateArea();
		double num3 = obj1.calculateParameter();

	}

}
