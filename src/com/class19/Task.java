package com.class19;

public class Task{
	
//  Create a method createEmail(). Based on provided users name, lastName and email type,
//  your method should return complete email Address. Example: KidistGetie@gmail.com
    
    String creatEmail(String name, String lastName, String emailType) {
    String Email = name + lastName + emailType;
        return Email;
    }
    //Write a method to return whether given number is prime or not?
    boolean e (int num) {
    boolean isPrime = true;
    if (num <= 1) {
        isPrime = false;
    } else {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
    }
    return isPrime;
    }
// Create  class Student that will have a method getGrade. Your method should accept the score of a student
//and return a grade:
//          score > 90 - A
//          score >80 - B
//          score >70 - C
//          score > 50 - D
//          anything else - F
    char getGrade(int score) {
        char grade;
        if(score>90) {    
            grade='A';   
        }
        else if(score>80 && score<90) {
            grade='B';   
        }
        else if(score>70 && score<80) {
            grade='C';    
        }
        else if(score>50 && score<70) {
            grade='D';   
        }else {
            grade='F';
        } 
        return grade;
    }
    public static void main(String[] args) {
        Task obj = new Task();
        String EmailAdd = obj.creatEmail("Kidist","  "+ "Getie","   "+ "@Gmail.com");
        System.out.println(EmailAdd);
        boolean isPrime = obj.e(4);
        System.out.println(isPrime);
        char getGrade = obj.getGrade(91);
        System.out.println(getGrade);

    }
}
