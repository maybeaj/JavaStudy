package day11_;

class Box {
	  int width;
	  int height;
	  int depth;
	  long idNum;
	  static long boxID = 0; //static 없으면 객체 생성 될 때마다 0됨. 
	  public Box() {
	    idNum = boxID++;
	  }
	} 
	class StaticDemo {
	  public static void main(String args[]) {
	    Box mybox1 = new Box();
	    Box mybox2 = new Box();
	    Box mybox3 = new Box();
	    Box mybox4 = new Box();
	    System.out.println("mybox1의 id 번호 : " + mybox1.idNum);
	    System.out.println("mybox2의 id 번호 : " + mybox2.idNum);
	    System.out.println("mybox3의 id 번호 : " + mybox3.idNum);
	    System.out.println("mybox4의 id 번호 : " + mybox4.idNum);
	    System.out.println("전체 박스의 개수는 "+ Box.boxID + "입니다.");
	  }}
