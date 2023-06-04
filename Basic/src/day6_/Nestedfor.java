package day6_;

public class Nestedfor {
	   public static void main(String[] args) {
		int i, j;
		for( i = 1 ; i < 4 ; i++ ) {
			for( j = 1 ; j < 3 ; j++ ) {
				System.out.printf("i = %d j = %d \n", i, j);
			}
			System.out.printf("------------------\n");
		}
	    }
	}

