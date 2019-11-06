package com.class11;

public abstract class Task3 {

	public static void main(String[] args) {

		String[][] names = { { "Mr", "Mrs", "Ms", "Miss" }, { "Smith", "Jordan", "Jackson", "Obama" } };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(names[i][j] + " " + names[i + 1][j] + " ");

			}
			;
			System.out.println();
			System.out.println("*******");
			String[][] names2 = { { "Jack", "John", "Mack", "Nati" }, { "A", "B", "C", "D" } };
			for (int k = 0; k < names2.length; k++) {
				for (int j = 0; j < names2[k].length; j++) {
					System.out.print(names2[k][j] + " " + names2[k + 1][j] + " ");

				}
				;
				System.out.println();

			}

		}

	}
}
