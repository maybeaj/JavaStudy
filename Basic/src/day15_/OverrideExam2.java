package day15_;

class A {
	  void show() {
	    System.out.println("상위클래스의 메소드 show(String str) 수행 ");
	  }
	}

	class B extends A {
	  void show() {
	    System.out.println("하위클래스의 메소드 show() 수행");
	  }
	}  
	class OverrideExam2 {
	  public static void main(String args[]) {
	    B over = new B();
	    over.show(); 
	  }
	}
