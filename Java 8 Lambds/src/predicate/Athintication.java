package predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class Athintication {
 
	public static void main(String[] args) {
		
		Predicate<User> authenticationPredicate = user -> user.getUserName().equals("Pr") && user.getPassword().equals("Pupa");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the User Name");
		String userName = scanner.nextLine();
		
		System.out.println("Enter the password");
		String password = scanner.nextLine();
		
		User user = new User(userName, password);
		
		
		if(authenticationPredicate.test(user)) {
			System.out.println("Valid User and ger All access");
		}else {
			System.out.println("Not Valid User , Please try again..!!");
		}
	}
}
