package day9_;

class Point {
	int xPosition;
	int yPosition;
      Point(int x, int y) {
     		 xPosition = x;
    		 yPosition = y;
  	  }
	void move(int x, int y){
		xPosition = x;
		yPosition = y;
	}
}
public class PointMove {
	public static void main(String[] args) {
		Point point1 = new Point(12,16);  // 객체 생성
        System.out.println("x = " + point1.xPosition + " y = " + point1.yPosition);
		point1.move(10,10);            // 메시지
		System.out.print("x = " + point1.xPosition + " y = " + point1.yPosition);
	}
}
