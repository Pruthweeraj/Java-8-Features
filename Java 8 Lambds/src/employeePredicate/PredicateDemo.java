package employeePredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		populate(employees);
		
		Predicate<Employee> p1 = employee -> employee.getDesignation().equals("Employee");
		System.out.println("All Employees are:");
		display(p1 , employees);
		
		Predicate<Employee> p5 = employee -> employee.getDesignation().equals("Manager");
		System.out.println("All Employees are:");
		display(p1 , employees);
		
		Predicate<Employee> p2 = employee -> employee.getSalary() < 30000;
		System.out.println("All Employees less that 30000:");
		display(p2 , employees);
		
		Predicate<Employee> p3 = employee -> employee.getDesignation().equals("Manager") && employee.getLocation().equals("Bhubaneswar");
		System.out.println("All Bhubaneswar Managers are:");
		display(p3 , employees);
		
		System.out.println("All Employees lessthan 30000:");
		display( p1.and(p2), employees);
		
		System.out.println("Manager or  higher than 30000:");
		display( p5.or((p2).negate()), employees);

		
		Predicate<Employee> p6 = employee -> employee.getDesignation().equals("CEO");
		System.out.println("CEO of the company :");
		Employee emp1 = new Employee("pukuna", "CEO", 49000d, "Delhi");
		Employee emp2 = new Employee("Susant", "Manager", 49000d, "Delhi");
		System.out.println(p6.test(emp1));
		System.out.println(p6.test(emp2));
		
	}

	private static void display(Predicate<Employee> predicate, List<Employee> employees) {
		for(Employee employee :employees) {
			if(predicate.test(employee)) {
				System.out.println(employee);
			}
		}
		System.out.println("*********************************");

	}

	private static void populate(List<Employee> employees) {
		employees.add(new Employee("Pr", "CEO", 45000d, "Bhubaneswar"));
		employees.add(new Employee("Pruthweeraj", "Manager", 40000d, "Chennai"));
		employees.add(new Employee("Sagar", "Manager", 29000d, "Bhubaneswar"));
		employees.add(new Employee("Swati", "Employee", 32000d, "Bangalore"));
		employees.add(new Employee("Pupa", "Employee", 20000d, "Bangalore"));
		employees.add(new Employee("Debash", "Employee", 21000d, "Chennai"));
		employees.add(new Employee("Subhasmita", "Manager", 35000d, "Bhubaneswar"));
		employees.add(new Employee("Sonali", "Employee", 23000d, "Chennai"));
		employees.add(new Employee("susu", "TeamLead", 23000d, "Chennai"));
	}
}
