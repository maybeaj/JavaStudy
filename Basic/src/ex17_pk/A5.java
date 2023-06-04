package ex17_pk;
import ex17.*;

public class A5 {

	public static void main(String[] args) {
		A1 o = new A1();
		//System.out.println(o.a); // 접근불가능
		System.out.println(o.b); // 접근가능
		//System.out.println(o.c); // 접근불가능
		//System.out.println(o.d); // 접근불가능
  
		//o.am(); // 접근불가능
		o.bm(); // 접근가능
		//o.cm(); // 접근불가능
		//o.dm(); // 접근불가능
	}
}
