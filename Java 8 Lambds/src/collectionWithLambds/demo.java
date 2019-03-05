package collectionWithLambds;

public class demo {

	int x = 142;
	int y = 333;
	
	public void foo() {
		int x = 100;
		System.out.println(x);
		System.out.println(this.x);
	}
	
	public static void main(String[] args) {
		demo o = new demo();
		o.foo();
	}
}
