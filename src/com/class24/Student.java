package com.class24;
/*Write program as a Student class   
 * that has instance variables name and address. 
 * Create a constructor that will initialize those variables.
 *  Print name & address of given  student by the displayInfo method. 
 */

public class Student {
	static String name;
	int homeNo;
	String street;
	String city;
	int zipcode;
	
	
	Student (String name, int homeNo, String street, String city, int zipcode){
		this.name=name;
		this.homeNo=homeNo;
		this.street=street;
		this.city=city;
		this.zipcode=zipcode;
		}
	public void display() {
		System.out.println("Student's name is :"+name+".The adress is: "+homeNo+" "+street+" "+city+" "+zipcode);
	}
	public static void main(String[] args) {
		Student s1= new Student ("Jack",105, "Fox Lake Dr.","Fairfax",23456);
		s1.display();
	}
	
	
	}

