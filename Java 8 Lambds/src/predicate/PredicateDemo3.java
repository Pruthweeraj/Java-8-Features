package predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo3 {

	public static void main(String[] args) {
	
		Predicate<Collection <Integer> > p = c -> c.isEmpty();
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		System.out.println("Collection is empty:"+ p.test(list));
		
		List<Integer> list2 = new ArrayList<>();
		System.out.println("Collection is empty:"+p.test(list2));
		
	}
}
