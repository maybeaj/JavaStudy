package day1_출력;
import java.util.Scanner;
public class Grade {

	
	public static void main(String[] args) {
	int i,h,sum=0;
	int num[] = new int[10];
	int ans[][] = {
			{ 1,3,1,1,4,1,1,1,2,1},
			{4,1,1,1,1,1,2,1,1,2},
			{1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1}};

	Scanner in = new Scanner(System.in);
	System.out.println("답안입력 :");
	for(i=0; i<10; i++) {
		num[i] = in.nextInt();
		}
		for(h=0; h<5; h++) {
			sum=0;
		for(i=0; i<10; i++) {
			if(num[i]==ans[h][i]) {
				sum++;
				}
			}
		System.out.println("학생"+(h+1)+"의 점수="+sum);
		}
	}
}


