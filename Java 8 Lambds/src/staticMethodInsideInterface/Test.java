package staticMethodInsideInterface;

public class Test {
	public static void main(String[] args) {

		// Calling interface static method
		/*
		 * Test test = new Test(); test.m1(); Test.m1();
		 *  CE :because Interface static methods are not available to there implementation classes
		 */
		Interf.m1();
	}
}
