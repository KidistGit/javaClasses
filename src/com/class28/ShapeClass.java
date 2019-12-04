package com.class28;
//Write program: Shape class has a constructor that takes the radius \
//has a subclass as  circle class. 
//In circle class create a method to calculate the area of circle. Test your code
public class ShapeClass {
	
	double radius;
	ShapeClass(double radius){
		this.radius=radius;
}
}
class CircleClass extends ShapeClass {
	
	double area;

	
	public CircleClass(double radius) {
		super(radius);
		this.area=area;
		area=3.14*Math.pow(radius,2);
		
		
	}
	
	public void info() {
		System.out.println("Radius is "+radius+"and the area is"+area );
				
}
}