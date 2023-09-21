package org.lessons.java.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.lessons.java.utils.Input;
import org.lessons.java.utils.Output;

public class Ex2 {

	public static void run(Scanner scanner) {
		HashMap<Character, Integer> map = new HashMap<>();

		List<Character> list = new ArrayList<Character>();
		list = Input.getString(scanner, "Inserisci una stringa").chars().mapToObj(c -> (char) c).toList();

		list.forEach((key) -> {
			if (map.containsKey(key))
				map.merge(key, 1, (oldValue, newValue) -> oldValue + newValue);
			else
				map.put(key, 1);
		});

		Output.printSeparator();

		map.forEach((key, value) -> System.out.println(key + ": " + value));

		Output.printRedirectingToMenu();
		Output.printSeparator();
	}
}
