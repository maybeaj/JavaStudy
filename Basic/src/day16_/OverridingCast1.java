package day16_;

class A {
	  int  k = 0;                  
	  void callme() {
	    System.out.println("클래스 A의 callme() 메소드 실행");
	  }}
	class B extends A {
	  int  g = 10;
	  void callme() {                //오버라이딩 된 메소드
	    System.out.println("클래스 B의 callme() 메소드 실행");
	  }}
	class OverridingCast1 {
	  public static void main(String args[]) {
	    A r1 = new A();
	    r1.callme();
	    r1 = new B();
	    r1.callme();
	    System.out.println("r1.k의 값은 "+ r1.k); //선언이 A class
	    //System.out.println("r1.g의 값은 "+ r1.g);   // 에러
	}}
