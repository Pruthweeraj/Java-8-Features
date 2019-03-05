package collectionWithLambds;

public class DefaultMethodDemo implements interf {

	public static void main(String[] args) {

		DefaultMethodDemo demo = new DefaultMethodDemo();
		demo.m1();

	}

	public void m1() {
		System.out.println("Overriding the m1() method");
		interf.super.m1();
	}
}
