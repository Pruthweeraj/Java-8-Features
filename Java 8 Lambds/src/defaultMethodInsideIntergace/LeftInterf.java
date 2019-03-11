package defaultMethodInsideIntergace;

public interface LeftInterf {

	public default void m1() {
		System.out.println("LeftInterf m1()  method called");
	}
}
