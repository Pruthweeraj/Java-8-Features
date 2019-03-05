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
		
		System.out.println("Befort sorting :\n" + employees);

		
		Collections.sort(employees, (e1, e2) -> (e1.geteNo() > e2.geteNo()) ? +1 : (e1.geteNo() < e2.geteNo()) ? -1 : 0);
		System.out.println("Shorting according to Assending Shoting order:\n" + employees);

		
		Collections.sort(employees, (e1, e2) -> (e1.geteNo() > e2.geteNo()) ? -1 : (e1.geteNo() < e2.geteNo()) ? +1 : 0);
		System.out.println("Shorting according to Desending Shoting order:\n" + employees);

	
	}
	
}
