package day14_;
public class OuterClass {
	private int value = 10;
	class InnerClass {
		public void myMethod() {
			System.out.println("value = " + value);
		}	
	}
	OuterClass () {
		InnerClass obj = new InnerClass();   // 내부 클래스 객체 생성
		obj.myMethod();
	}
}


