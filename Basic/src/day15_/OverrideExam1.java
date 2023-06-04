package day15_;
class A1 {
	  void show(String str) {
	    System.out.println("상위클래스의 메소드 show(String str) 수행 " + str);
	  }
	}
	class B4 extends A1 {
	  void show() {
	    System.out.println("하위클래스의 메소드 show() 수행");
	  }
	}
	class OverrideExam1 {
	  public static void main(String args[]) {
	    B4 over = new B4();
	    over.show("알기쉽게 해설한 자바"); 
	    over.show();
	  }
	}
