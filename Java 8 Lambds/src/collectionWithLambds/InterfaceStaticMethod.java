package collectionWithLambds;

interface Interf2 {
	public static void m1() {
		System.out.println("Interface static method called");
	}

}

public class InterfaceStaticMethod {

	public static void main(String[] args) {

		//InterfaceStaticMethod obj = new InterfaceStaticMethod();

		// obj.m1(); CE
		// InterfaceStaticMethod.m1(); CE

		Interf2.m1();
	}
}
