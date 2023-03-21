package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Dwarf {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = 9;
		int person[] = new int[N];
		
		int sumV = 0;
				for ( int i=0 ; i<9 ; i++) {
					person[i] = Integer.parseInt(br.readLine());
					sumV += person[i];
				}
				
				for(int i =0; i<N-1; i++) {
					for(int j =i+1; j<N;j++) {
						if(sumV - person[i] - person[j] == 100) {
							person[i] = -1;
							person[j] = -1;
						}
					}
				}
               Arrays.sort(person); //[-1, -1, 난쟁이1, 난쟁2, 난쟁3, ]
	
	    for (int i =2; i <N; i++) {
		System.out.println(person[i]);
	}

	}
	
}
