package org.lessons.java.exercises;

import java.util.Scanner;

import org.lessons.java.exercises.classes.IntList;
import org.lessons.java.utils.Output;

public class Ex3 {

	public static void run(Scanner scanner) {
		IntList list = new IntList(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });

//		Rimuovo l'ultimo elemento della lista [1, 2, 3, 4, 5, 6, 7, 8]
		list.remove();

//		 Aggiungo l'elemento 17 in fondo alla lista [1, 2, 3, 4, 5, 6, 7, 8, 17]
		list.add(17);

//		Aggiungo l'elemento 88 nell'indice 1 della lista [1, 88, 2, 3, 4, 5, 6, 7, 8, 17]
		list.add(88, 1);

//		Rimuovo dalla lista l'elemento con indice 0 [88, 2, 3, 4, 5, 6, 7, 8, 17]
		list.remove(0);

//		Rimuovo dalla lista l'elemento con indice list.size() - 3 (ovvero l'elemento con indice 6) [88, 2, 3, 4, 5, 6, 8, 17]
		list.remove(list.size() - 3);

		Output.printSeparator();

		while (list.hasNext())
			System.out.println(list.getNext());

		System.out.println(list.toString());

		Output.printRedirectingToMenu();
		Output.printSeparator();
	}
}
