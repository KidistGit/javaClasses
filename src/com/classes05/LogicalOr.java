package com.classes05;

public class LogicalOr {
	public static void main(String[] args) {
		// 7 days a week
		// if days is 2 or 4 SDLC class
		// if day 6 or 7 Java class
		// if day 1 or 5 No class
		// If day =3 review class
		//

		int day = 7;
		// false OR false = false
		if (day == 2 || day == 4) {
			System.out.println("SDLC class");
			// true OR false =true
		} else if (day == 6 || day == 7) {
			System.out.println("Java class");
			// false OR false= false
		} else if (day == 1 || day == 5) {
			System.out.println("No class");
		} else if (day == 3) {
			System.out.println("Review class");

		} else {
			System.out.println("Not a valid day");

		}
                // 7 days a week
				// if days is Tuesday or Thursday 4 SDLC class
				// if day Saturday or Sunday Java class
				// if day Monday or Friday No class
				// If day is Wednesday review class
				//
		
		String weekDay="Sunday";
		if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
			System.out.println("SDLC class");
			
		}else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
			System.out.println("Java class");
			
		}else if (weekDay.equals("Monday") || weekDay.equals("Friday")) {
			System.out.println("No class");
		
		}else if (weekDay.equals("Saturday") || weekDay.equals("Wednesday")) {
			System.out.println("Review class");
		
		
		}else{
			System.out.println("Not a valid day");
		}
				
				
		
		
		
	}

}
