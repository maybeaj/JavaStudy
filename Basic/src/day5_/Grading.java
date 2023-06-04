package day5_;
import java.util.Scanner;
public class Grading {
	public static void main (String[] args) {
		char grade;
		Scanner a = new Scanner(System.in);
		while (a.hasNext()){	//다음 데이터를 가지냐 안가지냐 판단 메소드 스캐너메소드 중 하나)
		int score = a.nextInt();
		if ( score >= 90.0 ) 
			grade = 'A';
		else if(score >= 80.0)
			grade = 'B';
		else if(score >= 70.0)
			grade = 'C';
		else if(score >= 60.0)
			grade = 'D';
		else
			grade = 'F';
		System.out.println("학점은 " + grade + "입니다.");
		

		}
	}
}
