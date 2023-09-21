package org.lessons.java.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.lessons.java.utils.Input;
import org.lessons.java.utils.Output;

public class Ex1 {
	public static void run(Scanner scanner) {
		HashMap<String, List<String>> giftList = new HashMap<>();

		Output.printSeparator();

		while (true) {
			System.out.println((giftList.size() > 0 ? "\nNumero di destinatari dei regali: " + giftList.size() : ""));

			if (giftList.size() > 0) {
				int counter = 0;

				for (Map.Entry<String, List<String>> map : giftList.entrySet())
					counter += map.getValue().stream().count();

				System.out.println("Numero complessivo di regali: " + counter + "\n");
			}

			String addressee = Input.getStrippedString(scanner, "A chi è destinato il regalo? (Scrivi 0 per uscire)");
			if (addressee.equals("0"))
				break;

			List<String> gift = new ArrayList<>();
			gift.add(Input.getStrippedString(scanner, "Che regalo è? (Scrivi 0 per uscire)"));

			if (gift.get(0).equals("0"))
				break;

			giftList.merge(addressee, gift, (oldValue, newValue) -> {
				oldValue.add(newValue.get(0));
				return oldValue;
			});
		}

		if (giftList.size() > 0) {
			System.out.println("\nEcco la tua lista di regali:");
			giftList.forEach((key, value) -> System.out.println(key + " -> " + value.toString()));
		} else
			System.out.println("\nLa tua lista di regali è vuota.");

		Output.printRedirectingToMenu();
		Output.printSeparator();
	}
}
