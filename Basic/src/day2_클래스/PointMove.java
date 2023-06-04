package day2_클래스;


import day10_.*;

public class PointMove {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.move(10,10);
		
		System.out.print("x = " + point1.xPosition + " y = " + point1.yPosition);
		//System.out.println("execution");
	}

}
