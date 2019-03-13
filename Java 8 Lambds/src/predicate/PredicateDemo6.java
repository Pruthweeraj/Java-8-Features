package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo6 {

	public static void main(String[] args) {

		String[] names = { "", "Sai", "Pr", "", " ", "Sagar", null, null, " ","  Prasant", "" ,"  " };

		Predicate<String> validString = name -> name != null && name.trim().length() != 0 ;

		List<String> list = new ArrayList<>();

		for (String name : names) {
			if (validString.test(name)) {
				list.add(name);
			}
		}
		System.out.println("Valid strings are:");
		System.out.println(list);
		 
	}
}