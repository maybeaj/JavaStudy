package day7_;

public class OneArray {
public static void main(String[] args) {
  int a[]= new int[4];
  int i, k = 0, sum = 0;

    for(i=0; i<4; i++) {
        a[i] = k;
        k++;
      }
    for(i=0; i<4; i++) {
    	sum += a[i];  
   }
    System.out.print("sum =  " + sum);
 }
}

