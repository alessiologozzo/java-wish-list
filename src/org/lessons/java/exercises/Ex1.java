package org.lessons.java.exercises;

import java.util.HashMap;
import java.util.Scanner;

import org.lessons.java.utils.Input;
import org.lessons.java.utils.Output;

public class Ex1 {
	public static void run(Scanner scanner) {

		HashMap<String, String> giftList = new HashMap<>();

		Output.printSeparator();

		while (true) {
			String addressee = Input.getStrippedString(scanner, "\nA chi è destinato il regalo? (Scrivi 0 per uscire)");
			if (addressee.equals("0"))
				break;

			String gift = Input.getStrippedString(scanner, "Che regalo è? (Scrivi 0 per uscire)");
			if (gift.equals("0"))
				break;

			giftList.merge(addressee, gift, (oldValue, newValue) -> oldValue + ", " + newValue);
		}

		if (giftList.size() > 0) {
			System.out.println("\nEcco la tua lista di regali:");
			giftList.forEach((key, value) -> System.out.println(key + " -> " + value));
		} else
			System.out.println("\nLa tua lista di regali è vuota.");

		Output.printRedirectingToMenu();
		Output.printSeparator();
	}
}
