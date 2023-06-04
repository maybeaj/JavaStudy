package day1_출력;
import java.util.Scanner;
public class Six {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("데이터 : ");
        int num1 = sc.nextInt();
        String op = sc.next();
        int num2 = sc.nextInt();
        
        double result;
        switch (op) {
            case "+":
                result = num1 + num2;
                System.out.println("결과는 " + result + "입니다.");
                break;
            case "-":
                result = num1 - num2;
                System.out.println("결과는 " + result + "입니다.");
                break;
            case "*":
                result = num1 * num2;
                System.out.println("결과는 " + result + "입니다.");
                break;
            case "/":
                result = (double) num1 / num2;
                System.out.println("결과는 " + result + "입니다.");
                break;
            default:
                System.out.println("올바른 연산자가 아닙니다.");
                break;
        }

	}

}
