package com.class36;

import java.util.Map;
import java.util.TreeMap;

class Person {
	String name;
	String lastName;
	int age;
	int salary;

	public Person(String name, String lastName, int age, int salary) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;

	}

	public void userDetailes() {
		System.out.println(name + " " + lastName + " is " + age + " years old and his salary is:" + salary);
	}

}

public class Task1Test {

	public static void main(String[] args) {
		Map<Integer, Person> person = new TreeMap<>();
		person.put(101, new Person("John","Smith",33,35000));       
    	person.put(102, new Person("Tim","James",43,135000));        
    	person.put(103, new Person("John","Brown",23,15000));        
    	person.put(104, new Person("Sara","Bill",73,335000));                
    	
    	
    	for(Person detail:person.values()) { 
    		detail.userDetailes(); 
		
		
		}
	}
}
