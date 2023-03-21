package day1_출력;

public class Sum {

	public static void main(String[] args) {
//		int i, odd = 0, even = 0;	못된 코드
		
		int odd = 0;
		int even = 0;
		
		for(int i = 1; i <=100; i++){
			if(i % 2 == 0) {
//				even = even + i;
				even += i;
			}else {
//				odd = odd + i;
				odd += i;
			}
		}
		System.out.println("even = " + even + " " + "odd = " + odd);	// JAVA
		
		System.out.printf("even = %d odd = %d \n", even, odd);		// C언어
	
	}
	
}
