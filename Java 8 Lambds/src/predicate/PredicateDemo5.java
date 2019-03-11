package predicate;

import java.util.function.Predicate;

public class PredicateDemo5 {

	public static void main(String[] args) {

		String[] names = { "Pruthwee", "SUSU", "Pupa", "Subhasmita", "Pari", "Puchki" };

		Predicate<String> startswithP = name -> name.startsWith("P");

		for (String name : names) {
			if (startswithP.test(name)) {
				System.out.println(name);
			}
		}
	}
}
