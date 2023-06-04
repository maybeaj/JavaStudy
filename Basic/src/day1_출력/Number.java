package day1_출력;
import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		int MAX,MIN;
		Scanner scan = new Scanner(System.in);
		int num[] = new int[5];
		for(int i = 0;i<5;i++) {
			num[i] = scan.nextInt();
		}
		MAX = num[0];
		MIN = num[0];
		for(int i = 1; i<5;i++) {
			if(num[i]>MAX)
				MAX=num[i];
			else if(num[i]<MIN)
				MIN=num[i];
	}
		System.out.print("정수값: ");
		for(int i = 0;i<5;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println("최댓값: "+MAX);
		System.out.println("최솟값: "+MIN);

}
}
