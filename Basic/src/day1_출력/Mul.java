package day1_출력;

public class Mul {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int mul = 1;
		for (int i = 0; i<10;i++) {
			mul *= arr[i];
		}
		System.out.println("값은: "+mul);

	}

}
