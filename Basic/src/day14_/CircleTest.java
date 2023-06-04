package day14_;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		int x,y,r;
		Scanner scan = new Scanner(System.in);
		x=scan.nextInt();
		y=scan.nextInt();
		r=scan.nextInt();
		Circle obj = new Circle(x,y,r);
		obj.printCenter();
		System.out.println("AREA = " + obj.calArea());
		obj.circleMove(100,100);
		obj.printCenter();
	}

}
