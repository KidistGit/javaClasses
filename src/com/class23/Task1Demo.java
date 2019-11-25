package com.class23;
/*Write a program that will have a constructor: 
 * one with parameters and second without any parameters. 
 * Create a separate Test class where 
 *you will execute both of the constructors.
 */
public class Task1Demo {
	
	  int empId;
	     String empName;
	    
   	public Task1Demo(int i, String string) { //parameterized constructor with no parameters
   		System.out.println("This is a no argument constructor");
          }   
          
   	   //parameterized constructor with two parameters
   	   
   	public void Task1Demo(int Id, String name) {
   	       empId = Id;  
   	       empName = name;  
   	    }  
   	 
   		public void info(){
   	        System.out.println("Id: "+empId+" Name: "+empName);
      }  
	}

