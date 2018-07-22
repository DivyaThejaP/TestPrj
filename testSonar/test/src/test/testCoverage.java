package test;

public class testCoverage {
	
	public static void main() {
		mthd1();
	}
	public static void mthd1() {
//throw new IllegalArgumentException();
		mthd2();
	}
	
	public static void test() {
		System.out.println("testing");
	}
	public static void mthd2() {
		test();
		//throw new IllegalArgumentException();
	}
}
