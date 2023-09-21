package org.lessons.java.utils;

import java.util.Scanner;

public class Input {
	public static String getString(Scanner scanner, String requestMessage) {
		String s = "";
		boolean inputSuccess = false;

		System.out.println(requestMessage);

		while (!inputSuccess) {

			s = scanner.nextLine();

			if (s.isBlank())
				System.err.println("Errore! Devi inserire una stringa valida. Riprova");
			else
				inputSuccess = true;

		}

		return s;
	}

	public static String getStrippedString(Scanner scanner, String requestMessage) {
		String s = "";
		boolean inputSuccess = false;

		System.out.println(requestMessage);

		while (!inputSuccess) {

			s = scanner.nextLine();

			if (s.isBlank())
				System.err.println("Errore! Devi inserire una stringa valida. Riprova");
			else
				inputSuccess = true;

		}

		return s.strip();
	}

	public static int getInt(Scanner scanner, int min, int max, String requestMessage) {

		String inputValue;
		int x = 0;
		boolean inputSuccess = false;

		System.out.println(requestMessage);

		while (!inputSuccess) {
			inputValue = scanner.nextLine();
			try {
				x = Integer.parseInt(inputValue);

				if (x < min)
					System.err.println("Errore! Devi inserire un numero maggiore o uguale a " + min + ". Riprova");
				else if (x > max)
					System.err.println("Errore! Devi inserire un numero minore o uguale a " + max + ". Riprova");
				else
					inputSuccess = true;
			} catch (NumberFormatException e) {
				System.err.println("Errore! Devi inserire un numero intero. Riprova");
			}
		}

		return x;
	}
}
