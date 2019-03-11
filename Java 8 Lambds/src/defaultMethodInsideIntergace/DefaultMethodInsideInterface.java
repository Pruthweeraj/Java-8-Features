package defaultMethodInsideIntergace;

public class DefaultMethodInsideInterface implements LeftInterf, RightInterf {

	@Override
	public void m1() {
		System.out.println("My Own Implementation...!!"); // overriding the default implementation of the Interface
		LeftInterf.super.m1();
		RightInterf.super.m1();
	}

	public static void main(String[] args) {
		DefaultMethodInsideInterface test = new DefaultMethodInsideInterface();
		test.m1();
		
	}

}
