package day1_출력;

public class ArrMul {
    public static void main(String[] args) {
        int[][] arr = {{2, 3}, {4, 5}, {6, 7}};//3행 2열
        
        for (int i = 0; i < 3; i++) {//행
            int product = 1;//초기화
            for (int j = 0; j < 2; j++) {//열
                product *= arr[i][j];
            }
            System.out.println("Product of row " + (i+1) + " = " + product);
        }
    }
}