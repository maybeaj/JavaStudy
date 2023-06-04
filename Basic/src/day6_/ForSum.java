package day6_;

public class ForSum {

	public static void main(String[] args) {
		int i, sum;
		for (sum=0,i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.print(i);
			if(i == 10) {
				System.out.print("=" + sum);
			}else 
				System.out.print("+");
		}

	}

}
