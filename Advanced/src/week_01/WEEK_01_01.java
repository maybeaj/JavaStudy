package week_01;
class Calculator{
	float result = 0;
	
		float add(float num) {
			result += num;
			return result;
		}
		
		float sub(float num) {
			result -= num;
			return result;
		}
		
		float mul(float num) {
			result *= num;
			return result;
		}
		
		float div(float num) {
			result /= num;
			return result;
		}
}


public class WEEK_01_01 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		
		System.out.println(cal.add(3));
		System.out.println(cal.sub(7));
		System.out.println(cal.mul(3));
		System.out.println(cal.div(7));
	}

}
