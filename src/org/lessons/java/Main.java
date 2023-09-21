package org.lessons.java;

import java.util.Scanner;

import org.lessons.java.exercises.Ex1;
import org.lessons.java.exercises.Ex2;
import org.lessons.java.exercises.Ex3;
import org.lessons.java.utils.Input;
import org.lessons.java.utils.Output;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;

		do {
			choice = Input.getInt(scanner, 0, 3,
					"MENU'\n1) Esercizio 1 - Lista di regali\n2) Esercizio 2 - Composizione stringa\n3) Esercizio 3 - ArrayList personalizzato\n0) Esci");

			switch (choice) {

			case 1:
				Ex1.run(scanner);
				break;

			case 2:
				Ex2.run(scanner);
				break;

			case 3:
				Ex3.run(scanner);
				break;
			}
		} while (choice > 0);

		Output.printGoodbye();

		scanner.close();
	}

}
