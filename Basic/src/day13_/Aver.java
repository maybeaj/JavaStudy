package day13_;
class FindAver{
	double getAverage(int num1, int num2, int num3) {
		double aver;
		aver = (num1+num2+num3)/3.0;
		return aver;
	}
}
public class Aver {

	public static void main(String[] args) {
		int num1, num2, num3;
		double aver;
		FindAver obj = new FindAver();
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		num3 = Integer.parseInt(args[2]);
		aver = obj.getAverage(num1, num2, num3);
		System.out.println("세 정수의 평균: "+aver);
	}

}
//reference로 바꿀려면 배열 사용해야 함. 배열은 참조~
