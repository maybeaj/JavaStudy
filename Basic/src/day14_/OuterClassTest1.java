package day14_;

public class OuterClassTest1 {
	public static void main(String[] args) {
		OuterClass1 obj = new OuterClass1();
		OuterClass1.InnerClass obj1 = obj.new InnerClass(); // 내부클레스 객체 생성
		System.out.println(obj1.s);
		obj1.show1();
	}
}

