public class Grading {

	public static void main(String[] args) {
		int answer[][] = {
				{1, 3, 2, 4, 3, 1, 4, 2, 2, 1 },
				{3, 2, 4, 2, 2, 1, 1, 3, 4, 1 },
				{2, 4, 3, 2, 1, 2, 1, 3, 3, 4 },
				{2, 3, 3, 1, 1, 3, 2, 2, 4, 4 },
				{3, 1, 1, 2, 4, 1, 2, 3, 1, 3 }};
		int [] dap = new int [10];
		for ( int i = 0; i < 10; i++)
			 dap[i] = Integer.parseInt(args[i]);
		for (int i = 0; i < 5; i++) {
			int score=0;
			for(int j = 0 ; j < 10; j++) {
				if( answer[j] == dap ) {					
					score++;
			}
			System.out.println("학생" + (i + 1) +"의 점수 : " + score + "점");
		}

	}

}
}