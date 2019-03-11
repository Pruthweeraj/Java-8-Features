package predicate;

import java.util.function.Predicate;

public class PredicateDemo4 {

	public static void main(String[] args) {

		Integer[] i = { 0, 2, 5, 10, 15, 20, 25, 30 };
		
		Predicate<Integer> p1 = number -> number>10;
		Predicate<Integer> p2 = number -> number % 2 ==0;
		
		System.out.println("numbers which are greater than 10 are:");
		m1(p1,i);
		System.out.println("numbers which are less than 10 are:");
		m1(p1.negate() , i);
		System.out.println("even numbers:");
		m1(p2 , i);
		System.out.println("numbers which are greater than 10 and even  are:");
		m1(p1.and(p2) , i);
		System.out.println("numbers which are greater than 10 or even  are:");
		m1(p1.or(p2) , i);
		System.out.println("numbers which are greater than 10 but not even  are:");
		m1(p1.and((p2).negate()) , i);
	}

	public static void m1(Predicate<Integer> p, Integer[] i) {
		for (Integer i1 : i) {
			if (p.test(i1)) {
				System.out.println(i1);
			}
		}
	}

}
