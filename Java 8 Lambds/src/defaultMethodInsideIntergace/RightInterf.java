package defaultMethodInsideIntergace;

public interface RightInterf {

	public default void m1() {
		System.out.println("RightInterf m1()  method called");
	}
}
