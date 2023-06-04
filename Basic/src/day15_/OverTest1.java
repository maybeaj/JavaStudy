package day15_;
class C1{
	static String x="파이팅 자바";
	 void write1() {
		System.out.println(x);
	}
}
class C2 extends C1{
	void write2() {
		System.out.println(x);
	}
}
public class OverTest1 {

	public static void main(String[] args) {
		C2 o = new C2();
		o.write1();
		o.write2();
	}

}
