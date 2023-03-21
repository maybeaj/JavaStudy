package day3_접근지정자.extend;

public class A {
	private int result1;
	public int add(int x, int y) {
		result1 = x + y;
		return result1;
	}
	public int sub(int x, int y) {
		result1 = x - y;
		return result1;
	}
}

class B extends A {
	private int result2;
	public int multi(int x, int y) {
		result2 = x * y;
		return result2;
	}
	public int divide(int x, int y) {
		result2 = x / y;
		return result2;
	}
}
