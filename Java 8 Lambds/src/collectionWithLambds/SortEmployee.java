package collectionWithLambds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployee {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("pr", 1425));
		employees.add(new Employee("puupa", 14));
		employees.add(new Employee("prkjg", 112));
		employees.add(new Employee("prasant", 10));
		employees.add(new Employee("sagar", 142));
		employees.add(new Employee("kuni", 2));
		
		/*
		 * Collections.sort(employees);
		 * System.out.println("Shorting according to default Shoting order:" +
		 * arrayList);
		 * 
		 * Collections.sort(arrayList, (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0);
		 * System.out.println("Shorting according to customized Shoting order:" +
		 * arrayList);
		 */
		
	}
	
}
