package day12_;
class Fruit1 {
	  int apple;
	  int straw;
	  int grapes;
	  int sum;
	  Fruit1(int apple, int straw, int grapes) {
	    this.apple = apple ;
	    this.straw = straw ;
	    this.grapes = grapes ;
	  }
	  public int count() {
	    sum = apple + straw + grapes;
	    return sum;
	 }}


class MethodDemo  {
	  public static void main(String[] args) {
	    int total;
	    Fruit1 f1 = new Fruit1(30, 30, 30);
	    total = f1.count();
	    System.out.println("객체 f1의 총 개수 = " + total);
	    System.out.println("객체 f1의 apple 개수 = " + f1.apple);
	    System.out.println("객체 f1의 straw 개수 = " + f1.straw);
	    System.out.println("객체 f1의 grapes 개수 = " + f1.grapes);
	    f1.apple = 1000; 
	    System.out.println("객체 f1의 apple 개수 = " + f1.apple);// 속성 값 수정 가능
	}}

