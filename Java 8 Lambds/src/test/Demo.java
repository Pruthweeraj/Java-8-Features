package test;

public class Demo {

	public static void main(String[] args) {

		xyz i = () -> System.out.println("Hi pr");
		i.m1();

		abc a = s -> s.length();
		System.out.println(a.length("Pruthweeraj panda"));
		
		mno m = v -> v * v;
		System.out.println(m.squreOf(20));
	}

}
