package day4_입력;

public class ComputeArea {

	public static void main(String[] args) {
		final double PI = 3.14;
		double area = 0;
		int radius = Integer.parseInt(args[0]); //run configurations Arguments에 인자 넣기
		
		area = PI * radius * radius;
		
		System.out.println("원의 반지름은 "+ radius + "이다.");
		System.out.println("원의 면적은 "+ area + "이다.");
	}

}
