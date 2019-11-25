package com.class23;
/*Write a java program of Class Students that takes students name and 3 subject grades. 
 * Inside your class also have a method to Calculate Average Grade. 
 * Test Student class for 5 different students with different marks. 
 * Your program should print an average mark of each students name. 
 */
public class Student {
	String name;
	int grade1, grade2, grade3;
	
	Student(String studentName, int gr1, int gr2, int gr3) { //Contractor
		name=studentName;
		grade1=gr1;
		grade2=gr2;
		grade3=gr3;
	}
	public static void main (String [] args ) {
		Student student1=new Student ("John",90,78,100);
		student1.calculateAverage();
		
		Student student2=new Student ("Anna",90,88,100);
		student2.calculateAverage();
		
		Student student3=new Student ("Ibrahim",88,78,100);
		student3.calculateAverage();
		
		Student student4=new Student ("Mehmet",90,88,80);
		student4.calculateAverage();
		Student student5=new Student("Ozlem", 90, 88, 68);
		student5.calculateAverage();

		
	
	}
	
	public void calculateAverage() {
		int average=(grade1+grade2+grade3)/3;
		System.out.println("Student "+name+" has an average grade is "+average);
	}

}


