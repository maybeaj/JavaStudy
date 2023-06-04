package day8_;

class TwoArray {
	  public static void main(String args[]) {
	    int two_array[][]= new int[4][5];
	    int i, j, k = 0;
	    int sum = 0;

	    for(i=0; i<4; i++) 
	      for(j=0; j<5; j++) {
	        two_array[i][j] = k;
	        k++;
	      }//초기화
	    for(i=0; i<4; i++) 
	      for(j=0; j<5; j++) {
	    	  sum += two_array[i][j];
	      }  
	      System.out.println("sum = " + sum );
	    
	  }
	}
