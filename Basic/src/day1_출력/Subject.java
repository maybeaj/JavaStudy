package day1_출력;

public class Subject {

	public static void main(String[] args) {
		int score;
		int sum = 0;
		float avg;
		char grade;
		for ( int i= 0; i<3;i++) {
			score = Integer.parseInt(args[i]);
			sum +=score;			
		}
		avg =sum/3;
		if(avg>=90)
			grade='A';
		else if (avg>=80)
			grade ='B';
		else grade ='C';
		System.out.println("총점은 "+sum+"평균: "+avg+"등급: "+grade);
	}

}
