package day15_;

class A5 {
	  int i, j;
	  A5(int a, int b) {//생성자
	    i = a;
	    j = b;  //초기화
	  }
	  void show() {
	    System.out.println("상위클래스의 메소드 show() 수행");
	}}
	class B5 extends A5 {
	  int k;//속성변수
	  B5(int a, int b, int c ) {//생성자
	    super(a,b);   // 상위 클래스의 생성자를 호출
	    k = c;  //k를 c로 초기화
	  }
	  void show() {
	    System.out.println("하위 클래스의 메소드 show() 수행");
	    System.out.println("===super를 이용한 상위 클래스 메소드 호출===");    
	    super.show();
	}}
	class OverrideExam3 {
	  public static void main(String args[]) {
	    B5 over1 = new B5(10, 20, 30);
	    System.out.println("i, j, k의 값 : " + over1.i + " " + over1.j + " " + over1.k);
	    over1.show();
	}}

