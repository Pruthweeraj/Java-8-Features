package predicate;

import java.util.function.Predicate;

public class Pop {

	public static void main(String[] args) {
		
		SoftwareEngineer[]  softwareEngineers = { new SoftwareEngineer("Pr", 21, false) ,
									new SoftwareEngineer("Pupa", 20, true),
									new SoftwareEngineer("Gourab", 21, true),
									new SoftwareEngineer("vivek", 22, true),
									new SoftwareEngineer("sagar", 17, true)};
		
		Predicate<SoftwareEngineer> allowedPredicate = softwareEngineer -> softwareEngineer.getAge() >=18 && softwareEngineer.isHavingGF() ;
		
		for (SoftwareEngineer softwareEngineer : softwareEngineers) {
			if(allowedPredicate.test(softwareEngineer)) {
				System.out.println("Allowed Software enginners are :"+softwareEngineer);
			}
		}
  		
	}
}
