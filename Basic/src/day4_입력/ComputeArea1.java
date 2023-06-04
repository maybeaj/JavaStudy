package day4_입력;
import java.util.Scanner;

public class ComputeArea1 {

	public static void main(String[] args) {
		final double PI = 3.14;
		double radius, area;
		Scanner scan = new Scanner(System.in);
		System.out.println("원의 반지름:");		
		radius = scan.nextDouble();
		area = PI * radius * radius;

		System.out.println("원의 반지름은 "+ radius + "이다.");
		System.out.println("원의 면적은 "+ area + "이다.");
	}

}
