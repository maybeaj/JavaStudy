package week_02.polymorphism;
abstract class Figure {
	abstract void draw();
}
class Triangle extends Figure {
	protected void draw() {
		System.out.println("다형성 : 삼각형을 그린다");
	}
}

class Rectangle extends Figure {
	public void draw() {
		System.out.println("다형성 : 사각형을 그린다");
	}
}
class Oval extends Figure {
	public void draw() {
		System.out.println("다형성 : 타원형을 그린다");
	}
}
class Polydraw {
	public void pdraw(Figure f) {
		f.draw();
	}
	
}
public class WEEK_02_03 {

	public static void main(String[] args) {
		Polydraw p = new Polydraw();
		
		Figure fg1 = new Triangle();
		Figure fg2 = new Rectangle();
		Figure fg3 = new Oval();
		
		p.pdraw(fg1);
		p.pdraw(fg2);
		p.pdraw(fg3);

	}

}
