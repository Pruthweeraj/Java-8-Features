package predicate;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate = i -> (i>10);
		System.out.println(predicate.test(20));//test is the inly one abstract method present in the PredicateFunctionla interface.
		System.out.println(predicate.test(2));
		
	}
}
