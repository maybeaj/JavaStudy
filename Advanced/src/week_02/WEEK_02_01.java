package week_02;
class Animal{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	
}
public class WEEK_02_01 {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.setName("해피");
		System.out.println(dog.getName());

	}

}
