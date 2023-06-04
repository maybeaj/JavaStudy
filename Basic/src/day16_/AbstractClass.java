package day16_;
abstract class Shape {   // 추상클래스 선언
	  abstract void draw();    // 추상메소드 선언
	}
	class Circle extends Shape {
	  void draw() {
	    System.out.println("원을 그리는 기능");
	  }
	}
	class Rectangle extends Shape {
	  void draw() {
	    System.out.println("사각형을 그리는 기능");
	  }
	}
	class Triangle extends Shape {
	  void draw() {
	    System.out.println("삼각형을 그리는 기능");
	  }
	}

	class AbstractClass {
		  public static void main(String args[]) {
		    Circle c = new Circle();
		    c.draw();
		    Rectangle r = new Rectangle();
		    r.draw();
		    Triangle t = new Triangle();
		    t.draw();
		    System.out.println("====객체 형변환과 오버라이딩을 이용====");
		    Shape s = new Circle();        // 객체 형변환
		    s.draw();                  
		    s = new Rectangle();
		    s.draw();                  
		    s = new Triangle();
		    s.draw();                  
		  }
		}
