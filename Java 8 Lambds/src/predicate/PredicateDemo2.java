package predicate;

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {
		Predicate<String> p = (String name) -> name.length() <5;
		System.out.println(p.test("Pr"));
		System.out.println(p.test("Pupa"));
		System.out.println(p.test("subham"));
	}
}
