package com.classes05;

public class Task1 {

	public static void main(String[] args) {

		int weekDay = 1;
		if (weekDay == 1 || weekDay == 5) {
			System.out.println("It is a weekday");

		} else if (weekDay == 6 || weekDay == 7) {
			System.out.println("It is weekend day");

		} else {
			System.out.println("Invalid day");
		}

// short (under 5 feet)
// medium(5 to 6 feet)
// tall (6 feet and over)
		int  feet = 6;

		if (feet>=5) {
			System.out.println("Short");
		}else if(feet>=5 && feet<6) {
			System.out.println("Midium");
		}else if (feet<6){
			System.out.println("Tall");
		}else{
			System.out.println("Invalid height");
			
		}

	
}
	}


