package day1_출력;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        double mean = (double)sum / n;
        
        System.out.println("n = " + n);
        System.out.println("sum = " + sum);
        System.out.println("mean = " + mean);
    }
}