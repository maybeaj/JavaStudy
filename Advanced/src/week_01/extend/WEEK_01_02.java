package week_01.extend;
class Animal {
	String name;
}
class Cat extends Animal { //Animal 클래스를 상속한다
	
}
class Dog extends Animal { //Animal 클래스를 상속한다
	
}
public class WEEK_01_02 {

	public static void main(String[] args) {
		Cat cat = new Cat(); // Cat의 객체 생성
		cat.name = "나비";   // 객체.객체변수 = 값
		
		Dog dog = new Dog();
		dog.name = "해피";
		
		System.out.println(cat.name); // 객체: cat, 객체변수 :name
		System.out.println(dog.name); // 객체: dog, 객체변수: name

	}

}
